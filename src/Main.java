public class Main {
    import java.awt.Dimension;
    import java.awt.Graphics;
    
    import javax.swing.JFrame;
    import javax.swing.JPanel;
    
    public class Main extends JFrame {
        public static void main(String[] args) throws Exception {
            System.out.println("Hello World");
          Main window = new Main();
          window.run();
        }
    } 
    
        class Canvas extends JPanel {
          Grid grid = new Grid();
          public Canvas() {
            setPreferredSize(new Dimension(720, 720));
          }
    
          @Override
          public void paint(Graphics g) {
            grid.paint(g, getMousePosition());
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
// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.MouseEvent;
// import java.awt.event.MouseMotionAdapter;

// public class Main extends JFrame {
//     public static void main(String[] args) throws Exception {
//         Main window = new Main();
//     }

//     class Canvas extends JPanel {
//         private Grid grid;
//         grid = new Grid();

        

//         public Canvas() {
//             setPreferredSize(new Dimension(720, 720));
//         }

//         @Override
//         public void paint(Graphics g){
            //grid.paint(g);

            // for(int i=10; i<710; i+=35) {
            //     for(int j=10; j<710; j+=35){
            //         g.setColor(Color.BLACK);
            //         g.drawRect(i, j, 35, 35);
            //         g.setColor(Color.white);
            //         g.fillRect(i, j, 35, 35);
            //     }
            // }


//         }

//     }


//     private Main() {
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         Canvas canvas = new Canvas();
//         this.setContentPane(canvas);
//         this.pack();
//         this.setVisible(true);
//     }

//     // private Main(){
//     //     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     //     Canvas canvas = new Canvas();
//     //     this.pack();
//     //     this.setVisible(true);
//     // }

//     public void run(){
//         while(true){
//             repaint();
//         }
//     }




// }

// // import javax.swing.*;
// // import java.awt.*;

// // public class Main extends JFrame {
// //     public static void main(String[] args) throws Exception {
// //         Main window = new Main();
// //     }

// //     class Canvas extends JPanel {
// //         public Canvas() {
// //             setPreferredSize(new Dimension(720, 720));
// //         }

// //         @Override
// //         public void paint(Graphics g){
// //             for(int i=10; i<710; i+=35) {
// //                 for(int j=10; j<710; j+=35){
// //                     g.setColor(Color.BLACK);
// //                     g.drawRect(i, j, 35, 35);
// //                     g.setColor(Color.white);
// //                     g.fillRect(i, j, 35, 35);
// //                 }
// //             }
// //         }

// //         }


// //     private Main() {
// //         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// //         Canvas canvas = new Canvas();
// //         this.setContentPane(canvas);
// //         this.pack();
// //         this.setVisible(true);
// //     }




// // }



