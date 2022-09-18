import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import static java.awt.EventQueue.invokeLater;

public class main extends JPanel implements ActionListener {


    public static void selectedButtonPressed() {
        System.out.println("TUAN LOVE DICK");

    }

    public class Graphics2D extends JPanel{
        public void draw(Graphics g){
            {
                
                super.paintComponent(g);
        

        //Graphics2D gd = new Graphics2D();
        //repaint(gd);
        
                //Flling in panel as gray
               g.setColor(Color.gray);
               g.fillRect(0, 0, 500, 500); 
               
               for(int i = 1; i <= 10; i++)
               {
                    //Vertical rectangles
                    g.setColor(Color.black);
                    g.drawRect(80 + (i * 20), 40, 20, 200); 
        
                    //Horizontal rectangles 
                    g.drawRect(100, 20 + (i * 20), 200, 20);
               }
        
        
               g.setColor(Color.yellow);
               g.fillRect(118, 40, 4, 200);
        
            }

        }
    }

    public static void main(String[] args) {

        //Graphics2D.draw();
        


        // Redraw button
        JButton b = new JButton("Redraw");
        //b.addActionListener

        b.setSize(300, 40);
        b.setLocation(50, 300);
        
        b.addActionListener(e-> selectedButtonPressed());
        

        //Keep as is
        invokeLater(new Runnable() {
            public void run() {
        
            JFrame f = new JFrame();
            main panel = new main();
            f.add(b);
            f.add(panel);
            f.setSize(400,400);
            f.setVisible(true);

            }
        });
        //Keep as is
    }

    private static void draw(Graphics g1) {
    }

    
}





