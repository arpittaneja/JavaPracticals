/*11. Using AWT, write a program using the appropriate
adapter class to display the message(“Typed character is: ”) in the
frame window when the user types any key.
*/



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class keyTyped extends KeyAdapter
{
   JFrame f;
   JLabel label;
   keyTyped()
   {
       f = new JFrame();
       label = new JLabel();
       label.setBounds(25, 35, 200, 100);
       label.setBackground(Color.LIGHT_GRAY);
       label = new JLabel("", SwingConstants.CENTER);
       f.add(label);
       f.addKeyListener(this);
       f.setFocusable(true);
       f.setSize(300,300);
       f.setVisible(true);


   }

   // 3 overrided methods of class KeyAdapter
   public void keyPressed(KeyEvent e) { }
   public void keyReleased(KeyEvent e) { }
   public void keyTyped(KeyEvent e)
   {
       char ch = e.getKeyChar();
       label.setText("Typed character is: "+ch);
   }

   public static void main(String snrao[])
   {
       new keyTyped();
   }
}
