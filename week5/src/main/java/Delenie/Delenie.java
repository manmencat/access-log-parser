package Delenie;

public class Delenie {
    public static void main(String[] args) {
        Fraction d1 = new Fraction(1,3);
        Fraction d2 = new Fraction(2,5);
        Fraction d3 = new Fraction(7,8);
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
        System.out.println(d1.sum(d2).sum(d3).minus(5));
    }
}

