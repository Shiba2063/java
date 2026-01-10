import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
 public class YourName implements ActionListener{
    JFrame f1;
    JLabel l1;
    JTextField t1;
    JButton b1,b2;
    YourName ()
    {
        f1 = new JFrame("NCIT Collage");
        f1.setSize(400,400);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new GridLayout(2,2));
        l1=new JLabel("Name :");
        t1=new JTextField(20);
        t1.setEditable(false);
        b1=new JButton("Submit");
        b2=new JButton("Clear");
        f1.add(l1);
        f1.add(t1);
        f1.add(b1,BorderLayout.CENTER);
        f1.add(b2);
        f1.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s;
        s="Shiba Bhatta";
        if(e.getSource()==b1)
        {
            t1.setText(s);
        }
        else if(e.getSource()==b2){
            s=" ";
            t1.setText(s);
        }
        else
        {
                s=" ";
        }
    }
    public static void main(String args[])
    {
        new YourName();
    }
 }
       
