public class Main {
    public static void main(String[] args) {
        System.out.println("результат: " + equalNum(111));
        System.out.println("результат: " + equalNum(123));
    }
    public static boolean equalNum(int x)
    { int c=x%10;
        for (;x>0;x/=10)
        {
            if (x%10!=c) { return false;}
        }
        return true;
    }
}