import java.awt.*;
import javax.swing.*;
public class SimpleGUI {
    JFrame f1;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JRadioButton rb1,rb2;
    JButton b1,b2,b3,b4,b5,b6,b7;
    SimpleGUI()
            {
                f1=new JFrame("NCIT college");
                f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                f1.setSize(400,400);
                GridBagLayout g1=new GridBagLayout();
                f1.setLayout(g1);
                GridBagConstraints gbc=new GridBagConstraints();
                l1=new JLabel("Enter Name");
                gbc.gridx=0;
                gbc.gridy=0;
                g1.setConstraints(l1, gbc);
                f1.add(l1);
                l2=new JLabel("Enter Email");
                gbc.gridx=0;
                gbc.gridy=1;
                g1.setConstraints(l2, gbc);
                f1.add(l2);
                l3=new JLabel("Select Gender");
                gbc.gridx=0;
                gbc.gridy=2;
                g1.setConstraints(l3, gbc);
                f1.add(l3);
                l4=new JLabel("City");
                gbc.gridx=0;
                gbc.gridy=6;
                g1.setConstraints(l4, gbc);
                f1.add(l4);
                t1=new JTextField();
                gbc.gridx=1;
                gbc.gridy=0;
                gbc.gridwidth=1;
                gbc.gridheight=1;
                gbc.fill=GridBagConstraints.HORIZONTAL;
                g1.setConstraints(t1, gbc);
                f1.add(t1);
                t2=new JTextField();
                gbc.gridx=1;
                gbc.gridy=1;
                gbc.gridwidth=1;
                gbc.gridheight=1;
                gbc.fill=GridBagConstraints.HORIZONTAL;
                g1.setConstraints(t2, gbc);
                f1.add(t2);
                ButtonGroup bg=new ButtonGroup();
                //bg.add(rb1);
//                bg.add(rb2);
                rb1=new JRadioButton("male");
                gbc.gridx=1;
                gbc.gridy=2;
                g1.setConstraints(rb1, gbc);
                bg.add(rb1);
                f1.add(rb1);
               rb2=new JRadioButton("Female");
                gbc.gridx=3;
                gbc.gridy=2;
                g1.setConstraints(rb2, gbc);
                bg.add(rb2);
                f1.add(rb2);
                b1=new JButton("kathmandu");
                gbc.gridx=1;
                gbc.gridy=4;
                g1.setConstraints(b1, gbc);
                f1.add(b1);
                b2=new JButton("bhaktpur");
                gbc.gridx=1;
                gbc.gridy=5;
                g1.setConstraints(b2, gbc);
                f1.add(b2);
                b3=new JButton("Lalitpur");
                gbc.gridx=1;
                gbc.gridy=6;
                g1.setConstraints(b3, gbc);
                f1.add(b3);   
                b4=new JButton("Chitwan");
                gbc.gridx=1;
                gbc.gridy=7;
                g1.setConstraints(b4, gbc);
                f1.add(b4);   
                b5=new JButton("pokhara");
                gbc.gridx=1;
                gbc.gridy=8;
                g1.setConstraints(b5, gbc);
                f1.add(b5);    
                b6=new JButton("Submit");
                gbc.gridx=0;
                gbc.gridy=9;
                g1.setConstraints(b6, gbc);
                f1.add(b6); 
                b7=new JButton("reset");
                gbc.gridx=3;
                gbc.gridy=9;
                g1.setConstraints(b7, gbc);
                f1.add(b7);
                f1.setVisible(true);
            }
                
    public static void main(String args[])
    {
        new  SimpleGUI();
    }
    
}
