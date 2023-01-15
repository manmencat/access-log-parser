import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        City a = new City("A");
        City b = new City("B");
        City c = new City("C");
        City d = new City("D");
        City e = new City("E");
        City f = new City("F");
        a.addPath(f,1);
        a.addPath(b,5);
        a.addPath(d,6);
        b.addPath(c,3);
        b.addPath(a,5);
        c.addPath(b,3);
        c.addPath(d,4);
        d.addPath(c,4);
        d.addPath(e,2);
        d.addPath(a,6);
        e.addPath(f,2);
        f.addPath(f,2);
        f.addPath(b,1);
        System.out.println(b.travel(2));

    }
}


class Path {
    private City city;
    private int price;
    public Path(City city, int price) {
        this.city = city;
        this.price = price;
    }
    public City getCity() {
        return city;
    }
    public void setCity(City city) {
        this.city = city;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return city.getName() + ": " + price;
    }
}
