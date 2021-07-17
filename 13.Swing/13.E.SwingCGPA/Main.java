/*Using Swing, write a program to create two buttons labelled ‘A’ and ‘B’. When button ‘A’ is pressed, it displays your personal information (Name, Course, Roll No, College) 
and when button ‘B’ is pressed, it displays your CGPA in the previous semester.*/



//Main class
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main extends WindowAdapter implements ActionListener{
   JFrame frame;
   JButton button1, button2;
   Main(){
       frame = new JFrame("MY FRAME");
       button1 = new JButton("A");
       button2 = new JButton("B");
       button1.setBounds(120,100,150,50);
       button2.setBounds(120,200,150,50);
       button1.addActionListener(this);
       button2.addActionListener(this);
       frame.add(button1);
       frame.add(button2);
       frame.getContentPane().setBackground(Color.yellow);
       frame.setSize(400,400);
       frame.setLayout(null);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
   }
   public void windowClosing(WindowEvent e){
       frame.dispose();
   }
   public static void main(String args[]){
       new Main();
   }
   public void actionPerformed(ActionEvent e){
       if(e.getSource()==button1){
           new Info("Prachi Rawat", "BSc (Hons)Computer Science","88011","ARSD");}
           if(e.getSource()==button2){
               new CGPA("9.3");
           }
       }
   }



//Info Class
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Info extends WindowAdapter implements ActionListener{
    JFrame frame1;
    JLabel lName, lCourse, lRollNo, lClg;
    JButton button;
    Info(String name, String course, String rollno, String clg){
        frame1 = new JFrame("INFORMATION");
        lName = new JLabel();
        lName.setBounds(50,50,250,30);
        lCourse = new JLabel();
        lCourse.setBounds(50,90,250,30);
        lRollNo = new JLabel();
        lRollNo.setBounds(50,130,250,30);
        lClg = new JLabel();
        lClg.setBounds(50,170,250,30);
        button = new JButton("CLOSE");
        button.setBounds(175,220,125,30);
        button.addActionListener(this);
        lName.setText("Name: "+name);
        lName.setBackground(Color.white);
        lCourse.setText("Course: "+course);
        lCourse.setBackground(Color.white);
        lRollNo.setText("Roll No: "+rollno);
        lRollNo.setBackground(Color.white);
        lClg.setText("College: "+clg);
        lClg.setBackground(Color.white);
        frame1.add(lName);
        frame1.add(lCourse);
        frame1.add(lRollNo);
        frame1.add(lClg);
        frame1.add(button);
        frame1.getContentPane().setBackground(Color.green);
        frame1.addWindowListener(this);
        frame1.setSize(350,300);
        frame1.setLayout(null);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        frame1.dispose();
    }

}



//CGPA class
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CGPA extends JFrame implements ActionListener{
    JFrame frame2;
    JLabel label;
    JTextField tf;
    JButton button;
    CGPA(String cgpa){
        frame2 = new JFrame("CGPA");
        label = new JLabel("CGPA: ");
        label.setBounds(50,50,50,30);
        tf = new JTextField(cgpa);
        tf.setBounds(110,50,150,30);
        button = new JButton("CLOSE");
        button.setBounds(170,110,90,30);
        button.addActionListener(this);
        frame2.add(label);
        frame2.add(tf);
        frame2.add(button);
        frame2.getContentPane().setBackground(Color.orange);
        frame2.setSize(310,190);
        frame2.setLayout(null);
        frame2.setVisible(true);
        frame2.setDefaultCloseOperation(frame2.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        frame2.dispose();
    }
}




