import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*; 
import java.text.*;
import java.util.regex.*;
import javax.swing.border.*;
import java.util.List;

class Payment extends JFrame implements ActionListener
{
	//int x;
	JComboBox card,month,year;
	JCheckBox cb1;
	JButton submit,back;
	String name1;
	JLabel phonenumber;
	JTextField entercvv,cardnumber_tf,phonenumberf,studentname;
	Payment(String name1)
	{	
		this.name1 = name1;

		Font f = new Font("serif",Font.BOLD,19);
		Font f1 = new Font("serif",Font.PLAIN,12);
		Font f2 = new Font("serif",Font.BOLD,12);
		Font f4 = new Font("serif",Font.BOLD,25);
		Font f5 = new Font("serif",Font.BOLD,15);



		JLabel paymentmethods = new JLabel("Payment Method");
		paymentmethods.setBounds(30,15,300,50);
		paymentmethods.setForeground(Color.WHITE);
		paymentmethods.setFont(f);

		ImageIcon paymentimage = new ImageIcon("paymentbackground1122.png");
		JLabel paymentmethod = new JLabel();
		paymentmethod.setIcon(paymentimage);
		paymentmethod.setBounds(350,100,300,180);

		Icon icon6 = new ImageIcon("back.png");
		back = new JButton(icon6);
		back.setBounds(580,10,60,40);
		
		

		//drop down list for payments
		String cards[]={"Visa","MasterCard","Credit Card","Debit Card","Net Banking"};
		card = new JComboBox(cards);
		card.setBounds(50,80,200,30);

		JLabel cardnumber = new JLabel("Card Number");
		cardnumber.setBounds(50,130,150,30);
		cardnumber.setForeground(Color.WHITE);
		cardnumber.setFont(f1);

		cardnumber_tf = new JTextField(16);
		cardnumber_tf.setBounds(50,170,160,30);
		cardnumber_tf.setForeground(Color.BLACK);
		cardnumber_tf.setFont(f2);

		JLabel expdate = new JLabel("Expiration Date");
		expdate.setBounds(50,220,150,30);
		expdate.setForeground(Color.WHITE);
		expdate.setFont(f1);

		String months[]={"Jan","Feb","Mar","Apr","May","June","July","Aug","Sept","Oct","Nov","Dec"};
		String years[]={"2021","2021","2023","2024","2025"};

		month = new JComboBox(months);
		year = new JComboBox(years);

		month.setBounds(50,250,60,30);
		year.setBounds(110,250,70,30);

		JLabel cvv = new JLabel("Enter CVV");
		cvv.setBounds(190,220,150,30);
		cvv.setForeground(Color.WHITE);
		cvv.setFont(f1);

		 entercvv = new JTextField("");
		entercvv.setBounds(195,250,50,30);
		entercvv.setForeground(Color.BLACK);
		entercvv.setFont(f2);

		

		JLabel name = new JLabel("Card Holder Name:");
		name.setBounds(30,330,250,50);
		name.setForeground(Color.WHITE);
		name.setFont(f5);

		studentname = new JTextField(""); 
		studentname.setBounds(220,335,200,30);
		studentname.setForeground(Color.BLACK);
		studentname.setFont(f2);

		
		phonenumber = new JLabel("Mobile NO :");
		phonenumber.setBounds(60,380,250,50);
		phonenumber.setForeground(Color.WHITE);
		phonenumber.setFont(f5);

		phonenumberf = new JTextField(10);
		phonenumberf.setBounds(220,385,200,30);
		phonenumberf.setForeground(Color.BLACK);
		phonenumberf.setFont(f2);
		

		
		cb1 = new JCheckBox("I agree to Terms and Conditions");
		cb1.setBounds(60,440,270,15);
		cb1.setForeground(Color.WHITE);
		cb1.setBackground(Color.BLACK);

		submit = new JButton("PAY");
		submit.setBounds(300,470,70,40);

		


		ImageIcon background_image = new ImageIcon("wallpaper390.png");
		JLabel background = new JLabel("",background_image,JLabel.CENTER);
		background.setBounds(0,0,700,900);

		submit.addActionListener(this);
		back.addActionListener(this);
		background.add(back);
		background.add(submit);
		background.add(paymentmethod);
		background.add(cb1);
		background.add(phonenumber);
		background.add(phonenumberf);	
		background.add(studentname);
		background.add(name);
		background.add(entercvv);
		background.add(cvv);
		background.add(month);
		background.add(year);
		background.add(expdate);
		background.add(cardnumber_tf);
		background.add(cardnumber);
		background.add(paymentmethods);
		background.add(card);
		add(background);

		setSize(700,900);
		setTitle("Payment Portal");  
		setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		// phonenumberf.addKeyListener(new KeyAdapter(){
		// 	public void KeyPressed(KeyEvent ke) {
		// 		String value = phonenumberf.getText();
		// 		int l = value.length();
		// 		if((ke.getKeyChar() >= '0') && (ke.getKeyChar() <='9')) {
		// 			phonenumberf.setEditable(true);
		// 			phonenumber.setText("");
		// 		} else {
		// 			phonenumberf.setEditable(false);
		// 			phonenumber.setText(" * Enter Numerics only");
		// 		}
		// 	}
		// });

		setVisible(true);
	}




	
public void actionPerformed(ActionEvent ae)
{
	String srh = entercvv.getText();
	String rr = cardnumber_tf.getText();
	String mi = phonenumberf.getText();
	if(ae.getSource() == submit )
	{

		if((srh.matches("\\d{3}")) && (rr.matches("\\d{16}")) && (cb1.isSelected() == true) && (mi.matches("\\d{10}")))
		{

			if(studentname.getText().isEmpty())	
			{
				JOptionPane.showMessageDialog(null,"Invalid Credentials , Please check again !");

			}
			else
			{
				JOptionPane.showMessageDialog(null,"Redirecting to Payment Gateway","Info",JOptionPane.INFORMATION_MESSAGE);
				card.setSelectedItem("Visa");
				cardnumber_tf.setText("");
				month.setSelectedItem("Jan");
				year.setSelectedItem("2021");
				studentname.setText(""); 
				phonenumberf.setText("");
				cb1.setSelected(false);
				entercvv.setText("");

			}

		}
	    else
	    {
	    	JOptionPane.showMessageDialog(null,"Invalid !.. Please Check Again");
	    }
	}

	if(ae.getSource() == back)
	{   

		Payfee paynew = new Payfee(name1);
		this.dispose();
	}
}

}





