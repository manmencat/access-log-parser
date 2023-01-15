package Point;

public class Tochka {
    class Point{
        int x,y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    class Point2 extends Point {
        int z;
        public Point2(int x, int y, int z) {
            super(x, y);
            this.z = z;
        }
    }


}
