import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
  class MouseEvent2 implements MouseListener{
    JFrame f1;
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1;
    MouseEvent2()
    {
        f1=new JFrame("Mouse event");
        l1=new JLabel("Enter Number");
        l2=new JLabel("Result");
        t1=new JTextField(10);
        t2=new JTextField(10);
        b1=new JButton("Result");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setVisible(true);
        f1.setSize(400,400);
        f1.setLayout(new GridLayout(3,2));
        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(t2);
        f1.add(b1);
        b1.addMouseListener(this);
    }
    public static void main(String args[])
    {
        new MouseEvent2();
    } 
        public void mousePressed(MouseEvent e)
    {
        int a,b;
        a=Integer.parseInt(t1.getText());
        b=a;
        for(int i=a-1;i>=1;i--)
        {
            b=b*i;
        }
        l2.setText("Factorial");
        t2.setText(String.valueOf(b));
    }
       public void mouseReleased(MouseEvent e)
    {
        int a,b;
        a=Integer.parseInt(t1.getText());
        b=a*a*a;
        l2.setText("Cube");
        t2.setText(String.valueOf(b));
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
