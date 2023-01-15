package ru.courses.main;

import ru.courses.workers.*;


public class Main {
    public static void main(String[] args) {
        Dep it = new Dep();
        it.name = "IT";
        Worker dicaprio = new Worker();
        dicaprio.name = "Ди Каприо";
        dicaprio.dep = it;
        Worker davinci = new Worker();
        davinci.name = "Да Винчи";
        davinci.dep = it;
        Worker swift = new Worker();
        swift.name = "Свифт";
        swift.dep = it;
        it.chief = davinci;
        System.out.println(dicaprio);
        System.out.println(davinci);
        System.out.println(swift);
    }
}

