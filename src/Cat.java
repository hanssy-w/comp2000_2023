import java.awt.color.*;
import java.awt.Graphics;
import java.awt.Point;

public class Cat extends Actor {
    public void paint(Graphics g, Point mousePos) {
        grid.paint(g, mousePos); 
    }
}
