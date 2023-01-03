import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class traffic1 implements ActionListener
{ 
    JRadioButton r1,r2,r3;
    JPanel p1,p2,p3;
    traffic1()
    { 
        JFrame f=new JFrame();
        r1=new JRadioButton("green");
        r1.setBounds(100,100,50,50);
        r1.addActionListener(this);
        r2=new JRadioButton("yellow");
        r2.setBounds(100,150,50,50);
        r2.addActionListener(this);
        r3=new JRadioButton("red");
        r3.setBounds(100,200,50,50);
        r3.addActionListener(this);
        p1=new JPanel();
        p1.setBounds(300,100,60,60);
        p1.setBackground(Color.BLACK);
        p2=new JPanel();
        p2.setBounds(300,170,60,60);
        p2.setBackground(Color.BLACK);
        p3=new JPanel();
        p3.setBounds(300,240,60,60);
        p3.setBackground(Color.BLACK);
        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.add(r1);
        f.add(r2);
        f.add(r3);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);



    }
    public void actionPerformed(ActionEvent e)
    { 
        if(e.getSource()==r1)
        { 
            p1.setBackground(Color.GREEN);
            p2.setBackground(Color.BLACK);
            p3.setBackground(Color.BLACK);
        }
        else if(e.getSource()==r2)
        { 
            p1.setBackground(Color.BLACK);
            p2.setBackground(Color.YELLOW);
            p3.setBackground(Color.BLACK);
        }
        else if(e.getSource()==r3)
        { 
            p1.setBackground(Color.BLACK);
            p2.setBackground(Color.BLACK);
            p3.setBackground(Color.RED);
        }
    }
    public static void main(String args[])
    { 
        traffic1 obj=new traffic1();
    }
}