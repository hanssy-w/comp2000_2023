// import java.awt.Color;
// import java.awt.Graphics;
// import java.awt.Point;
// import java.awt.Rectangle;

// public class Cell {
//   // fields
//   int x;
//   int y;
//   static int size = 35;

//   // constructors
//   public Cell(int inX, int inY) {
//     x = inX;
//     y = inY;
//   }

//   // methods
//   public void paint(Graphics g, Point mousePos) {
//     if(contains(mousePos)) {
//       g.setColor(Color.GRAY);
//     } else {
//       g.setColor(Color.WHITE);
//     }
//     g.fillRect(x, y, size, size);
//     g.setColor(Color.BLACK);
//     g.drawRect(x, y, size, size);
//   }

//   public boolean contains(Point p) {
//     if(p != null) {
//       return x < p.x && x+size > p.x && y < p.y && y+size > p.y;
//     } else {
//       return false;
//     }
//   }
// }
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

public class Cell extends Rectangle {
    static int size = 35;

    public Cell(int inX, int inY) {
        super(inX, inY, size, size);
    }

    public void paint(Graphics g, Point mousePos) {
        if (contains(mousePos)) {
            g.setColor(Color.GRAY);
        } else {
            g.setColor(Color.WHITE);
        }
        g.fillRect(x, y, width, height);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, width, height);
    }

    @Override
    public boolean contains(Point p) {
        if (p != null) {
            return super.contains(p);
        } else {
            return false;
        }
    }
}
