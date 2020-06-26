// Graphical User Interface
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;


import java.awt.Font;


public class Test {
	public static void main(String[] args){
		
		JFrame f = new JFrame("Calculator");

		String[] msg_ = new String[3];

		f.setSize(630,900);

		JButton b_add = new JButton("+");
		JButton b_minus = new JButton("-");
		JButton b_devide = new JButton("/");
		JButton b_mult = new JButton("*");

		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b0 = new JButton("0");

		JTextField tf = new JTextField("");
		// ------------------
		Font font1 = new Font("SansSerif", Font.BOLD, 20);
		// tf.setLocation(5, 5);
		tf.setSize(150,20);	
		tf.setFont(font1);
		// ------------------

		tf.setBounds      (30,  200, 580, 90);
		b_add.setBounds   (30,  300, 130, 90); 
		b_minus.setBounds (180, 300, 130, 90); 
		b_devide.setBounds(330, 300, 130, 90); 
		b_mult.setBounds  (480, 300, 130, 90); 
		b1.setBounds      (30,  400, 180, 90);
		b2.setBounds      (230, 400, 180, 90);
		b3.setBounds      (430, 400, 180, 90);
		b4.setBounds      (30,  500, 180, 90);
		b5.setBounds      (230, 500, 180, 90);
		b6.setBounds      (430, 500, 180, 90);
		b7.setBounds      (30,  600, 180, 90);
		b8.setBounds      (230, 600, 180, 90);
		b9.setBounds      (430, 600, 180, 90);
		b0.setBounds      (30,  700, 580, 90);

		b1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tf.setText(tf.getText() + "1"); 
			}
		});

		b2.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tf.setText(tf.getText() + "2"); 
			}
		});
		b3.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tf.setText(tf.getText() + "3"); 
			}
		});

		b4.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tf.setText(tf.getText() + "4"); 
			}
		});

		b5.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tf.setText(tf.getText() + "5"); 
			}
		});

		b6.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tf.setText(tf.getText() + "6"); 
			}
		});

		b7.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tf.setText(tf.getText() + "7"); 
			}
		});

		b8.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tf.setText(tf.getText() + "8"); 
			}
		});

		b9.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tf.setText(tf.getText() + "9"); 
			}
		});

		b0.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tf.setText(tf.getText() + "0"); 
			}
		});

		b_add.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tf.setText(tf.getText() + "+"); 
			}
		});
		b_minus.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tf.setText(tf.getText() + "-"); 
			}
		});
		b_devide.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tf.setText(tf.getText() + "/"); 
			}
		});
		b_mult.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tf.setText(tf.getText() + "*"); 
			}
		});



		f.add(tf);
		f.add(b_add);
		f.add(b_minus);
		f.add(b_devide);
		f.add(b_mult);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b0);


		// zaroori h
		f.setLayout(null); 
		// hamari GUI center me appear ho gi
		f.setLocationRelativeTo(null); 

		// program mouse sy close sy krny sy terminate bhi ho jay ga, is line k bager agar ham mouse k zarye sy GUI band karen gy to wo band to ho jay gi magar program terminate nahi ho ga.
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

		// ye bohot zaroori h, agar ye nahi ho ga to program chaly ga to sahi magar kuch bhi show nahi ho ga. 
		f.setVisible(true); 

	}
}