/*8. Write a program to create a frame using AWT. Implement mouseClicked(),
mouseEntered() and mouseExited() events such that:
a) Size of the frame should be tripled when mouse enters it.
b) Frame should reduce to its original size when mouse is clicked in it.
c) Close the frame when mouse exits it.
*/

import java.awt.*; 
import java.awt.event.*;
public class Q8 implements MouseListener{
	Frame f;
	Q8(){
    	f=new Frame("Q6");
f.setSize(300,300); 
f.setLayout(null); 
f.setVisible(true); 
f.addMouseListener(this);
	} 
	public void mouseClicked(MouseEvent e) { 
f.setSize(300,300);
	} 
	public void mouseEntered(MouseEvent e) { 
f.setSize(900,900);
	} 
	public void mouseExited(MouseEvent e) { 
f.dispose();
	} 
	public void mousePressed(MouseEvent e) { 
 
	} 
	public void mouseReleased(MouseEvent e) { 
 
	} 
public static void main(String[] args) { 
	new Q8(); 
} 
}
