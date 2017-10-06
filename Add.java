import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Add extends WindowAdapter implements ActionListener
{
Frame f;
Button b;
Label l1,l2,l3,l4;
TextField t1,t2,t3,t4;
Statement stmt;

Add()
{
try
{
Class.forName("org.gjt.mm.mysql.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/gandhi","root","");
stmt=con.createStatement();

f=new Frame("Add");
b=new Button("Add");
l1=new Label("Name:");
l2=new Label("PhoneNo.:");
l3=new Label("City:");
l4=new Label("College:");
t1=new TextField(); 
t2=new TextField();
t3=new TextField();
t4=new TextField();

f.setLayout(new GridLayout(5,2));
f.addWindowListener(this);
b.addActionListener(this);

f.add(l1);
f.add(t1);
f.add(l2);
f.add(t2);
f.add(l3);
f.add(t3);
f.add(l4);
f.add(t4);
f.add(b);
f.setSize(500,500);
f.setVisible(true);
}
catch(Exception e1)
{
System.out.println(e1.getMessage());
}
}

public void actionPerformed(ActionEvent e)
{
try
{
stmt.executeUpdate("insert into DB values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"');");
stmt.close();
f.dispose();
}
catch(Exception e1)
{
System.out.println(e1.getMessage());
}
}

public void windowClosing(WindowEvent e)
{
f.dispose();
}


} 