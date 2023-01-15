package ru.courses.student;


import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Integer> scores = new ArrayList<>();

    public Student(String name) {
        this.name = name;
        if (name == "" || name == null)
            throw new IllegalArgumentException("Field Name will not empty");
    }

    public Student(String name, List<Integer> scores) {
        this(name);
        this.scores.addAll(scores);
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
        if (name == "" || name == null)
            throw new IllegalArgumentException("Field Name will not empty");
    }



    public void addScore(Integer score) {
        if ((score > 1) && (score < 6))
            scores.add(score);

    }

    @Override
    public String toString() {
        if (scores != null) {
            return name + ":" + scores;
        } else {
            return name + ":";
        }
    }
}
