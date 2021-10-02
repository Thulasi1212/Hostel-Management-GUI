import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*; 
import java.text.*;
import java.util.regex.*;
import javax.swing.border.*;
import java.util.List;

class Mess extends JFrame implements ActionListener
{
	JTable table;
	JButton home,submit;
	JTextArea ta,ta1;
	String name1;
	Mess(String name1)
	{
		this.name1 = name1;

		Font f = new Font("serif",Font.BOLD,40);
		Font f1 = new Font("serif",Font.BOLD,14);
		Font f2 = new Font("serif",Font.BOLD,20);
		Font f3 = new Font("serif",Font.BOLD,17);
		Font f4 = new Font("Comic Sans MS",  Font.ITALIC,20);


		JLabel l1 = new JLabel("Mess INFO");
		l1.setBounds(510,30,500,100);
		l1.setForeground(Color.WHITE);
		l1.setFont(f);

		JPanel around_the_heading = new JPanel();
		around_the_heading.setLayout(null);
		around_the_heading.setBackground(new Color(0,0,0,100));
		around_the_heading.setBounds(460,23,350,110);

		JLabel l2 = new JLabel("Mess menu for this Week");
		l2.setBounds(300,370,500,100);
		l2.setForeground(new Color(0,255,255));
		l2.setFont(f2);

		JLabel l3 = new JLabel("(23-5-21 to 29-5-21) , menu changes weekly");
		l3.setBounds(590,370,500,100);
		l3.setForeground(Color.WHITE);
		l3.setFont(f1);

		ImageIcon icon2 = new ImageIcon("biryani.jpg");
		JLabel biryani = new JLabel();
		biryani.setIcon(icon2);
		biryani.setBounds(5,150,200,150);

		ImageIcon icon3 = new ImageIcon("paneer.jpg");
		JLabel paneer = new JLabel();
		paneer.setIcon(icon3);
		paneer.setBounds(5,310,200,150);


		ImageIcon icon4 = new ImageIcon("pizza.jpg");
		JLabel pizza = new JLabel();
		pizza.setIcon(icon4);
		pizza.setBounds(5,470,200,150);

		JPanel around_the_text = new JPanel();
		around_the_text.setLayout(null);
		around_the_text.setBackground(new Color(0,206,209,60));
		around_the_text.setBounds(240,220,1050,160);

		ta1 = new JTextArea("    MU has a mess hall that is operational 24/ 7 and provides sumptuous and delicious food to students and staff alike. Our hospitality partner is dedicated to cleanliness in the mess hall, and follows a protocol which ensures high standards of hygiene in the preparation of meals. The mess serves a variety of cuisines in accordance with a meal plan that is both nutritional and gastronomically wholesome with a different menu for every ay of the week . Food is served four times a day - Breakfast, lunch, Snacks(Evening) and Dinner");
		ta1.setBounds(250,225,1000,155);
		ta1.setLineWrap(true);
		ta1.setWrapStyleWord(true); 
		ta1.setEditable(false);
		ta1.setBackground(new Color(225,225,225,50));
		ta1.setForeground(Color.WHITE);
		ta1.setFont(f4);


		String[] column = {" ","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		String[][] data = {
							{"Break-fast","Shawarma","Poori","idly","Vada","Dosa","Bonda","Bread/jam"},
							{"Lunch","Biryani","Sambar","Friedrice","PaneerBiryani","Egg","Bisbilla-batt","chicken"},
							//{"Snacks","french-fries","pizza","panipuri","sandwich","pav baaji","maggi,""},
							{"Snacks","french-fries","pizza","panipuri","sandwich","pabbaaji","Maggi","Puff"},
							{"Dinner","Idly","Masala Dosa","Noodles","Curd-rice","cut fruits","khichidi","Egg-biryani"},

						};

		table = new JTable (data,column)
		{
			public boolean isCellEditable(int data,int column)
			{
				return false;
			}
		};

		JScrollPane pane = new JScrollPane(table);
		pane.setBounds(260,450,950,100);

		JLabel complaints = new JLabel("Complaints & Recommendations:");
		complaints.setBounds(250,600,400,50);
		complaints.setForeground(Color.YELLOW);
		complaints.setFont(f2);

		ta = new JTextArea("");
		ta.setBounds(260,650,800,130);
		ta.setFont(f3);

		Icon icon7 = new ImageIcon("submit.png");
		submit = new JButton(icon7);
		submit.setBounds(1100,700,40,30);



		Icon icon = new ImageIcon("home.png");
		home = new JButton(icon);
		home.setBounds(15,800,50,50);

		JLabel hb = new JLabel("Click Here to go back Home");
		hb.setBounds(75,775,500,100);
		hb.setForeground(Color.WHITE);
		hb.setFont(f1);

		ImageIcon background_image = new ImageIcon("messbackgroundimage.jpg");
		JLabel background = new JLabel("",background_image,JLabel.CENTER);
		background.setBounds(0,0,1300,900);

		add(background);
		background.add(home);
		background.add(hb);
		background.add(l1);
		background.add(around_the_heading);
		background.add(pane);
		background.add(complaints);
		background.add(ta);
		background.add(submit);
		background.add(l2);
		background.add(l3);
		background.add(biryani);
		background.add(paneer);
		background.add(pizza);
		background.add(ta1);
		background.add(around_the_text);
		submit.addActionListener(this);
		home.addActionListener(this);

		setSize(1300,900);
		setTitle("Outing Frame");
		setResizable(true);	
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
		if(ae.getSource() == submit)
		{
			if(ta.getText().isEmpty() )
			{
				JOptionPane.showMessageDialog(null,"The Field is empty");
			}
			else
			{
				ta.setText("we will Look into it....!");
			}
		
	}
}

	// public static void main(String[] args) {
	// 	new Mess();
	// }
}

