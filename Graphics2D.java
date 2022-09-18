import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import static java.awt.EventQueue.invokeLater;

public class Graphics2D extends JPanel{

@Override
public void paintComponent(Graphics g) 
    {
        Graphics g2 = (Graphics) g;
        super.paintComponent(g2);

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
    
};