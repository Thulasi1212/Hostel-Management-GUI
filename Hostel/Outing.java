import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*; 
import java.text.*;
import java.util.regex.*;
import javax.swing.border.*;
import java.util.List;

class Outing extends JFrame implements ActionListener
{
	int i,j;
	JButton home,submit;
	ButtonGroup bg,bg1;
	JRadioButton r1,r2,r3,r4;
	JTextArea ta;
	JComboBox day,month,year,day1,month1,year1,time,time1,minutes1,minutes3;
	String name1;
	Outing(String name1)
	{
		this.name1 = name1;
		//all the fonts we have used in this frame
		Font f = new Font("serif",Font.BOLD,40);
		Font f1 = new Font("serif",Font.BOLD,14);
		Font f4 = new Font("serif",Font.BOLD,19);

		//Main Heading
		JLabel l1 = new JLabel("OUT - PASS");
		l1.setBounds(530,30,510,100);
		l1.setForeground(Color.WHITE);
		l1.setFont(f);

		//panel around the heading
		JPanel around_the_heading = new JPanel();
		around_the_heading.setLayout(null);
		around_the_heading.setBackground(new Color(255,255,255,80));
		around_the_heading.setBounds(300,23,700,110);

		//label for Date
		JLabel l2 = new JLabel(" DATE :  ");
		l2.setBounds(220,250,200,40);
		l2.setForeground(Color.WHITE);
		l2.setFont(f4);

		//cobo box for drop down date , month and year
		String days1[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String months1[] = {"Jan","Feb","Mar","Apr","May","June","July","Aug","Sept","Oct","Nov","Dec"};
		String years1[] = {"2021"};

		day1 = new JComboBox(days1);
		month1 = new JComboBox(months1);
		year1 = new JComboBox(years1);

		day1.setBounds(350,250,50,40);
		month1.setBounds(405,250,60,40);
		year1.setBounds(470,250,80,40);

		//label for in time
		JLabel 	l3 = new JLabel(" TIME : ");
		l3.setForeground(Color.WHITE);
		l3.setBounds(220,300,200,40);
		l3.setFont(f4);

		JLabel semi = new JLabel(":");
		semi.setBounds(410,300,20,40);
		semi.setForeground(Color.WHITE);

		//check box for the time 1-12
		String time2[] = {"1","2","3","4","5","6","7","8","9","10","11","12"};
		time1 = new JComboBox(time2);
		time1.setBounds(350,300,50,40);

		String minutes[] = {"0","5","10","15","20","25","30","35","40","45","50","55","60"};
		minutes1 = new JComboBox(minutes);
		minutes1.setBounds(430,300,50,40);
		//radio buttons for am an pm
		r1 = new JRadioButton("AM");
		r1.setBackground(new Color(0,0,128,90));
		r1.setForeground(Color.WHITE);
		r1.setBounds(510,300,50,40);
		r2 = new JRadioButton("PM");
		r2.setBackground(new Color(0,0,128,90));
		r2.setForeground(Color.WHITE);
		r2.setBounds(570,300,50,40);
		bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);

		//label for expected in date
		JLabel l4 = new JLabel("EXP. In Date : ");
		l4.setForeground(Color.WHITE);
		l4.setBounds(140,350,200,40);
		l4.setFont(f4);
		//checkbox for date month and year
		String days[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String months[] = {"Jan","Feb","Mar","Apr","May","June","July","Aug","Sept","Oct","Nov","Dec"};
		String years[] = {"2021"};

		day = new JComboBox(days);
		month = new JComboBox(months);
		year = new JComboBox(years);

		day.setBounds(350,350,50,40);
		month.setBounds(405,350,60,40);
		year.setBounds(470,350,80,40);

		//label for expected in time
		JLabel l5 = new JLabel("EXP. In Time : ");
		l5.setForeground(Color.WHITE);
		l5.setBounds(140,400,200,40);
		l5.setFont(f4);

		JLabel semi1 = new JLabel(":");
		semi1.setBounds(410,400,20,40);
		semi1.setForeground(Color.WHITE);

		String time4[] = {"1","2","3","4","5","6","7","8","9","10","11","12"};
		time = new JComboBox(time4);
		time.setBounds(350,400,50,40);

		//String minutes = {"0","5","10","15","20","25","30","35","40","45","50","55","60"};
		minutes3 = new JComboBox(minutes);
		minutes3.setBounds(430,400,50,40);


		r3 = new JRadioButton("AM");
		r3.setBackground(new Color(0,0,128,90));
		r3.setForeground(Color.WHITE);
		r3.setBounds(510,400,50,40);
		r4 = new JRadioButton("PM");
		r4.setBackground(new Color(0,0,128,90));
		r4.setForeground(Color.WHITE);
		r4.setBounds(570,400,50,40);
		bg1 = new ButtonGroup();
		bg1.add(r3);
		bg1.add(r4);


		//label for reason statement 
		JLabel l6 = new JLabel("REASON : ");
		l6.setForeground(Color.WHITE);
		l6.setBounds(190,600,150,40);
		l6.setFont(f4);


		ta = new JTextArea("");
		ta.setBounds(350,600,400,150);
		ta.setLineWrap(true);
		ta.setFont(f4);

		Icon icon2 = new ImageIcon("outingsideimage.jpg");

		JLabel image = new JLabel();
		image.setIcon(icon2);
		image.setBounds(750,160,500,400);


		//setting icon for home button
		Icon icon = new ImageIcon("home.png");
		home = new JButton(icon);
		home.setBounds(15,800,50,50);

		Icon icon7 = new ImageIcon("submit.png");
		submit = new JButton(icon7);
		submit.setBounds(780,650,40,30);

		//text to let the user know that when they click on the icon it takes back to homescreen
		JLabel hb = new JLabel("Click Here to go back Home");
		hb.setBounds(75,775,500,100);
		hb.setForeground(Color.WHITE);
		hb.setFont(f1);

		//adding the background image
		ImageIcon background_image = new ImageIcon("wallpaperouting1.jpg");
		JLabel background = new JLabel("",background_image,JLabel.CENTER);
		background.setBounds(0,0,1300,900);

		add(background);
		background.add(home);
		background.add(hb);
		background.add(l1);
		background.add(around_the_heading);
		background.add(l2);
		background.add(year1);
		background.add(month1);
		background.add(day1);
		background.add(l3);
		background.add(time1);
		background.add(r1);
		background.add(r2);
		background.add(l4);
		background.add(year);
		background.add(month);
		background.add(day);
		background.add(l5);
		background.add(time);
		background.add(r3);
		background.add(r4);
		background.add(l6);
		background.add(ta);
		background.add(submit);
		background.add(image);
		background.add(semi);
		background.add(minutes1);
		background.add(semi1);
		background.add(minutes3);
		home.addActionListener(this);
		// r1.addActionListener(this);
		// r2.addActionListener(this);
		// r3.addActionListener(this);
		// r4.addActionListener(this);
		

		setSize(1300,900);
		setTitle("Outing Frame");
		setResizable(true);
		submit.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		month1.addActionListener(this);
		month.addActionListener(this);

		setVisible(true);

	}

	public void actionPerformed(ActionEvent ae)
	{
		// i = month1.getSelectedIndex();
		// j = month.getSelectedIndex();

		if(ae.getSource() == home)
		{
			new Main(name1);
			this.dispose();
		}
		if(ae.getSource() == submit)
		{
			i = month1.getSelectedIndex();
	    	j = month.getSelectedIndex();

			if((ta.getText().isEmpty()) || (((r1.isSelected() == false) && (r2.isSelected() == false)) || ((r3.isSelected() == false) && (r4.isSelected() == false)) || (i > j)))
			{
				JOptionPane.showMessageDialog(null,"Invalid Credentials");
			}
			else if(i == j)
			{
				if(day1.getSelectedIndex() > day.getSelectedIndex())
				{
				JOptionPane.showMessageDialog(null,"Invalid Credentials");	
			    } 
			    else if(day1.getSelectedIndex() == day.getSelectedIndex())
			    {
			    	if((r2.isSelected() == true) && (r3.isSelected() == true) )
			    	{
			    		JOptionPane.showMessageDialog(null,"Invalid Credentials");
			    	}
			    	else  if((r1.isSelected()==true) && (r4.isSelected()==true ))

			    	{
			    		ta.setText("Enjoy your Outing !!..");
			    	}
			    	else
			    	{
			    	if(time1.getSelectedIndex() > time.getSelectedIndex())
			    	{
			    		JOptionPane.showMessageDialog(null,"Invalid Credentials");
			    	}
			    	else if(time1.getSelectedIndex() == time.getSelectedIndex())
			    	{
			    		if(minutes1.getSelectedIndex() > minutes3.getSelectedIndex())
			    		{
			    			JOptionPane.showMessageDialog(null,"Invalid Credentials");	
			    		}
			    	}
                 }
			    }
			    ta.setText("Enjoy your Outing !!..");

			}
			else
			{
				day1.setSelectedItem("1");
				month1.setSelectedItem("Jan");
				year1.setSelectedItem("2021");
				day.setSelectedItem("1");
				month.setSelectedItem("Jan");
				year.setSelectedItem("2021");
				time1.setSelectedItem("1");
				minutes1.setSelectedItem("0");
				time.setSelectedItem("1");
				minutes3.setSelectedItem("0");
				// r1.setSelected(false);
				// r2.setSelected(false);
				// r3.setSelected(false);
				// r4.setSelected(false);
				// bg.setSelected(bg.getSelection(),false);
				bg.clearSelection();
				bg1.clearSelection();
				ta.setText("Enjoy your Outing !!..");
			}
		}
		
}

}

