package ru.courses.geometry;

import java.util.List;

public class Start {
     {
        Tochka tochka1 = new Tochka(1, 5);
        Tochka tochka2 = new Tochka(2, 8);
        Tochka tochka3 = new Tochka(5, 3);
        Tochka tochka4 = new Tochka(8, 9);

        Line line1 = new Line(tochka1, tochka2);
        Line line2 = new Line(tochka2, tochka3);
        Line line3 = new Line(tochka3, tochka4);

        Polyline myPolyline = new Polyline(new Tochka[]{tochka1, tochka2, tochka3, tochka4});

        List<Line> lines = myPolyline.getLines(); // 3 DONE!
        System.out.println(lines.toString());
        System.out.println("Length of massive polyline: " + myPolyline.getLength());

        int sum3 = line3.getLength();
        int sum2 = line2.getLength();
        int sum1 = line1.getLength();

        System.out.println("Length of polyline: " + (sum3 + sum2 + sum1));

        tochka2.setX(12);
        tochka2.setY(8);
        lines = myPolyline.getLines();
        System.out.println(lines);

        line1 = new Line(tochka1, tochka2);
        line2 = new Line(tochka2, tochka3);
        line3 = new Line(tochka3, tochka4);

        sum3 = line3.getLength();
        sum2 = line2.getLength();
        sum1 = line1.getLength();
        System.out.println("Length of massive polyline: " + myPolyline.getLength());
        System.out.println("Length of polyline: " + (sum3 + sum2 + sum1));

    }

    ;
}

