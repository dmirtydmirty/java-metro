import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Station {
    String name;
    List<Station> neighbors;
    Map<Station, Integer> distances;
    int x, y;

    Station(String name, int x,  int y) {
        this.name = name;
        this.neighbors = new ArrayList<>();
        this.distances = new HashMap<>();
        this.x = x*30;
        this.y = y*30;
    }

    void addNeighbor(Station station) {
        neighbors.add(station);
        distances.put(station, 1);
    }
}
