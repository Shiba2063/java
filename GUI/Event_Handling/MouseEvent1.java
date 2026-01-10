import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
 class MouseEvent1 extends JFrame implements MouseListener
 {
    JFrame f1;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    MouseEvent1()
    {
        f1=new JFrame("MouseEvent");
        l1=new JLabel("First Number");
        l2=new JLabel("Second Number");
        l3=new JLabel("Result");
        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(10);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(400,400);
        f1.setLayout(new GridLayout(3,2));
        t3.setEditable(false);
        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(t2);
        f1.add(l3);
        f1.add(t3);
        f1.addMouseListener(this);
    }
 
    public static void main(String args[])
    {
        new MouseEvent1();
    }
    
    public void mousePressed(MouseEvent e)
    {
        float a,b,c;
        a=Float.parseFloat(t1.getText());
        b=Float.parseFloat(t2.getText());
        c=a+b;
        l3.setText("Sum");
        t3.setText(String.valueOf(c));
    }
        public void mouseReleased(MouseEvent e)
    {
        float a,b,c;
        a=Float.parseFloat(t1.getText());
        b=Float.parseFloat(t2.getText());
        c=a-b;
        l3.setText("Difference");
        t3.setText(String.valueOf(c));
    }
      public void mouseClicked(MouseEvent e)
      {
          
      }
        public void mouseEntered(MouseEvent e)
        {
            
        }
        public void mouseExited(MouseEvent e)
        {
            
        }
}

