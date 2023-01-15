package ru.courses.geometry;

public class Line {

    public Tochka begin;
    public Tochka end;

    // Создание объекта-линии на основе точек
    Line(Tochka begin, Tochka end) {
        this.begin = new Tochka(begin.x, begin.y);
        this.end = new Tochka(end.x, end.y);
    }

    public int getLength() {
        int dx = end.x - begin.x;
        int dy = end.y - begin.y;
        return (int) Math.round(Math.sqrt(dx * dx + dy * dy));
    }

    @Override
    public String toString() {
        return "Line{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
}
