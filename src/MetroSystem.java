import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MetroSystem {
    private final List<Line> lines;
    private final List<Cross> crosses;
    private final List<Station> path;
    int width;
    int height;

    Station getStationByName(String name){
        for (Line l : lines){
            for (Station s: l.getStations()){
                if (Objects.equals(s.name, name)) {
                    return s;
                }
            }
        }
        return lines.getFirst().getStations().getFirst();
    }

    MetroSystem(int w, int h) {
        lines = new ArrayList<>();
        crosses = new ArrayList<>();
        path = new ArrayList<>();
        width = w;
        height = h;
    }

    void addLine(Line line) {
        lines.add(line);
    }

    void addCross(Cross cross) {
        crosses.add(cross);
    }

    void setPath(List<Station> path){
        this.path.addAll(path);
    }

    List<Station> calculateShortestPath(Station start, Station end) {
        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(this);
        return dijkstra.findShortestPath(start, end);
    }

    List<Line> getLines() {
        return lines;
    }

    List<Cross> getCrosses(){
        return crosses;
    }

    List<Station> getPath(){
        return path;
    }
}
