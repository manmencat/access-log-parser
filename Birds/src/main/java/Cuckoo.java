
public class Cuckoo extends Birds {
    java.util.Random random = new java.util.Random();

    public Cuckoo(String name) {
        super(name);
    }

    // переопределение метода базового класса
    @Override
    public String sing() {
        return "Ку-ку";
    }
}
