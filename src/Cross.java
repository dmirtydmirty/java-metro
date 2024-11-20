import java.util.List;

public class Cross {
    Station station1;
    Station station2;

    Cross(Line l1, Station s1, Line l2, Station s2){

        this.station1 = s1;
        this.station2 = s2;

        List<Station> sl1 = l1.getStations();
        List<Station> sl2 = l2.getStations();

        int s1idx = sl1.indexOf(s1);
        int s2idx = sl2.indexOf(s2);

        sl1.get(s1idx).addNeighbor(s2);
        sl2.get(s2idx).addNeighbor(s1);
    }
}
