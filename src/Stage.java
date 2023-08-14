import java.awt.Graphics;
import java.awt.Point;

public class Stage {
    private Grid grid;
    // private List<Actor> actors;

    public Stage() {
        grid = new Grid();

    }

    public void paint(Graphics g, Point mousePos) {
        grid.paint(g, mousePos); 
    }
}


