import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private List<Path> paths = new ArrayList();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Path> getPaths() {
        return paths;
    }

    public void setPaths(List<Path> paths) {
        this.paths = paths;
    }

    public void addPath(Path path) {
        this.paths.add(path);
    }

    public void addPath(City city, int cost) {
        addPath(new Path(city, cost));
    }

    public City(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }

    public City travel(int n) {
        if (n > 0 && paths != null && !paths.isEmpty()) {
            Path path = paths.get(0);
            City city = path.getCity();
            return travel(n, city);
        }
        return null;
    }

    public City travel(int n, City city) {
        List<Path> paths = city.getPaths();
        if (n > 0 && paths != null && !paths.isEmpty()) {
            n--;
            if (n == 0) {
                return city;
            } else {
                return
                        travel(n, paths.get(0).getCity());
            }
        }
        return city;
    }
}
