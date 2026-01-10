import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;
public class FocusEvent1 extends JFrame implements FocusListener {
    
    static JTextField t1,t2,t3;
    static JLabel l1,l2,l3;
    static JButton b1;
    FocusEvent1()
    {
     JFrame f1=new JFrame("Focus Listener");
     f1.setSize(400,400);
     f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f1.setLayout(new GridLayout(4,2,15,15));
     l1=new JLabel("first value");
     l2=new JLabel("second value");
     l3=new JLabel("Third value");
     t1=new JTextField(10);
     t2=new JTextField(10);
     t3=new JTextField(10);
     b1=new JButton("Sum");
     t3.setEditable(false);
     f1.add(l1);
     f1.add(t1);
     f1.add(l2);
     f1.add(t2);
     f1.add(l3);
     f1.add(t3);
     f1.add(b1);
     t1.addFocusListener(this);
     t2.addFocusListener(this);
     b1.addFocusListener(this);
     f1.setVisible(true);
     
    }
    public static void main(String args[])
    {
        new FocusEvent1();
    }
    public void focusGained(FocusEvent e)
    {
        int a,b,c;
        a=Integer.parseInt(t1.getText());
        b=Integer.parseInt(t2.getText());
        if(e.getSource()==b1)
        {
           c=a+b;
           t3.setText(String.valueOf(c));
        }
    }
    public void focusLost(FocusEvent e)
    {
        if(e.getSource()==t1&&t1.getText().equals(" "));
        {
            JOptionPane.showMessageDialog(this,"Enter first number to continue:");
            t1.requestFocus();
        }
         if(e.getSource()==t2&&t2.getText().equals(""));
        {
            JOptionPane.showMessageDialog(this,"Enter second number to continue:");
            t2.requestFocus();
        }
    }
    
    
}
