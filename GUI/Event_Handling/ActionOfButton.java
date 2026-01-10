import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 class ActionOfButton implements ActionListener {
     JFrame f1;
     JButton b1,b2,b3;
     JPanel p1;
     ActionOfButton()
     {
         f1=new JFrame("Action of Button Clicked");
         b1=new JButton("RED");
         b2=new JButton("BLUE");
         b3=new JButton("GREEN");
         p1=new JPanel();
         f1.setSize(400,400);
         f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         f1.setVisible(true);
         p1.add(b1);
         p1.add(b2);
         p1.add(b3);
         f1.add(p1);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
     }
     public static void main(String args[])
     {
         new ActionOfButton();
     }
     public void actionPerformed(ActionEvent e)
     {
         if(e.getSource()==b1)
         {
             //b1.setForeground(Color.RED);
             b1.setBackground(Color.RED);
         }
         else if(e.getSource()==b2)
         {
             //b2.setForeground(Color.BLUE);
             b2.setBackground(Color.BLUE);
         }
         else
         {
            // b3.setForeground(Color.GREEN);
             b3.setBackground(Color.GREEN);
         }
     }
 
}
