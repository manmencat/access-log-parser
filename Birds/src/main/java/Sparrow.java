public class Sparrow extends Birds {
    public Sparrow(String name) {
        super(name);
    }

    // переопределение метода базового класса
    @Override
    public String sing() {
        return "Чырык";
    }
}
