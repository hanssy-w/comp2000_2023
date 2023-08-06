// import javax.swing.*;
// import java.awt.*;

// public class Cell {
//     int X;
//     int Y;
//     int w;
//     int h;
//     Color line;
//     Color bg;

//     public Cell(int X, int Y, int w, int h){
//         this.X=X;
//         this.Y=Y;
//         this.w=w;
//         this.h=h;
//         this.line = Color.black;
//         this.bg = Color.white;
//     }

//     public void paint(Graphics g, int mouseX, int mouseY ){
//         if(mouseX > this.X && mouseX < this.X+35 && mouseX < this.Y && mouseX < this.Y+35){
//             this.bg = Color.green;
//         }else{
//             this.bg = Color.white;
//         }
//         g.setColor(this.bg);
//         g.fillRect(this.X, this.Y, 35, 35);
//         g.setColor(this.line);
//         g.drawRect(this.X, this.Y, 35, 35);
//     }

// }
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Cell {
  // fields
  int x;
  int y;
  static int size = 35;

  // constructors
  public Cell(int inX, int inY) {
    x = inX;
    y = inY;
  }

  // methods
  public void paint(Graphics g, Point mousePos) {
    if(contains(mousePos)) {
      g.setColor(Color.GRAY);
    } else {
      g.setColor(Color.WHITE);
    }
    g.fillRect(x, y, size, size);
    g.setColor(Color.BLACK);
    g.drawRect(x, y, size, size);
  }

  public boolean contains(Point p) {
    if(p != null) {
      return x < p.x && x+size > p.x && y < p.y && y+size > p.y;
    } else {
      return false;
    }
  }
}