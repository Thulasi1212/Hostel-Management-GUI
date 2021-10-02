import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*; 
import java.text.*;
import java.util.regex.*;
import javax.swing.border.*;
import java.util.List;

class Complaint extends JFrame implements ActionListener
{
	JButton home,submit;
	JCheckBox cb1,cb2,cb3,cb4,cb5;
	JTextArea ta;
	String name1;
	Complaint(String name1)
	{
		this.name1 = name1;
		//font for the heading
		Font f = new Font("serif",Font.BOLD,40);
		Font f1 = new Font("serif",Font.BOLD,14);
		Font f3 = new Font("serif",Font.BOLD,19);
		Font f4 = new Font("serif",Font.BOLD,24);
		Font f5 = new Font("Comic Sans MS", Font.ITALIC,22);

		//heading label
		JLabel l1 = new JLabel("Drop your Complaint");
		l1.setBounds(420,30,500,100);
		l1.setForeground(Color.WHITE);
		l1.setFont(f);

		//panel around the heading
		JPanel around_the_heading = new JPanel();
		around_the_heading.setLayout(null);
		around_the_heading.setBackground(new Color(255,255,255,80));
		around_the_heading.setBounds(100,23,1100,110);

		//creating check list for common complaints
		cb1 = new JCheckBox("AC not Working");
		cb1.setBounds(90,200,200,40);
		cb1.setFocusable(false);
		cb1.setBackground(new Color(224,255,255,150));
		cb1.setForeground(new Color(0,0,0));
		cb1.setFont(f5);

		cb2 = new JCheckBox("Room Cleaning");
		cb2.setBounds(90,250,200,40);
		cb2.setFocusable(false);
		cb2.setBackground(new Color(224,255,255,150));
		cb2.setForeground(new Color(0,0,0));
		cb2.setFont(f5);

		cb3 = new JCheckBox("Drinking Water problem");
		cb3.setBounds(90,300,330,40);
		cb3.setFocusable(false);
		cb3.setBackground(new Color(224,255,255,150));
		cb3.setForeground(new Color(0,0,0));
		cb3.setFont(f5);

		cb4 = new JCheckBox("Medical Help");
		cb4.setBounds(90,350,210,40);
		cb4.setFocusable(false);
		cb4.setBackground(new Color(224,255,255,150));
		cb4.setForeground(new Color(0,0,0));
		cb4.setFont(f5);

		cb5 = new JCheckBox("INternet Not Working");
		cb5.setBounds(90,400,280,40);
		cb5.setFocusable(false);
		cb5.setBackground(new Color(224,255,255,150));
		cb5.setForeground(new Color(0,0,0));
		cb5.setFont(f5);

		JLabel addcomp = new JLabel("Additional Complaints :");
		addcomp.setBounds(110,520,370,40);
		addcomp.setBackground(new Color(0,0,128,30));
		addcomp.setForeground(new Color(240,255,255));
		addcomp.setFont(f4);

		JPanel around_addcomp = new JPanel();
		around_addcomp.setLayout(null);
		around_addcomp.setBounds(90,510,350,55);
		around_addcomp.setBackground(new Color(0,255,0,90));

		ta = new JTextArea("");
		ta.setBounds(90,570,470,159);
		ta.setFont(f5);
		ta.setLineWrap(true);

		Icon icon1 = new ImageIcon("submit1.png");
		submit = new JButton(icon1);
		submit.setBounds(600,630,40,30);
		ta.setWrapStyleWord(true); 




		ImageIcon header_image = new ImageIcon("complaintbackground.png");
		JLabel header_background = new JLabel();
		header_background.setIcon(header_image);
		header_background.setBounds(650,180,600,350);




		//adding the background image
		ImageIcon background_image = new ImageIcon("wallpapercomplaint1.png");
		JLabel background = new JLabel("",background_image,JLabel.CENTER);
		background.setBounds(0,0,1300,900);



		Icon icon = new ImageIcon("home.png");
		home = new JButton(icon);
		home.setBounds(15,800,50,50);


		JLabel hb = new JLabel("Click Here to go back Home");
		hb.setBounds(75,775,500,100);
		hb.setForeground(Color.WHITE);
		hb.setFont(f1);

		add(background);
		background.add(l1);
		background.add(around_the_heading);
		background.add(home);
		background.add(hb);
		background.add(cb1);
		background.add(cb2);
		background.add(cb3);
		background.add(cb4);
		background.add(cb5);
		background.add(header_background);
		background.add(addcomp);
		background.add(around_addcomp);
		background.add(ta);
		background.add(submit);
		home.addActionListener(this);
		submit.addActionListener(this);

		setSize(1300,900);
		setTitle("Complaint Frame");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
	{
		//String st = ta.getText();
		if(ae.getSource() == home)
		{
			new Main(name1);
			this.dispose();
		}
		//String st = ta.getText();
		if(ae.getSource() == submit)
		{
			if(ta.getText().isEmpty() && ((cb1.isSelected() == false) && (cb2.isSelected() == false) && (cb3.isSelected() == false) && (cb4.isSelected() == false) && (cb5.isSelected() == false)))
			{
				JOptionPane.showMessageDialog(null,"The Field is empty");
			}
			else{
			
			cb1.setSelected(false);
			cb2.setSelected(false);
			cb3.setSelected(false);
			cb4.setSelected(false);
			cb5.setSelected(false);
			ta.setText("Your Complaint is Registered. \nWe will get back to you soon !!..");
		}
		}
		

	}


	// public static void main(String[] args) {
	// 	new Complaint();
	// }
}
