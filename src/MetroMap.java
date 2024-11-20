import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MetroMap extends JPanel {
    MetroSystem ms;
    int minQuant = 30;

    void setMs(MetroSystem ms){
        this.ms = ms;
    }

    public void mainDraw() {
        JFrame frame = new JFrame("Карта метро");
        MetroMap metroMap = new MetroMap();
        metroMap.setMs(this.ms);
        frame.add(metroMap);
        frame.setSize(this.ms.width * minQuant, this.ms.height * minQuant);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        java.util.List<Station> path = this.ms.getPath();
        g.setColor(Color.BLACK);
        drawStart(g, path.getFirst().x, path.getFirst().y);
        drawFinish(g, path.getLast().x, path.getLast().y);

        // Устанавливаем цвет для веток
        for (Line l: this.ms.getLines()) {
            g.setColor(l.color);
            for (int i = 0; i < l.getStations().size(); i++){
                if ( i != l.getStations().size() -1){
                    drawLine(g, l.getStations().get(i).x, l.getStations().get(i).y,
                            l.getStations().get(i+1).x, l.getStations().get(i+1).y);
                }
                drawStation(g, l.getStations().get(i).x, l.getStations().get(i).y,
                        l.getStations().get(i).name);
            }
        }

        g.setColor(Color.PINK);
        List<Cross> crosses = this.ms.getCrosses();
        for (Cross cr : crosses){
            drawLine(g, cr.station1.x, cr.station1.y,
                    cr.station2.x, cr.station2.y);
        }

        g.setColor(Color.BLACK);

        for (int i = 0; i < path.size(); i++){
            if ( i != path.size() -1){
                drawLine(g, path.get(i).x-1, path.get(i).y-1,
                        path.get(i+1).x-1, path.get(i+1).y-1);
                drawLine(g, path.get(i).x+1, path.get(i).y+1,
                        path.get(i+1).x+1, path.get(i+1).y+1);
            }
        }


    }

    private void drawLine(Graphics g, int x1, int y1, int x2, int y2) {
        g.drawLine(x1, this.ms.height * minQuant-y1, x2, this.ms.height * minQuant-y2);
    }

    private void drawStation(Graphics g, int x, int y, String name) {
        g.fillOval(x - 10, this.ms.height * minQuant - y - 10, 20, 20); // Рисуем станцию
        g.drawString(name, x + minQuant/2, this.ms.height * minQuant - y + minQuant/2); // Подписываем станцию
    }

    private void drawStart(Graphics g, int x, int y){
        g.fillRect(x-12, this.ms.height * minQuant - y-12, 24, 24);
        g.drawString("Start", x - minQuant/2, this.ms.height * minQuant - y - minQuant/2);
    }

    private void drawFinish(Graphics g, int x, int y){
        g.fillRect(x-12, this.ms.height * minQuant - y-12, 24, 24);
        g.drawString("Finish", x - minQuant/2, this.ms.height * minQuant - y - minQuant/2);
    }
}
