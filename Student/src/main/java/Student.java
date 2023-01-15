import java.util.ArrayList;
import java.util.List;

interface Rule{
    boolean check(int x);
}
class Student{
    String name;
    private List<Integer> grades = new ArrayList<>();
    private Rule rule;
    public Student(String name, Rule rule) {
        this.name = name;
        this.rule = rule;
    }
    public void addGrade(int x){
        if(rule.check(x)) grades.add(x);
    }
    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }
    @Override
    public String toString() {
        return "Student{" + "name=" + name
                + ", grades=" + grades + '}';
    }


}
