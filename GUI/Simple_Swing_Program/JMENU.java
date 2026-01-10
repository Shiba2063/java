import java.awt.*;
import javax.swing.*;
public class JMENU extends JFrame {
    static JFrame f;
    static JLabel l;
    static JMenuBar mb;
    static JMenu x1,x2;
    static JMenuItem m1,m2,m3,s1,s2,a1,a2;
    public static void main(String args[]){
        f=new JFrame("Menu");
        l=new JLabel("This is just demo menu");
        mb=new JMenuBar();
        x1=new JMenu("Veg Menu");
        x2=new JMenu("Non-Veg Menu");
        m1= new JMenuItem("Pokada");
        m2= new JMenu("Veg-MOMO");
        a1=new JMenuItem("Veg-MOMO 1");
        a2=new JMenuItem("Veg-MOMO 2");
        m3= new JMenuItem("Veg Chowemin");
        s1= new JMenuItem("Chicken korma");
        s2=new JMenuItem("Mutton-Biryani");
         m2.add(a1);
         m2.add(a2);
        x1.add(m1);
        x1.add(m2);
        x1.add(m3);
        x2.add(s1);
        x2.add(s2);
        mb.add(x1);
        mb.add(x2);
        f.setJMenuBar(mb);
        f.add(l);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);
        f.setVisible(true);
        
    }
    
}
