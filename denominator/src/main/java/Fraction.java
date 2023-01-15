public class Fraction {
    private int numerator, denominator;

    public Fraction(double decimal) {
        String stringNumber = String.valueOf(decimal);
        int numberDigitsDecimals = stringNumber.length() - 1 - stringNumber.indexOf('.');
        int denominator = 1;
        for (int i = 0; i < numberDigitsDecimals; i++) {
            decimal *= 10;
            denominator *= 10;
        }
        int numerator = (int) Math.round(decimal);
        int greatestCommonFactor = greatestCommonFactor(numerator, denominator);
        this.numerator = numerator / greatestCommonFactor;
        this.denominator = denominator / greatestCommonFactor;
    }

    public static int greatestCommonFactor(int num, int denom) {
        if (denom == 0) {
            return num;
        }
        return greatestCommonFactor(denom, num % denom);
    }

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

    public Fraction min(Fraction fraction) {
        Fraction result = min(this, fraction);
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

    public static Fraction min(Fraction a, Fraction b) {
        int cDenominator = nok(a.denominator, b.denominator);
        int cNumerator =
                a.numerator * (cDenominator / a.denominator) -
                        b.numerator * (cDenominator / b.denominator);
        Fraction c = new Fraction(cNumerator, cDenominator);
        return c;
    }

    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
}
