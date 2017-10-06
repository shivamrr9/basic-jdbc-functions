import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyDB extends WindowAdapter implements ActionListener
{
Frame f;
Button b1,b2,b3;
Label l;
MyDB()
{
f=new Frame("Database");
b1=new Button("Add");
b2=new Button("Find");
b3=new Button("Exit");
l=new Label("Welcome to Database");

f.setLayout(null);

b1.setBounds(200,150,100,50);
b2.setBounds(200,250,100,50);
b3.setBounds(200,350,100,50);
l.setBounds(190,80,200,50);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
f.addWindowListener(this);

f.add(b1);
f.add(b2);
f.add(b3);
f.add(l);
f.setSize(500,500);
f.setVisible(true);
}

public static void main(String ar[])
{
MyDB db=new MyDB();
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
Add ad=new Add();
}

if(e.getSource()==b2)
{
Find fd=new Find();
}

if(e.getSource()==b3)
{
System.exit(0);
}
}

public void windowClosing(WindowEvent e)
{
System.exit(0);
}

}