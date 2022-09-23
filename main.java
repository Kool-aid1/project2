import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import static java.awt.EventQueue.invokeLater;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Double;
import java.util.Random;
import java.awt.PointerInfo;
import java.awt.event.*; 

public class main extends JPanel implements ActionListener{

    public main(){
        setBackground(Color.gray);//setting background
        setLayout(null); 
        JButton b = new JButton("REDRAW!!!!"); //initilize button
        b.addActionListener(this); //when user clicks
        b.setSize(300, 40);//size of button
        b.setLocation(200, 500);//button location
        add(b); //adding button to panel
    }

    @Override
    public void actionPerformed(ActionEvent e){
            repaint(); //sets a repaint for everytime action is performed
        }
    public static void main (String[] args) {
        JFrame f = new JFrame();//frame for UI
        main panel = new main();

        f.add(panel);//adding panel
        f.setSize(700, 700); //sets the size
        f.setVisible(true);//setting to be visible
    }

    @Override
     public void paintComponent(Graphics g) {
        super.paintComponent(g);//enables utilization of repaint
        Graphics2D g2d = (Graphics2D) g;//using graphics2d

       //for printing the grid 
       for(int i = 1; i <= 10; i++) {
            //Vertical rectangles
            g2d.setColor(Color.black);
            g2d.drawRect(110 + (i * 40), 40, 40, 400); 

            //Horizontal rectangles 
            g2d.drawRect(150, i * 40, 400, 40);
            
       }
        int randomNumLines =  (int)Math.floor(Math.random() * 10) + 2;//number of random lines created
        double gridSpace = 387 / randomNumLines;//get sections of grid that can be used 
        double section = gridSpace * randomNumLines;//use gridspace for section that can be used

       for(int i = 0; i < randomNumLines; i++) {

        double x = 156 + Math.floor(Math.random() * section);//line placement
        Line2D.Double line =  new Line2D.Double(x, Math.floor(Math.random() * 389) + 46, x, 435);//create new line 

        //getting random color values 
        int r = (int)Math.floor(Math.random() * 255); 
        int gr = (int)Math.floor(Math.random() * 255); 
        int b = (int)Math.floor(Math.random() * 255); 

        g2d.setColor(new Color(r, gr, b));//setting color
        g2d.setStroke(new BasicStroke(10));//setting line width 
        g2d.draw(line);//draw line on grid 
       }
       
    }
    
}
