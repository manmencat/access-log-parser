package Student;

import java.util.ArrayList;
import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        Name davinci = new Name("Da Vinci");
        davinci.addScore(2);
        davinci.addScore(1);
        davinci.addScore(3);
        davinci.addScore(4);
        davinci.addScore(1);
        davinci.addScore(4);
        Name dicaprio = new Name("Di Caprio", Arrays.asList(5,2));
        dicaprio.addScore(4);
        System.out.println(dicaprio);
        System.out.println(davinci);
    }
}
