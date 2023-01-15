package Emp;

public class Start {
    public static void main(String[] args) {
        Department it = new Department();
        it.setName("IT");
        Department art = new Department();
        art.setName("ART");
        Worker davinci = new Worker();
        davinci.setName("da Vinci");
        davinci.setDepartment(it);
        Worker dicaprio = new Worker();
        it.setChief(dicaprio);
        dicaprio.setName("di Caprio");
        dicaprio.setDepartment(it);
        System.out.println(davinci);
        System.out.println(dicaprio);
    }
}