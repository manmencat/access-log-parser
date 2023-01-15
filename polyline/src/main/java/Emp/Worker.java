package Emp;

public class Worker {
    private String name;
    private Department department;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    public String toString() {
        if(name.equals(department.chief.name)){
            return name + " начальник отдела " + department.name;
        }else {
            return name + " работает в отделе " + department.name + ", начальник которого " + department.chief.name;
        }
    }


}