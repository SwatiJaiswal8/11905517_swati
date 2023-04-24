package chatapp;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;
class signingup
{
	JFrame jf1;
	JButton b2;
	signingup()
	{
		jf1=new JFrame();
		JLabel l1=new JLabel("Create Account");
		JLabel l2=new JLabel("Enter Username : ");
		JLabel l3=new JLabel("Set Password : ");
		JLabel l4=new JLabel("Re-Enter Password : ");
		JPanel jp1=new JPanel();
		JTextField jtf=new JTextField();
		JPasswordField jpf1=new JPasswordField();
		JPasswordField jpf2=new JPasswordField();
		JButton b1=new JButton("Sign up");
		b2=new JButton("Back");
		jp1.setLayout(null);
		l1.setBounds(200,200,100,100);
		l2.setBounds(70,218,160,150);
		jtf.setBounds(200,280,160,25);
		l3.setBounds(70,269,160,150);
		jpf1.setBounds(200,330,160,25);
		l4.setBounds(70,316,160,150);
		jpf2.setBounds(200,380,160,25);
		b2.setBounds(200,450,100,30);
		b1.setBounds(350,450,100,30);
		jp1.add(l1);
		jp1.add(l2);
		jp1.add(jtf);
		jp1.add(l3);
		jp1.add(jpf1);
		jp1.add(l4);
		jp1.add(jpf2);
		jp1.add(b1);
		jp1.add(b2);
		jf1.add(jp1,BorderLayout.CENTER);
		jf1.setSize(600,700);
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf1.setVisible(true);
		eventHandling();
		
	}
	public void eventHandling()
	{
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand()=="Back") {
					jf1.setVisible(false);
					//jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					try {
						jf1.setVisible(false);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			}
			
		});
	}
	public static void main(String[] args)
	{
		new signingup();
	}
}
