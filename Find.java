import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Find extends WindowAdapter implements KeyListener,ActionListener
{
Frame f;
Button b;
TextField t;
List l;
Label l1,l2;
String s;
Statement stmt;
ResultSet rs;

Find()
{
try
{
Class.forName("org.gjt.mm.mysql.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/gandhi","root","");
stmt=con.createStatement();

f=new Frame("Find");
b=new Button("Update");
t=new TextField();
l=new List(2);
l1=new Label("Name:");
l2=new Label("Select the option to update:");
s=new String();

f.setLayout(null);
f.addWindowListener(this);
t.addKeyListener(this);
b.addActionListener(this);

l1.setBounds(10,70,100,50);
t.setBounds(120,70,300,50);
b.setBounds(50,420,100,25);
l2.setBounds(10,150,400,50);
l.setBounds(50,200,400,200);
f.add(l1);
f.add(l2);
f.add(t);
f.add(l);
f.add(b);

rs=stmt.executeQuery("select * from db;");
while(rs.next())
{
l.add(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4));
}

f.setSize(500,500);
f.setVisible(true);
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}

public void keyTyped(KeyEvent e)
{

}

public void keyPressed(KeyEvent e)
{

}

public void keyReleased(KeyEvent e)
{
l.clear();
s=t.getText();
try
{
rs=stmt.executeQuery("select * from db where name like '"+s+"%'");

while(rs.next())
{
l.add(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4));
}

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
String a[]=l.getSelectedItem().toString().split(",");
Update u=new Update(a);
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