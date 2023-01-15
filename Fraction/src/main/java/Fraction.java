public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("denominator is zero");
        }
        if (denominator < 0) {
            throw new IllegalArgumentException("denominator is negative");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fraction minus(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
        int cDenominator = nok(this.numerator, this.denominator);
        int cNumerator =
                this.numerator * (cDenominator / this.numerator) -
                        this.denominator * (cDenominator / this.denominator);
        Fraction c = new Fraction(cNumerator, cDenominator);
        return c;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction sum(Fraction fraction) {
        Fraction result = sum(fraction, this);
        return result;
    }

    public static int nok(int a, int b) {
        return a * b / nod(a, b);
    }

    public static int nod(int a, int b) {
        if (b == 0) {
            return a;
        }
        return nod(b, a % b);
    }

    public static Fraction sum(Fraction a, Fraction b) {
        int cDenominator = nok(a.denominator, b.denominator);
        int cNumerator =
                a.numerator * (cDenominator / a.denominator) +
                        b.numerator * (cDenominator / b.denominator);
        Fraction c = new Fraction(cNumerator, cDenominator);
        return c;
    }

    @Override
    public String toString() {
        return this.numerator + " / " + this.denominator;
    }
}
