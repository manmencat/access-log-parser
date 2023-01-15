public abstract class Birds {
    public String name;
    public Birds(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name + ", умеет петь:" + sing();
    }


    // переопределение метода базового класса
    public abstract String sing();
}


