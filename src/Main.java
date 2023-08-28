import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Graphics;
import java.time.Duration;
import java.time.Instant;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
      Main window = new Main();
      window.run();
    }

    class Canvas extends JPanel implements MouseListener {
      Stage stage;
      public Canvas() {
        setPreferredSize(new Dimension(720, 720));
        stage = StageReader.readStage("data/stage11.rvb");
      }

      @Override
      public void paint(Graphics g) {
        stage.paint(g, getMousePosition());
      }

      @Override
      public void mouseClicked(MouseEvent e) {
        stage.mouseClicked(e.getX(), e.getY());
      }

      @Override
      public void mousePressed(MouseEvent e) {}

      @Override
      public void mouseReleased(MouseEvent e) {}

      @Override
      public void mouseEntered(MouseEvent e) {}

      @Override
      public void mouseExited(MouseEvent e) {}
    }

    private Main() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Canvas canvas = new Canvas();
      this.setContentPane(canvas);
      this.pack();
      this.setVisible(true);
    }

    public void run() {
      while(true) {
        Instant startTime = Instant.now();
        repaint();
        Instant endTime = Instant.now();
        long howLong = Duration.between(startTime, endTime).toMillis();
        try {
          Thread.sleep(20l - howLong);
        } catch(InterruptedException e) {
          System.out.println("thread was interrupted, but who cares?");
        } catch(IllegalArgumentException e) {
          System.out.println("application can't keep up with framerate");
        }
      }
    }
}
// import java.awt.Dimension;
// import java.awt.Graphics;
// import java.io.IOException;

// import javax.swing.JFrame;
// import javax.swing.JOptionPane;
// import javax.swing.JPanel;

// public class Main extends JFrame {
//     public static void main(String[] args) {
//       Main window = new Main();
//       window.run();
//     }

//     class Canvas extends JPanel {
//       Stage stage;
//       public Canvas() {
//         setPreferredSize(new Dimension(720, 720));
//         try {
//             stage = StageReader.readStage("data/stage1.rvb");  
//         } catch (IOException e) {
//             JOptionPane.showMessageDialog(null, "Error reading stage file: " + e.getMessage());
//             System.exit(1);  
//         }
//       }

//       @Override
//       public void paint(Graphics g) {
//         stage.paint(g, getMousePosition());
//       }
//     }

//     private Main() {
//       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//       Canvas canvas = new Canvas();
//       this.setContentPane(canvas);
//       this.pack();
//       this.setVisible(true);
//     }

//     public void run() {
//       while(true) {
//         repaint();
//         try {
//             Thread.sleep(50);  
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//       }
//     }
// }
