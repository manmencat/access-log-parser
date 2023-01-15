package Emp;

public class Department {
    public String name;
    public Worker chief;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Worker getChief() {
        return chief;
    }

    public void setChief(Worker chief) {
        this.chief = chief;
    }
}