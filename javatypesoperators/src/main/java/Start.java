public class Start {
    public static void main(String[] args) {
//        Получаем исходные числа
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
//         Складываем
        int sum=x+y;
//          Выводим на экран
        System.out.println(x+ " + "+y+" = "+sum);
    }
}
