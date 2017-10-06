import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Update extends WindowAdapter implements ActionListener
{
Frame f;
Button b;
Label l1,l2,l3,l4;
TextField t1,t2,t3,t4;
Statement stmt;

Update(String a[])
{
try
{
Class.forName("org.gjt.mm.mysql.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/gandhi","root","");
stmt=con.createStatement();

f=new Frame("Update");
b=new Button("Update");
l1=new Label("Name:");
l2=new Label("PhoneNO.:");
l3=new Label("City:");
l4=new Label("College:");
t1=new TextField(); 
t2=new TextField();
t3=new TextField();
t4=new TextField();

t1.setText(a[0]);
t2.setText(a[1]);
t3.setText(a[2]);
t4.setText(a[3]);

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
stmt.executeUpdate("update DB set Phone='"+t2.getText()+"' where name='"+t1.getText()+"';");
stmt.executeUpdate("update DB set City='"+t3.getText()+"' where name='"+t1.getText()+"';");
stmt.executeUpdate("update DB set College='"+t4.getText()+"' where name='"+t1.getText()+"';");

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