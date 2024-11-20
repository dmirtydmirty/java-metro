import java.util.*;

public class DijkstraAlgorithm {
    MetroSystem ms;
    DijkstraAlgorithm(MetroSystem ms){
        this.ms = ms;
    }
    public List<Station> findShortestPath(Station start, Station end) {
        Map<Station, Integer> distances = new HashMap<>();
        Map<Station, Station> previousStations = new HashMap<>();
        PriorityQueue<Station> queue = new PriorityQueue<>(Comparator.comparingInt(distances::get));

        for (Station station : getAllStations()) {
            distances.put(station, Integer.MAX_VALUE);
            previousStations.put(station, null);
        }
        distances.put(start, 0);
        queue.add(start);

        while (!queue.isEmpty()) {
            Station current = queue.poll();

            for (Station neighbor : current.neighbors) {
                int newDist = distances.get(current) + current.distances.get(neighbor);
                if (newDist < distances.get(neighbor)) {
                    distances.put(neighbor, newDist);
                    previousStations.put(neighbor, current);
                    queue.add(neighbor);
                }
            }
        }

        List<Station> path = new ArrayList<>();
        for (Station at = end; at != null; at = previousStations.get(at)) {
            path.add(at);
        }
        Collections.reverse(path);
        return path;
    }

    private List<Station> getAllStations() {
        List<Station> all = new ArrayList<>();
        for (Line l: ms.getLines()){
            for (Station s : l.getStations()){
                all.add(s);
            }
        }
        return all;
    }
}
