public class Main {
    public static void main(String[] args) {
        rightTriangle(4);
    }
    public static void rightTriangle(int x)
    {
        for (int i = 1; i <= x; i++) {
            for (int sp = 1; sp <= x - i; sp++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}