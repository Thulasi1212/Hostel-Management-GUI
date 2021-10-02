import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*; 
import java.text.*;
import java.util.regex.*;
import javax.swing.border.*;
import java.util.List;

class Payfee extends JFrame implements ActionListener
{
	JCheckBox cb1;
	JTable table,table1;
	JButton home,pay; // messlogo,payfees,outpass,complaintlogo,rooms;
	String name1;
	Payfee(String name1)
	{
		this.name1 = name1;
		//font for the header text
		Font f = new Font("serif",Font.BOLD,40);

		Font f1 = new Font("serif",Font.BOLD,20);
		Font f3 = new Font("serif",Font.BOLD,15);
		Font f4 = new Font("serif",Font.BOLD,17);


		//header text
		JLabel l1 = new JLabel("Pay Fees");
		l1.setBounds(510,30,500,100);
		l1.setForeground(Color.WHITE);
		l1.setFont(f);

		JPanel around_the_heading = new JPanel();
		around_the_heading.setLayout(null);
		around_the_heading.setBackground(new Color(255,255,255,80));
		around_the_heading.setBounds(100,23,1100,110);

		Icon icon = new ImageIcon("home.png");
		home = new JButton(icon);
		home.setBounds(15,800,50,50);

		JLabel hb = new JLabel("Click Here to go back Home");
		hb.setBounds(75,775,500,100);
		hb.setForeground(Color.WHITE);
		hb.setFont(f1);

		//JPanel around_the_text = JPanel()
		

		
		//label for name 
		JLabel name = new JLabel("Name : Mr " + name1);
		name.setBounds(130,210,350,40);
		name.setForeground(new Color(0x00FFFF));
		name.setFont(f1);

		JLabel clas = new JLabel("Class/Section : 19th Batch/CSE");
		clas.setBounds(700,210,420,40);
		clas.setForeground(new Color(0x00FFFF));
		clas.setFont(f1);

		JLabel fathername = new JLabel("Father Name : Mr XXXXXXX XXXXX");
		fathername.setBounds(130,260,420,40);
		fathername.setForeground(new Color(0x00FFFF));
		fathername.setFont(f1);

		JLabel student_type = new JLabel("Student Type : Residential");
		student_type.setBounds(700,260,300,40);
		student_type.setForeground(new Color(0x00FFFF));
		student_type.setFont(f1);

		JLabel feedetails = new JLabel("Fee Details:");
	    feedetails.setBounds(130,340,190,40);
		feedetails.setForeground(new Color(0x00FFFF));
		feedetails.setFont(f3);

		JLabel totalfeedues = new JLabel("Total Fee Dues : Rs 1,99,000");
	    totalfeedues.setBounds(350,340,250,40);
		totalfeedues.setForeground(new Color(0x00FFFF));
		totalfeedues.setFont(f3);


        JLabel totalpaid = new JLabel("Total Paid : RS 3,95,000");
	    totalpaid.setBounds(680,340,250,40);
		totalpaid.setForeground(new Color(0x00FFFF));
		totalpaid.setFont(f3);
  

        JLabel totalconcession = new JLabel("Total Concession: Rs 10,000");
	    totalconcession.setBounds(970,340,230,40);
		totalconcession.setForeground(new Color(0x00FFFF));
		totalconcession.setFont(f3);

		String[] column = {"Head-Name","Actual Amount","Approved \n Concession","Paid Amount","Due Amount","Fee For","Due Date","Paying Amount"};

		String[][] data = {
							{"HostelFee 1stInstallment","Rs.XXXXX","Rs XXXXX","Rs XXXXX","Rs XXXXX","Rs XXXXX","Rs XXXXX","Rs XXXXX","Rs XXXXX"}

		};

		table = new JTable(data,column)
		{
			public boolean isCellEditable(int data , int column)

			{
				return false;
			}
		};

		JScrollPane pane = new JScrollPane(table);
		pane.setBounds(80,380,1199,50);

		JLabel totalamountin= new JLabel("Total Amount In Rs: 2,12,999");
	    totalamountin.setBounds(130,440,300,40);
		totalamountin.setForeground(new Color(0x00FFFF));
		totalamountin.setFont(f3);

		// JLabel agree= new JLabel("I agree Terms and Conditions");
	 //    agree.setBounds(300,410,300,40);
		// agree.setForeground(new Color(0x00FFFF));
		// agree.setFont(f3);

		// cb1 = new JCheckBox("I agree to terms and conditions");
		// cb1.setBounds(270,420,255,15); 
		// cb1.setForeground(Color.WHITE);
		// cb1.setBackground(Color.BLACK);

		pay = new JButton("PAY Online");
		pay.setBounds(530,468,120,25);


        JLabel paidtotal = new JLabel("Previous Payments :-");
	    paidtotal.setBounds(140,570,300,40);
		paidtotal.setForeground(new Color(0x00FFFF));
		paidtotal.setFont(f4);


		String[] column1 = {"S.NO","Head Name","Amount","Date of Payment","Paid By","Mode of Pay","Status"};
		String[][] data1 = {
							{"1","4th sem","200000","Jan 1st 2021","Parent","Online","SUCCESS"},
							{"2","3rd sem","200000","Aug 1st 2020","Parent","Online","SUCCESS"},
							{"3","2nd sem","300000","Jan 1st 2020","Parent","Online","SUCCESSS"},
							{"4","1st sem","300000","July 2nd 2019","Parent","Online","SUCCESS"},

		};

		table1 = new JTable(data1,column1)
		{
			public boolean isCellEditable(int data1,int column1)
			{
				return false;
			}
		};

		JScrollPane pane1 = new JScrollPane(table1);
		pane1.setBounds(80,610,1199,100);
		


		//background image
		ImageIcon background_image = new ImageIcon("wallpaper391.png");
		//background label to add image
		JLabel background = new JLabel("",background_image,JLabel.CENTER);
		background.setBounds(0,0,1300,900);

		//adding

		pay.addActionListener(this);
		home.addActionListener(this);
		background.add(hb);
		background.add(pane1);
		background.add(paidtotal);
		background.add(pay);
		//background.add(cb1);
		//background.add(agree);
		background.add(totalamountin);
		background.add(pane);
		background.add(totalconcession);
		background.add(totalpaid);
		background.add(totalfeedues);
		background.add(feedetails);
		background.add(student_type);
		background.add(fathername);
		background.add(clas);
		background.add(name);
		// background.add(rooms);
		// background.add(complaintlogo);
		// background.add(outpass);
		// background.add(payfees);
		// background.add(messlogo);
		background.add(home);
		background.add(around_the_heading);
		background.add(l1);
		add(background);

		//frame properties
		setSize(1300,900);
		setTitle("Payfees Frame");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setVisible(true);


	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == home)
		{
			new Main(name1);
			this.dispose();
		}
		if(ae.getSource() == pay)
		{
			Payment extentionfeepayment = new Payment(name1);
			this.dispose();
		}
	}


	// public static void main(String[] args) {
	// 		new Payfee();
	// 	}	
}
