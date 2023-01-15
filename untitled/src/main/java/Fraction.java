class Fraction {
    int num, denum;

    public Fraction(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    public String toString() {
        return num + "/" + denum;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Fraction)) {
            return false;
        }

        Fraction fraction = (Fraction)obj;

        return this.num == fraction.num && this.denum == fraction.denum;
    }

    @Override
    public Fraction clone() {
        return new Fraction(this.num, this.denum);
    }
}