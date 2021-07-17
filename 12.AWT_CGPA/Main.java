/*Using Swing, write a program to create two buttons labelled ‘A’ and ‘B’. When button ‘A’ is pressed, it displays your personal information (Name, Course, Roll No, College) and when button ‘B’ is pressed, it displays your CGPA in the previous semester.*/



//Main class
import java.awt.*;
import java.awt.event.*;
public class Main extends WindowAdapter implements ActionListener{
 Frame frame;
 Button button1, button2;
 Main(){
     frame = new Frame("MY FRAME");
     button1 = new Button("A");
     button2 = new Button("B");
     button1.setBounds(120,100,150,50);
     button2.setBounds(120,200,150,50);
     button1.addActionListener(this);
     button2.addActionListener(this);
     frame.addWindowListener(this);
     frame.add(button1);
     frame.add(button2);
     frame.setBackground(Color.gray);
     frame.setSize(400,400);
     frame.setLayout(null);
     frame.setVisible(true);
 }
 public void windowClosing(WindowEvent e){
     frame.dispose();
 }
 public static void main(String args[]){
     new Main();
 }
 public void actionPerformed(ActionEvent e){
  if(e.getSource()==button1){
      new Info("Arpit Taneja", "BSc (Hons)Computer Science", 
             "88012","ARSD");
      } 
  if(e.getSource()==button2){
       new CGPA("9.4");
  }
 }
}



//Info Class
import java.awt.*;
import java.awt.event.*;
public class Info extends WindowAdapter implements ActionListener
{
    Frame frame1;
    Label lName, lCourse, lRollNo, lClg;
    Button button;
    Info(String name, String course, String rollno, String clg){
        frame1 = new Frame("INFORMATION");
        lName = new Label();
        lName.setBounds(50,50,250,30);
        lCourse = new Label();
        lCourse.setBounds(50,90,250,30);
        lRollNo = new Label();
        lRollNo.setBounds(50,130,250,30);
        lClg = new Label();
        lClg.setBounds(50,170,250,30);
        button = new Button("CLOSE");
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
        frame1.setBackground(Color.green);
        frame1.addWindowListener(this);
        frame1.setSize(350,300);
        frame1.setLayout(null);
        frame1.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        frame1.dispose();
    }
    public void windowClosing(WindowEvent e){
        frame1.dispose();
    }
}





//CGPA class
import java.awt.*;
import java.awt.event.*;
public class CGPA extends WindowAdapter implements ActionListener{
    Frame frame2;
    Label label;TextField tf;
    Button button;
    CGPA(String cgpa){
        frame2 = new Frame("CGPA");
        label = new Label("CGPA: ");
        label.setBounds(50,50,50,30);
        tf = new TextField(cgpa);
        tf.setBounds(110,50,150,30);
        button = new Button("CLOSE");
        button.setBounds(170,110,90,30);
        button.addActionListener(this);
        frame2.add(label);
        frame2.add(tf);
        frame2.add(button);
        frame2.setBackground(Color.orange);
        frame2.addWindowListener(this);
        frame2.setSize(310,190);
        frame2.setLayout(null);
        frame2.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        frame2.dispose();
    }
    public void windowClosing(WindowEvent e){
        frame2.dispose();
    }
}
