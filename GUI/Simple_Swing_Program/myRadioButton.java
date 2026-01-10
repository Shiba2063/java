import java.awt.*;
import javax.swing.*;
public class myRadioButton extends JFrame{
    myRadioButton()
    {
        
    JRadioButton rb1=new JRadioButton("Male");
    add(rb1);
    JRadioButton rb2=new JRadioButton("Female");
    add(rb2);
    JRadioButton rb3=new JRadioButton("Others");
    add(rb3);
    ButtonGroup bg =new ButtonGroup();
    bg.add(rb1);
    bg.add(rb2);
    bg.add(rb3);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(480,480);
    setVisible(true);
    }
    public static void main(String args[])
    {
     new myRadioButton();   
    }
}
