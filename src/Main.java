import java.util.List;


class Main {
    public static void main(String[] args) {
        MetroSystem metroSystem = InitMs.initSpbMetro();

        Station start = metroSystem.getStationByName("Площадь мужества");
        Station finish = metroSystem.getStationByName("Спортивная");

        Traveler traveler1 = new Traveler("Путешественник 1", start);

        List<Station> path = traveler1.findShortestPath(metroSystem, finish);
        metroSystem.setPath(path);
        System.out.println("Кратчайший путь для " + traveler1.name + ":");
        for (Station station : path) {
            System.out.print(" -> " +  station.name);
        }
        System.out.println();

        MetroMap GUI = new MetroMap();
        GUI.setMs(metroSystem);
        GUI.mainDraw();
    }
}




