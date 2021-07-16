/*8. Write	 a	 program	 to	 create	 a	 frame using	 AWT.	 Implement	 mouseClicked(),	
mouseEntered()	and	mouseExited()	events such	that:
a) Size	of	the	frame	should	be	tripled	when	mouse	enters it.
b) Frame	should	reduce	to	its	original	size	when	mouse	is	clicked	in	it.
c) Close	the	frame	when	mouse	exits it.*/


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class mouse{
   JLabel l;
   mouse() {
       JFrame f = new JFrame("Swing Frame");
       l = new JLabel("", SwingConstants.CENTER);
       l.setBounds(15, 110, 260, 30);
       f.add(l);
       f.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e) {
               l.setText("Mouse Clicked");
           }
           @Override
           public void mouseEntered(MouseEvent e) {
               l.setText("Mouse Entered");
           }
           @Override
           public void mouseExited(MouseEvent e) {
               l.setText("Mouse Exited");
           }
       });
       f.setSize(300, 300);
       f.setLayout(null);
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public static void main(String[] args) {
       SwingUtilities.invokeLater(new Runnable() {
           public void run() {
               new mouse();
           }
       });
   }
}
