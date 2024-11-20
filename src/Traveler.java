import java.util.List;

public class Traveler {
    String name;
    Station currentStation;

    Traveler(String name, Station station) {
        this.name = name;
        this.currentStation = station;
    }

    void moveTo(Station destination) {
        currentStation = destination;
        System.out.println(name + " переместился на станцию: " + currentStation.name);
    }

    List<Station> findShortestPath(MetroSystem system, Station destination) {
        return system.calculateShortestPath(currentStation, destination);
    }
}
