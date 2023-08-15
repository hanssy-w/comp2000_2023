import java.awt.Graphics;
import java.util.List;
import java.awt.Point;
import java.util.ArrayList;

public class Stage {
  Grid grid;
  // Actor cat;
  // Actor dog;
  // Actor bird;
  List<Actor> actors; // = new ArrayList<Actor>();

  public Stage() {
    grid = new Grid();
    actors = new ArrayList<>();

    actors.add(new Cat(grid.cellAtColRow(0, 0)));
    actors.add(new Dog(grid.cellAtColRow(0, 15)));
    actors.add(new Bird(grid.cellAtColRow(12, 9)));
  }

  public void paint(Graphics g, Point mouseLoc) {
    grid.paint(g, mouseLoc);
    for(Actor actor:actors){
    // cat.paint(g);
    // dog.paint(g);
    // bird.paint(g);
    actor.paint(g);
    }
  }
}
