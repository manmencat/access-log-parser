package Frac;

public class Start {
    public static void main(String[] args) {
    Fraction Fra = new Fraction(1,3);
    Fraction Fra2 = new Fraction(2,5);
    Fraction Fra3 = new Fraction(7,8);
    double a = Fra.print();
    double b = Fra2.print();
    double c = Fra3.print();
    System.out.println(a+b+c-5);

    }
}