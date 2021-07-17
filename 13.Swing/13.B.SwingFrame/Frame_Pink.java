/*Using Swing, write a program to display a string in a frame window with pink color as background.*/



import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Frame_Pink {
   public static void main(String[] args){
       new Display();
   }

}
class Display extends JFrame{
   JFrame f;
   JLabel l;
   public Display()
   {
       f=new JFrame("Frame Display");
       l=new JLabel ("Heyy!!!This is a string");

       l.setBounds(25, 25, 260, 30);
       f.add(l);
       f.getContentPane().setBackground(Color.PINK);
       f.setVisible(true);
       f.setSize(300,200);f.setDefaultOperation(EXIT_ON_CLOSE);
       f.setLayout(new FlowLayout());
   }
}

