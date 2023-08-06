// import javax.swing.*;
// import java.awt.*;

// public class Grid {
//     int x;
//     int y;
//     int width =35;
//     int height =35;
//     Cell[] Cells;

//     public Grid(int x, int y){
//         this.x=x;
//         this.y=y;
//         Cells = new Cell[x*y];
//     }

//     public void createGrid(){
//         int index = 0;
//         for(int x=10; x<710; x+=35){
//             for(int i=10; i<710; i+=35){
//                 this.Cells[index]=new Cell(x, i, 35, 35);
//                 index++;
//             }
//         }
//     }

    // Cell[][] cells = new Cell[20][20];

    // public Grid() {
    //     for(int i=0; i<cells.length; i++){
    //         for(int j=0; j<cells[i].length; j++){
    //             cells[i][j] = new Cell(10+Cell.size*i, 10+Cell.size*j);
    //         }
    //     }
    // }

    // public void paint(Graphics g){

    //     for(int i=0; i<cells.length; i++){
    //         for(int j=0; j<cells[i].length; j++){
    //             cells[i][j].paint(g);
    //         }
    //     }
    // }
// }

import java.awt.Graphics;
import java.awt.Point;

public class Grid {
  // fields
  Cell[][] cells = new Cell[20][20];

  // constructors
  public Grid() {
    for(int i=0; i<cells.length; i++) {
      for(int j=0; j<cells[i].length; j++) {
        cells[i][j] = new Cell(10+Cell.size*i, 10+Cell.size*j);
      }
    }
  }
  // methods
  public void paint(Graphics g, Point mousePos) {
    for(int i=0; i<cells.length; i++) {
      for(int j=0; j<cells[i].length; j++) {
        cells[i][j].paint(g, mousePos);
      }
    }
  }
}
