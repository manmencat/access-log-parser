package ru.courses.student;

import java.util.ArrayList;
import java.util.Arrays;

public class Start {
     {
        Student davinci = new Student("Da Vinci");
        davinci.addScore(2);
        davinci.addScore(1);
        davinci.addScore(3);
        davinci.addScore(4);
        davinci.addScore(1);
        davinci.addScore(4);
        Student dicaprio = new Student("Di Caprio", Arrays.asList(5,2));
        dicaprio.addScore(4);
        System.out.println(dicaprio);
        System.out.println(davinci);
    }
}
