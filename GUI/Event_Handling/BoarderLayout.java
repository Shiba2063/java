import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class BoarderLayout implements ActionListener {
    JFrame f1;
    JButton b1,b2,b3,b4;
    JTextField t1,t2,t3;
    JLabel l1,l2,l3,l4;
    JPanel p1,p2,p3;
    BoarderLayout()
    {
        f1=new JFrame("BoarderLayout");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(400,400);
        BorderLayout B1=new BorderLayout(30,10);
        f1.setLayout(B1);
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        l1=new JLabel("Fisrt Number");
        l2=new JLabel("Second Number");
        l3=new JLabel("Result");
        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(10);
        t3.setEditable(false);
        b1=new JButton("Sum");
        b2=new JButton("Subtract");
        b3=new JButton("Multiply");
        b4=new JButton("Divide");
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.setLayout(new GridLayout(4,1,2,2));
        f1.add(p1,BorderLayout.EAST);
        p2.add(l1);
        p2.add(t1);
        p2.add(l2);
        p2.add(t2);
        p2.add(l3);
        p2.add(t3);
        p2.setLayout(new GridLayout(3,2,2,2));
        f1.add(p2,BorderLayout.CENTER);
        l4=new JLabel("SIMPLE MATHEMATICS");
        p3.add(l4);
        f1.add(p3,BorderLayout.NORTH);
        f1.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
        
    public static void main(String args[])
    {
        new BoarderLayout();
    }
    public void actionPerformed(ActionEvent e)
    {
        float a,b,c;
        a=Float.parseFloat(t1.getText());
        b=Float.parseFloat(t2.getText());
        if(e.getSource()==b1)
        {
          c=a+b;  
        }
        else if(e.getSource()==b2)
                {
                    c=a-b;
                }
        else if(e.getSource()==b3)
        {
            c=a*b;
        }
        else if(e.getSource()==b4)
        {
            c=a/b;
        }
        else
        {
            c=0;
        }
        t3.setText(String.valueOf(c));
    }
}



