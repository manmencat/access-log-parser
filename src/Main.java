import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String path;
        int count = 0;
        while (true) {
            System.out.println("Введите путь к файлу и нажмите <Enter>:");
            path = new Scanner(System.in).nextLine();
            File file = new File(path);

            boolean pathOfFile = file.exists();
            boolean isNotDirectory = !file.isDirectory();
            if (pathOfFile && isNotDirectory) {
                System.out.println("Путь к файлу является правильным");
                System.out.println("Это файл №" + ++count);
                try {
                    FileReader fileReader = new FileReader(path);
                    BufferedReader reader =
                            new BufferedReader(fileReader);

                    String line;
                    int linesCount = 0;
                    int googleBotCount = 0;
                    int yandexBotCount = 0;
                    while ((line = reader.readLine()) != null) {
                        int length = line.length();

                        if (length > 1024) {
                            throw new RuntimeException("Length of line > 1024");
                        }

                        char bracket = '"';
                        int[] bracketIndices = new int[6];
                        bracketIndices[0] = line.indexOf(bracket);
                        bracketIndices[1] = line.indexOf(bracket, bracketIndices[0] + 1);
                        bracketIndices[2] = line.indexOf(bracket, bracketIndices[1] + 1);
                        bracketIndices[3] = line.indexOf(bracket, bracketIndices[2] + 1);
                        bracketIndices[4] = line.indexOf(bracket, bracketIndices[3] + 1);
                        bracketIndices[5] = line.indexOf(bracket, bracketIndices[4] + 1);

                        String thirdBrackets = line.substring(bracketIndices[4], bracketIndices[5]);

                        String[] parts = thirdBrackets.split(";");
                        for (int i = 0; i < parts.length; i++) {
                            parts[i] = parts[i].trim();
                        }
                        if (parts.length >= 2) {
                            String fragment = parts[1];

                            int slashIndex = fragment.indexOf('/');
                            if (slashIndex > 0) {
                                String bot = fragment.substring(0, slashIndex);
                                if (bot.equalsIgnoreCase("Googlebot")) {
                                    googleBotCount++;
                                } else if (bot.equalsIgnoreCase("YandexBot")) {
                                    yandexBotCount++;
                                }
                            }
                        }

                        linesCount++;
                    }

                    System.out.println("Lines count: " + linesCount);
                    System.out.println("GoogleBot count: " + googleBotCount + " (" + ((double)googleBotCount / (double)linesCount * 100.0) + "%)");
                    System.out.println("YandexBot count: " + yandexBotCount + " (" + (double)yandexBotCount / (double)linesCount * 100.0 + "%)");
                } catch (FileNotFoundException e) {
                    System.out.println(e.fillInStackTrace());
                } catch (IOException e) {
                    System.out.println(e.fillInStackTrace());

            }


        }
            else {
                System.out.println("Файл отсутствует или путь ведет к директории файла");
            }
    }
}}