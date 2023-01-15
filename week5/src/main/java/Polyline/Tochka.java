package Polyline;

public class Tochka {
    Integer x, y;

    public Tochka(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Tochka{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}


