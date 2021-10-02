import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*; 
import java.text.*;
import java.util.regex.*;
import javax.swing.border.*;
import java.util.List;

class Login extends JFrame implements ActionListener
{
	JButton log_in;
	JLabel l1,l3;
	JTextField username;
	JPasswordField password;
	Login()
	{		
		//setting font
		//f is for the username label font
		Font f = new Font("serif",Font.BOLD,19);
		//g is for the font inside the username Textfield
		Font g = new Font("Comic Sans MS",Font.BOLD,20);
		//h is the font for the login button
		Font h = new Font("serif",Font.BOLD,13);




		//adding header image meclogo
		ImageIcon header_image = new ImageIcon("meclogo.png");
		
		
		
		// label for the image meclogo
		JLabel header_background = new JLabel();
		header_background.setIcon(header_image);
		header_background.setBounds(30,10,590,130);

		//label for the remaining space 
		JLabel background = new JLabel();
		background.setBounds(0,170,650,380);

		//panel all around the credentials to spice up the asthetics of the page
		JPanel login = new JPanel();
		login.setLayout(null);
		//login.setSize(600,350);
		login.setBackground(new Color(0,139,139,75));
		login.setBounds(100,5,450,290);

		//Jlabel for username
		l1 = new JLabel("UserName :");
		l1.setBounds(180,50,190,50);
		l1.setForeground(new Color(0,0,0));
		l1.setFont(f);
		background.add(l1);

		//creating a text field to enter the password
		username = new JTextField("");
		username.setBounds(320,50,150,50);
		username.setFont(g);
		background.add(username);

		//jlabel for the passwor text
		l3 = new JLabel("Password :");
		l3.setBounds(180,140,190,50);
		l3.setForeground(new Color(0,0,0));
		l3.setFont(f);
		background.add(l3);

		//creating text field to enter the password
		password = new JPasswordField("");
		password.setBounds(320,140,150,50);
		password.setFont(g);
		background.add(password);

		//button for the login
		log_in = new JButton("Login");
		log_in.setBounds(190,210,90,40);
		log_in.setFocusable(false);
		log_in.setBackground(new Color(0,0,0,80));
		log_in.setForeground(Color.WHITE);
		log_in.setFont(h);
		login.add(log_in);



		setSize(650,550);
		setTitle("Login Form");
		setResizable(false);
		log_in.addActionListener(this);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		//adding part
		background.add(login);
		add(background);
		add(header_background);
		

		setLayout(null);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent ae)
	{
		String userName = username.getText();
		String passWord = String.valueOf(password.getPassword());

		if(ae.getSource() == log_in)
		{

		
		if((userName.equals("Sathvik") && passWord.equals("19532")) || (userName.equals("Haneeth") && passWord.equals("19531")) || (userName.equals("Saketh") && passWord.equals("19527")))
		{
			System.out.println("Logged IN");
			Main main_page = new Main(userName);
			this.dispose();
		}
		else
		{
			System.out.println("Wrong Username/passWord");
			JOptionPane.showMessageDialog(null,"Username / Password is wrong !!!...","Error",JOptionPane.WARNING_MESSAGE);
		}



		}
	}

	public static void main(String[] args) {
		new Login();
	}
}

