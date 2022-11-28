import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String path;
        int count =0;
        while (true) {
            System.out.println("Введите путь к файлу и нажмите <Enter>:");
            path = new Scanner(System.in).nextLine();
            File file = new File(path);

            boolean pathOfFile = file.exists();
            boolean isNotDirectory = !file.isDirectory();
            if (pathOfFile && isNotDirectory) {
                System.out.println("Путь к файлу является правильным");
                System.out.println("Это файл №" + ++count);
                continue;
            }
            System.out.println("Файл отсутствует или путь ведет к директории файла");
        }
    }
}

