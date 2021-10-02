import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*; 
import java.text.*;
import java.util.regex.*;
import javax.swing.border.*;
import java.util.List;

class Main extends JFrame implements ActionListener
{
	JButton  messlogo,payfees1,outpass,complaintlogo,logout;
	JTextArea ta,ta1,ta2,ta3;
	String name1;
	Main(String name1)
	{
		this.name1 = name1;

		Font f = new Font("serif",Font.BOLD,40);
		Font f1 = new Font("serif",Font.BOLD,18);
		Font f2 = new Font("Comic Sans MS",  Font.ITALIC,20);/*Font.BOLD*/

		JLabel l1 = new JLabel("Hostel Management");
		l1.setBounds(430,70,500,100);
		l1.setForeground(Color.WHITE);
		l1.setFont(f);

		JPanel around_the_heading = new JPanel();
		around_the_heading.setLayout(null);
		around_the_heading.setBackground(new Color(0,0,0,150));
		around_the_heading.setBounds(0,63,1300,110);


		// Icon icon = new ImageIcon("home.png");
		// home = new JButton(icon);
		// home.setBounds(15,200,50,50);
		logout = new JButton("LogOut");
		logout.setBounds(1190,10,100,40);
		logout.setFocusable(false);
		logout.setBackground(Color.BLACK);
		logout.setForeground(Color.WHITE);

		JPanel around_the_text = new JPanel();
		around_the_text.setLayout(null);
		around_the_text.setBackground(new Color(0,255,255,150));
		around_the_text.setBounds(230,230,1050,590);

		JPanel vertical = new JPanel();
		vertical.setLayout(null);
		vertical.setBackground(new Color(0,0,0,150));
		vertical.setBounds(130,0,70,900);


		

		//setting up the mess icon
		Icon icon2 = new ImageIcon("foodlogo.png");
		messlogo = new JButton(icon2);
		messlogo.setBounds(15,380,50,50);

		

		//setting up the payfees icon
		Icon icon3 = new ImageIcon("payfees.png");
		payfees1 = new JButton(icon3);
		payfees1.setBounds(15,440,50,50);
		

		// setting up the outpass icon button
		Icon icon4 = new ImageIcon("outpass.png");
		outpass = new JButton(icon4);
		outpass.setBounds(15,500,50,50);
		

		//setting us the icon for complaint box
		Icon icon5 = new ImageIcon("complaintlogo.png");
		complaintlogo = new JButton(icon5);
		complaintlogo.setBounds(15,320,50,50);

	    ta = new JTextArea("           Mahindra University is well known for its extensive residential facilities. Students have the luxury of being located in Bahadurpally, one of the finer suburbs of Hyderabad, outside the bustle of the city, yet not far from  the attractions of the city during weekends. Staying in the campus is particularly attractive because resident students have access to several facilities. ");
		
		ta.setBounds(250,240,1000,130);
		ta.setLineWrap(true);
		ta.setWrapStyleWord(true); 
		ta.setEditable(false);
		ta.setBackground(new Color(225,225,225,50));
		ta.setForeground(Color.BLACK);
		ta.setFont(f2);

		ta1 = new JTextArea("          MU currently has eight functional hostels that offer twin sharing non-AC rooms for the students. Seven out of these eight hostels have attached wash-rooms in every room. The hostels have a home-like ambience which make the students feel comfortable. The hostels also include amenities which allow the students to indulge in various extra-curricular activities within the premises.");
		
		ta1.setBounds(250,410,1000,140);
		ta1.setLineWrap(true);
		ta1.setWrapStyleWord(true); 
		ta1.setEditable(false);
		ta1.setBackground(new Color(225,225,225,50));
		ta1.setForeground(Color.BLACK);
		ta1.setFont(f2);

		ta2 = new JTextArea("           To ensure the safety of the students, biometric attendance is taken every night in the respective hostel blocks.");
		ta2.setBounds(250,590,1000,55);
		ta2.setLineWrap(true);
		ta2.setWrapStyleWord(true); 
		ta2.setEditable(false);
		ta2.setBackground(new Color(225,225,225,50));
		ta2.setForeground(Color.BLACK);
		ta2.setFont(f2);

		ta3 = new JTextArea("          The spacious and comfortable hostel premises along with excellent food and co-curricular activities help in the holistic growth of an individual by providing them space and sustenance along with stimulating their creativity. It comes as no surprise that many consider it the best hostel and Mess facility");
		ta3.setBounds(250,680,1000,140);
		ta3.setLineWrap(true);
		ta3.setWrapStyleWord(true); 
		ta3.setEditable(false);
		ta3.setBackground(new Color(225,225,225,50));
		ta3.setForeground(Color.BLACK);
		ta3.setFont(f2);
		
		


		//background image
		ImageIcon background_image = new ImageIcon("college.jpg");

		//background label to add image
		JLabel background = new JLabel("",background_image,JLabel.CENTER);
		background.setBounds(0,0,1300,900);

		complaintlogo.addActionListener(this);
		outpass.addActionListener(this);
		payfees1.addActionListener(this);
		messlogo.addActionListener(this);
		//home.addActionListener(this);
		logout.addActionListener(this);

		background.add(l1);
		background.add(around_the_heading);
		//background.add(rooms);
		background.add(complaintlogo);
		background.add(outpass);
		background.add(payfees1);
		background.add(messlogo);
		background.add(logout);
		background.add(ta);
		background.add(ta1);
		background.add(ta2);
		background.add(ta3);
		background.add(around_the_text);
		background.add(vertical);
		//background.add(home);
		add(background);

		setSize(1300,900);
		setTitle("Payfees Frame");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e)
{
// if(e.getSource()==home)
// {

// Main main = new Main();
// this.dispose();
// }
if(e.getSource()==messlogo)
{
Mess mess = new Mess(name1);
this.dispose();
}
if(e.getSource()==payfees1)
{

Payfee fee = new Payfee(name1);
this.dispose();

}
if(e.getSource()==complaintlogo)
{

Complaint complaint = new Complaint(name1);
this.dispose();

}
if(e.getSource()==outpass)
{

Outing out = new Outing(name1);
this.dispose();

}
if(e.getSource() == logout)
{
	new Confirmation(name1);
	this.dispose();
}
}


// public static void main(String[] args) {
// 	new Main();
// }
}

