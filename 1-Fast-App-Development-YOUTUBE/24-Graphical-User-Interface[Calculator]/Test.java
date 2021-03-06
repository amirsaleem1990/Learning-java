// Graphical User Interface
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Font;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Test{
	public static  void main(String[] args) throws ScriptException {

		JFrame f = new JFrame("Calculator");

		String[] msg_ = new String[3];

		f.setSize(630,780);

		JButton b_add = new JButton("+");
		b_add.setFont(new Font("Arial", Font.PLAIN, 40));
		JButton b_minus = new JButton("-");
		b_minus.setFont(new Font("Arial", Font.PLAIN, 40));
		JButton b_devide = new JButton("/");
		b_devide.setFont(new Font("Arial", Font.PLAIN, 40));
		JButton b_mult = new JButton("*");
		b_mult.setFont(new Font("Arial", Font.PLAIN, 40));
		JButton b_ans = new JButton("Ans.");
		b_ans.setFont(new Font("Arial", Font.PLAIN, 20));
		JButton b_clear = new JButton("C");
		b_clear.setFont(new Font("Arial", Font.PLAIN, 40));

		JButton b1 = new JButton("1");
		b1.setFont(new Font("Arial", Font.PLAIN, 40));
		JButton b2 = new JButton("2");
		b2.setFont(new Font("Arial", Font.PLAIN, 40));
		JButton b3 = new JButton("3");
		b3.setFont(new Font("Arial", Font.PLAIN, 40));
		JButton b4 = new JButton("4");
		b4.setFont(new Font("Arial", Font.PLAIN, 40));
		JButton b5 = new JButton("5");
		b5.setFont(new Font("Arial", Font.PLAIN, 40));
		JButton b6 = new JButton("6");
		b6.setFont(new Font("Arial", Font.PLAIN, 40));
		JButton b7 = new JButton("7");
		b7.setFont(new Font("Arial", Font.PLAIN, 40));
		JButton b8 = new JButton("8");
		b8.setFont(new Font("Arial", Font.PLAIN, 40));
		JButton b9 = new JButton("9");
		b9.setFont(new Font("Arial", Font.PLAIN, 40));
		JButton b0 = new JButton("0");
		b0.setFont(new Font("Arial", Font.PLAIN, 40));

		JTextField tf = new JTextField("");
		
		Font font1 = new Font("SansSerif", Font.BOLD, 50);
		tf.setFont(font1);
		
		tf.setBounds      (30,  100, 580, 90);

		b_add.setBounds   (30,  200, 90, 90); 
		b_minus.setBounds (125, 200, 90, 90); 
		b_devide.setBounds(220, 200, 90, 90); 
		b_mult.setBounds  (315, 200, 90, 90); 
		b_ans.setBounds   (410, 200, 100, 90);
		b_clear.setBounds (515, 200, 90, 90);

		b1.setBounds      (30,  300, 180, 90);
		b2.setBounds      (230, 300, 180, 90);
		b3.setBounds      (430, 300, 180, 90);
		b4.setBounds      (30,  400, 180, 90);
		b5.setBounds      (230, 400, 180, 90);
		b6.setBounds      (430, 400, 180, 90);
		b7.setBounds      (30,  500, 180, 90);
		b8.setBounds      (230, 500, 180, 90);
		b9.setBounds      (430, 500, 180, 90);
		b0.setBounds      (30,  600, 580, 90);

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

		b_clear.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tf.setText(""); 
			}
		});


		b_ans.addActionListener(new ActionListener() {	
			@Override		
			public void actionPerformed(ActionEvent arg0) {
				String ans = tf.getText();
				//Hack: save <ans> to file, then eval(ans) in python, then load it back here as ans, and pas it to next line
				String ans_2 = String.valueOf(eval_math_expression(ans));
				tf.setText(ans + " = " + ans_2);
			}
		});


		f.add(tf);

		f.add(b_add);
		f.add(b_minus);
		f.add(b_devide);
		f.add(b_mult);
		f.add(b_ans);
		f.add(b_clear);

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

	public static double eval_math_expression(String ans){
		String command = "/home/amir/github/Learning-java/1-Fast-App-Development-YOUTUBE/24-Graphical-User-Interface[Calculator] " + ans;
		String result = "";
	    try {
		    Process process = Runtime.getRuntime().exec(command);
		 
		    BufferedReader reader = new BufferedReader(
		            new InputStreamReader(process.getInputStream()));
		   	String line;
		    while ((line = reader.readLine()) != null) {
		        result = line;
		    }		 
		    reader.close();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		return Double.valueOf(result).doubleValue();
	}
}