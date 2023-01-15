package ru.courses.workers;


public class Worker {
    public String name;
    public Dep dep;

    public String toString() {
        if (name.equals(dep.chief.name)) {
            return name + " начальник отдела " + dep.name;
        } else {
            return name + " работает в отделе " + dep.name + ", начальник которого " + dep.chief.name;
        }
    }
}
