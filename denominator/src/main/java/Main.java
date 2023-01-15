public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1,3);
        Fraction fraction2 = new Fraction(2,5);
        Fraction fraction3 = new Fraction(7,8);
        Fraction minus = new Fraction(5);
        System.out.println(fraction1.toString() +" + " + fraction2.toString() + " + " + fraction3.toString() + " - " + 5 + " = " + fraction1.sum(fraction2).sum(fraction3).min(minus));
    }
}

