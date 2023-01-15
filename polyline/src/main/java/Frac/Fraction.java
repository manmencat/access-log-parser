package Frac;

public class Fraction {
    private int numerator;
    private int denumerator;


    public Fraction (int x, int y) {
        this.numerator = x;
        if (y<0)
            throw new IllegalArgumentException("y must be positive");
        this.denumerator = y;
    }
    public double print() {
        return (double) numerator/denumerator;
    }


}
