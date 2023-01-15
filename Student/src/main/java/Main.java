public class Main{
    public static void main(String[] args) {
        Student st1= new Student("Pete",new RuleChet());
        st1.addGrade(3);
        st1.addGrade(2);
        st1.addGrade(101);
        System.out.println(st1);
    }
}

class RuleChet implements Rule{
    public boolean check(int x) {
        return 0<x&&x<101&&x%2==0;
    }
}