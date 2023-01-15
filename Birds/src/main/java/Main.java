public class Main {

    public static void main(String[] args) {
        Birds parrot = new Parrot("Кеша");
        Birds cuckoo = new Cuckoo("Кука");// восходящее преобразование к базовому типу
        Birds sparrow = new Sparrow("Джек"); // восходящее преобразование к базовому типу
        System.out.println(sparrow);

    }
}

