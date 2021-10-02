import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*; 
import java.text.*;
import java.util.regex.*;
import javax.swing.border.*;
import java.util.List;

class Confirmation extends JFrame implements ActionListener
{

	JLabel l1;
	JButton yes, no;
	String name1;
	Confirmation(String name1)
	{
		this.name1 = name1 ;

		l1 = new JLabel("Logout !! Are u Sure ??..");
		l1.setBounds(165,10,350,15);
		l1.setForeground(Color.WHITE);

		yes = new JButton("YES");
		yes.setBounds(95,50,70,30);
		yes.setFocusable(false);
		yes.setBackground(new Color(0,0,0,80));
		yes.setForeground(Color.WHITE);

		no = new JButton("NO");
		no.setBounds(330,50,70,30);
		no.setFocusable(false);
		no.setBackground(new Color(0,0,0,80));
		no.setForeground(Color.WHITE);

		ImageIcon background_image = new ImageIcon("black.png");

		JLabel background = new JLabel("",background_image,JLabel.CENTER);
		background.setBounds(0,0,500,150);

		add(background);
		background.add(l1);
		background.add(yes);
		background.add(no);
		yes.addActionListener(this);
		no.addActionListener(this);

		setSize(500,150);
		setTitle("Confirmation Frame");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setVisible(true);

	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()== yes)
		{
			new Login();
			this.dispose();
		}
		if(ae.getSource() == no)
		{
			new Main(name1);
			this.dispose();
		}
	}

	// public static void main(String[] args) {
	// 	new Confirmation();
	// }
}
