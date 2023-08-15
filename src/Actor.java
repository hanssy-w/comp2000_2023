import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

public abstract class Actor {
  Color color;
  Cell loc;
  // ArrayList<Polygon> polygons;
  ArrayList<Polygon> poly = new ArrayList<Polygon>();

  public void paint(Graphics g) {
    for(Polygon polygon : poly){
      g.setColor(color);
      g.drawPolygon(polygon);
      g.fillPolygon(polygon);
    // g.setColor(color);
    // g.fillRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
    // g.setColor(Color.GRAY);
    // g.drawRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
    }
  }
}
