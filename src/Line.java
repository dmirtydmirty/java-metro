import java.util.ArrayList;
import java.util.List;
import java.awt.*;

public class Line {
    String name;
    List<Station> stations;
    Color color;

    Line(String name, Color color){
        this.name = name;
        this.stations = new ArrayList<>();
        this.color = color;
    }

    void addStation(Station station){
        if (!this.stations.isEmpty()) {
            this.stations.getLast().addNeighbor(station);
            station.addNeighbor(this.stations.getLast());
        }
        this.stations.add(station);
    }

    List<Station> getStations(){
        return stations;
    }
}
