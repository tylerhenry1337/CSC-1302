import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;



/*
Simple calculator tool with add,  subtract, multiplication, division, and exponent functionality
 */
public class Calculator extends JFrame implements ActionListener{
	static JFrame f;
	static JTextField l;
	String s0, s1, s2;
	Calculator(){
		s0 = s1 = s2 = "";
	}
	public static void main(String[] args) {
		f = new JFrame("Calculator");
		try {
			//sets look
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
		Calculator c = new Calculator();
		l = new JTextField(10);
		l.setEditable(false);
		JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9, sum, ab, sb, db, mb, cb, exb, decimal;
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		//sum button
		sum = new JButton("=");
		//operator buttons
		ab = new JButton("+");
		sb = new JButton("-");
		db = new JButton("/");
		mb = new JButton("*");
		cb = new JButton("C");
		exb = new JButton("^");
		//create decimal button
		decimal = new JButton(".");
		JPanel p = new JPanel();
		ab.addActionListener(c);
		sb.addActionListener(c);
		db.addActionListener(c);
		mb.addActionListener(c);
		b9.addActionListener(c);
		b8.addActionListener(c);
		b7.addActionListener(c);
		b6.addActionListener(c);
		b5.addActionListener(c);
		b4.addActionListener(c);
		b3.addActionListener(c);
		b2.addActionListener(c);
		b1.addActionListener(c);
		b0.addActionListener(c);
		decimal.addActionListener(c);
		exb.addActionListener(c);
		cb.addActionListener(c);
		sum.addActionListener(c);
		p.add(l);
		p.add(ab);
		p.add(sb);
		p.add(db);
		p.add(mb);
		p.add(exb);
		p.add(b9);
		p.add(b8);
		p.add(b7);
		p.add(b6);
		p.add(b5);
		p.add(b4);
		p.add(b3);
		p.add(b2);
		p.add(b1);
		p.add(b0);
		p.add(decimal);
		p.add(cb);
		p.add(sum);
		p.setBackground(Color.pink);
		f.add(p);
		f.setSize(250,250);
		f.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		//if the value is a number
		if((s.charAt(0) >= '0' && s.charAt(0) <= '9')|| s.charAt(0) == '.') {
			if(!s1.equals(""))
				s2 = s2 + s;
			else
				s0 = s0 + s;
			l.setText(s0 +s1 +s2);
		}
		else if (s.charAt(0) == 'C') {
			//clear the one letter
			s0 = s1 = s2 = "";
			//set value of text
			l.setText(s0 + s1 + s2);
			
		}
		else if (s.charAt(0) == '=') {
			double te;
			//store the values in 1st
			if (s1.equals("+"))
				te = (Double.parseDouble(s0) + Double.parseDouble(s2));
			else if (s1.equals("-"))
				te = (Double.parseDouble(s0)) - Double.parseDouble(s2);
			else if (s1.equals("/"))
				te = (Double.parseDouble(s0)/ Double.parseDouble(s2));
			else if (s1.equals("^"))
				te = (Math.pow(Double.parseDouble(s0),Double.parseDouble(s2)));				
			else
				te = (Double.parseDouble(s0) * Double.parseDouble(s2));
			l.setText(s0 + s1 + s1 + " = " + te);
			s0 = Double.toString(te);
			s1 = s2 = "";
			}
		else {
			if(s1.equals("") || s2.equals(""))
					s1 = s;
			else {
				double te;
				if(s1.equals("+"))
					te = (Double.parseDouble(s0) + Double.parseDouble(s2));
				else if (s1.equals("-"))
					te = (Double.parseDouble(s0) - Double.parseDouble(s2));
				else if (s1.equals("/"))
					te = (Double.parseDouble(s0) / Double.parseDouble(s2));
				else if (s1.equals("^"))
					te = (Math.pow(Double.parseDouble(s0),Double.parseDouble(s2)));
				else
					te = (Double.parseDouble(s0) * Double.parseDouble(s2));
				s0 = Double.toString(te);
				s1 = s;
				s2 = "";
				
			}
	
		}
		l.setText(s0 + s1 + s2);
		
	}
	
	
	
}
