
import java.awt.*;
import java.awt.event.*;
public class FrameDisplay extends Frame{
    Label label;
    FrameDisplay(){
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        label = new Label("Hey!!! This is a string");
        label.setBounds(90,110,120,50);
        add(label);
        setBackground(Color.pink);
        setSize(300,270);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[]){
        new FrameDisplay();
    }
}
