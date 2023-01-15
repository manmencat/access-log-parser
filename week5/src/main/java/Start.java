public class Start {


    public class Birds {
        private String name;


        public Birds(String birdKind) {
            this.name = name;
        }

        public void sing() {
            System.out.println(toString());
        }

        @Override
        public String toString() {
            return name + ", умеет петь:";
        }
    }
    public class Sparrow extends Birds {
        public Sparrow(String name) {
            super(name);
        }
        // переопределение метода базового класса
        @Override
        public void sing() {
            System.out.println( toString() + "Чырык");
        }
    }

    public class Cuckoo extends Birds{

        public Cuckoo(String name) {
            super(name);
        }
        // переопределение метода базового класса
        @Override
        public void sing(){
            System.out.println(toString() + "ку-ку");
        }
    }
    public class Parrot extends Birds{

        public Parrot(String name) {
            super(name);
        }
        // переопределение метода базового класса
        @Override
        public void sing(){
            System.out.println(toString() + "Случайный текст");
        }
    }

}

public class Main {

    public static void main(String[] args) {
        Start.Birds Parrot = new Parrot("Кеша");

        Start.Birds Cuckoo = new Cuckoo("Кука");// восходящее преобразование к базовому типу
        Start.Birds Sparrow = new Sparrow("Джек"); // восходящее преобразование к базовому типу


        }
    }
}
