import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = new Scanner(System.in).nextInt();
        double quotient = (double) firstNumber / secondNumber;
        System.out.println("Частное:" + quotient);
        int multiplication =  firstNumber * secondNumber;
        System.out.println("Произведение:" + multiplication);
        int sum = firstNumber + secondNumber;
        System.out.println("Сложение:" + sum);
        int dif = firstNumber - secondNumber;
        System.out.println("Разность:" + dif);

    }
}
