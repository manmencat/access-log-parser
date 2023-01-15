package ru.courses.geometry;

import java.util.Arrays;
import java.util.List;

public class Polyline {

    Tochka[] points;

    public Polyline(Tochka[] points) {
        this.points = points;
    }

    public Polyline() {
    }

    public List<Line> getLines() {


        return Arrays.asList(new Line(this.points[0], this.points[1]),
                new Line(this.points[1], this.points[2]),
                new Line(this.points[2], this.points[3])
        );

    }

    public int getLength() {
        int result = 0;
        for (int i = 0; i < this.getLines().size(); i++) {
            result = result + this.getLines().get(i).getLength();
        }
        return result;
    }

    @Override
    public String toString() {
        return "{" + Arrays.toString(points) +
                '}';
    }
}