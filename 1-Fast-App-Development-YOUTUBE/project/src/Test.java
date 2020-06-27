// Graphical User Interface
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Font;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


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
				ans = String.valueOf(eval_math_expression(ans));
				tf.setText(ans);
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
	// public static Object prepare_(String x) throws ScriptException {
	// 	ScriptEngineManager mgr = new ScriptEngineManager();
	// 	ScriptEngine engine = mgr.getEngineByName("js"); 
	// 	Object result_ = engine.eval(x);
	// 	return result_;
	// }

	public static double eval_math_expression(String ans){
		// String ans = "3+1-4/2+3*4-3";
		String[] array = new String[ans.length()];
		int arry_filled = 0;
		String temp_ = "";
		for (int i=0; i<ans.length(); i++) {
			char character = ans.charAt(i);
			if (character == '+'  || 
				character == '-'  ||
				character == '*'  ||
				character == '/' ){
				if (temp_.length() > 0){
					array[arry_filled] = temp_;
					temp_ = "";
					arry_filled += 1;
				}
				array[arry_filled] = Character.toString(character);
				arry_filled += 1;
			}
			else{
				temp_ += Character.toString(character);
			}
		}
		if (temp_.length() > 0){
			array[arry_filled] = temp_;
			temp_ = "";
			arry_filled += 1;
		}



		int array_2_filled = 0;
		int[] array_2 = new int[5]; 
		for (int i=1; i<array.length; i=i+2){
			if (array[i].equals(Character.toString('/')) || 
				array[i].equals(Character.toString('*'))){
					array_2[array_2_filled] = i;
					array_2_filled += 1;
			}
		}

		List list = new ArrayList(Arrays.asList(array));
		// System.out.println(list);

		int removed = 0;
		for (int i=0; i<array_2.length; i++){
			int x = array_2[i];
			if (x > 0){
				// System.out.println("x        : " + x);
				// System.out.println("removed  : " + removed);
				// System.out.println("x-removed: " + (x-removed));
				if (array[x].equals(Character.toString('/'))) {
					double o1 = Double.parseDouble(array[x-1]);
					double o2 = Double.parseDouble(array[x+1]);
					double sum = o1  / o2;
					// System.out.println(x);
					// System.out.println(list);
					list.remove(x-removed);
					list.remove(x-removed);
					list.remove(x-1-removed);
					list.add(x-removed-1, sum);
					removed += 2;
					// System.out.println(list);
					// System.out.println("\n\n");
					// System.out.println(o1 + ", " + o2);
				}else if(array[x].equals(Character.toString('*'))){
					double o1 = Double.parseDouble(array[x-1]);
					double o2 = Double.parseDouble(array[x+1]);
					double sum =  o1  * o2;
					// System.out.println(x);
					// System.out.println(list);
					list.remove(x-removed);
					list.remove(x-removed);
					list.remove(x-1-removed);
					list.add(x-removed-1, sum);
					removed += 2;
					// System.out.println(list);
					// System.out.println("\n\n");
					// System.out.println(o1 + ", " + o2);
				}
			}
		}
		double total = 0.0;
		for (int i=1; i<list.size(); i=i+2){

			// System.out.println("total: " + total	);

			String o_1 = list.get(i-1).toString(); 
			double operand_1 = Double.valueOf(o_1).doubleValue();

			String o_2 = list.get(i+1).toString(); 
			double operand_2 = Double.valueOf(o_2).doubleValue();
			if (i != 1){
				operand_1 = 0;
			}
			// System.out.println("operand_1: " + operand_1 + "\noperand_2: " + operand_2);
			if (list.get(i).equals(Character.toString('+'))){
				total += (operand_1 + operand_2);
			}else{
				total += (operand_1 - operand_2);
			}
			// System.out.println("total: " + total	);
			// System.out.println("_____________________");
		}
			// System.out.println("total: " + total	);
		return total;
	}
}