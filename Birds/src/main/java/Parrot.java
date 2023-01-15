public class Parrot extends Birds {

    public Parrot(String name) {
        super(name);
    }

    // переопределение метода базового класса
    @Override
    public String sing() {
        return "Случайный текст";
    }
}
