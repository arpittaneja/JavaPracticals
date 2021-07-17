/*Using Swing, write a program to create two buttons named “Red” and “Blue”. When a button is pressed the background color should be set to the color named by the button’s label.*/



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class BgColor extends JFrame implements ActionListener{
   JFrame frame;
   JButton button1, button2;
   BgColor(){
       frame = new JFrame("My Frame");
       button1 = new JButton("RED");
       button2 = new JButton("BLUE");
       button1.setBounds(100,50,100,50);
       button2.setBounds(100,150,100,50);
       frame.add(button1);
       frame.add(button2);
       button1.addActionListener(this);
       button2.addActionListener(this);
       frame.setSize(300,260);
       frame.setLayout(null);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   public void actionPerformed(ActionEvent e){
       if(e.getSource()==button1){
           frame.getContentPane().setBackground(Color.red);
       }
       else if(e.getSource()==button2){
           frame.getContentPane().setBackground(Color.blue);
       }
   }

