package chatapp;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

public class Loginpage extends JFrame implements ActionListener{
	JLabel l1,l2;
	JTextField t1;
	JPasswordField jp;
	JButton jb;
	JPanel p;
	Loginpage(){
		setSize(800,800);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		l1 = new JLabel("Enter Username");
		t1 = new JTextField(20);
		l2 = new JLabel("Enter Password");
		jp = new JPasswordField(20);
		jb = new JButton("Login");
		//p = new JPanel();
		jb.addActionListener(this);
		add(l1);
		add(t1);
		add(l2);
		add(jp);
		add(jb);
	    //jb.setBounds(100,200, 100, 100);
	    //p.setLayout(null);
	    //add(p);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db","root","2021@Hope");
			System.out.println("database is connected");
			Statement st = con.createStatement();
			String query = "select password from credentials where username = '"+t1.getText()+"'";
			
			ResultSet rs = st.executeQuery(query);
			String get_password="";
			char[] passwordChars = jp.getPassword();
			String password = new String(passwordChars);
			while(rs.next()) {
				get_password = rs.getString(1);
				System.out.println("Password :"+get_password);
				System.out.println("Password is :"+password);
			}
			if(get_password!=null && get_password.equals(password))  {
				System.out.println("Login is success.");
				new client();
				this.setVisible(false);
			}
			else {
				JOptionPane.showMessageDialog(null, "username or password is incorrect");
			}
		}
		catch(Exception e1) {
			System.out.println(e1);
		}
	}
	public static void main(String[] args) {
		
		new Loginpage();

	}

}