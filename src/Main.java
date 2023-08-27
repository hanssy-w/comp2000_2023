import java.awt.Dimension;
import java.awt.Graphics;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
      Main window = new Main();
      window.run();
    }

    class Canvas extends JPanel {
      Stage stage;
      public Canvas() {
        setPreferredSize(new Dimension(720, 720));
        try{
        stage = StageReader.readStage("data/stage11.rvb");
        }
        catch(IOException e){
          System.out.println(e.toString());
        }
      }

      @Override
      public void paint(Graphics g) {
        stage.paint(g, getMousePosition());
      }
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
        repaint();
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
