package Student;

import java.util.ArrayList;
import java.util.List;

public class Name {

    private String name;
    private List<Integer> scores = new ArrayList<>();

    public Name(String name) {
        this.name = name;
        if (name == "" || name == null)
            throw new IllegalArgumentException("Field Name will not empty");
    }

    public Name(String name, List<Integer> scores) {
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
