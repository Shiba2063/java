import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
 class MouseEvent3 extends JFrame implements MouseListener
 {
    JFrame f1;
    JLabel l1,l2,l3;
    JTextField t1,t2;
    MouseEvent3()
    {
        f1=new JFrame("MouseEvent");
        l1=new JLabel("First Number");
        l2=new JLabel("Second Number");
        l3=new JLabel();
        t1=new JTextField(10);
        t2=new JTextField(10);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(400,400);
        f1.setLayout(new GridLayout(3,2));
        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(t2);
        f1.add(l3);
        f1.addMouseListener(this);
    }
 
    public static void main(String args[])
    {
        new MouseEvent3();
    }
    
    public void mousePressed(MouseEvent e)
    {
        float a,b,c;
        a=Float.parseFloat(t1.getText());
        b=Float.parseFloat(t2.getText());
        if(a<b)
        {
            c=a;
        }
        else
        {
            c=b;
        }
        l3.setText("Smaller Number is "+String.valueOf(c));
        
    }
        public void mouseReleased(MouseEvent e)
    {
       float a,b,c;
        a=Float.parseFloat(t1.getText());
        b=Float.parseFloat(t2.getText());
        if(a>b)
        {
            c=a;
        }
        else
        {
            c=b;
        }
        l3.setText("Greater Number is "+String.valueOf(c));
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
