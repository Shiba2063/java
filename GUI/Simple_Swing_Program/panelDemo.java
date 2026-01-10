import java.awt.*;
import javax.swing.*;
public class panelDemo extends JFrame{
    static JFrame f;
    static JButton b1,b2,b3;
    static JLabel l;
    public static void main(String args[])
    {
        f=new JFrame("NCIT Student");
        l=new JLabel("Hi I am SHIBA BHATTA");
        b1=new JButton("click me");
        b2=new JButton("submit");
        b3=new JButton("Reset");
        JPanel p=new JPanel();
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(l);
        p.setBackground(Color.red);
        f.add(p);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    
    
}
