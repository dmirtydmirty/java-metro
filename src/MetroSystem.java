import java.util.ArrayList;
import java.util.List;

public class MetroSystem {
    private List<Line> lines;
    private List<Cross> crosses;
    private List<Station> path;
    int width;
    int height;

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
