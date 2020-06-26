// Graphical User Interface
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
public class Test {
	public static void main(String[] args){
		JFrame f = new JFrame("My first Java GUI program");

		f.setSize(600,900);

		int B1, B2, B3, B4, B5, B6, B7, B8, B9, B0;

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


		b1.setBounds(30,  400, 170, 90);
		b2.setBounds(230, 400, 170, 90);
		b3.setBounds(430, 400, 170, 90);
		b4.setBounds(30,  500, 170, 90);
		b5.setBounds(230, 500, 170, 90);
		b6.setBounds(430, 500, 170, 90);
		b7.setBounds(30,  600, 170, 90);
		b8.setBounds(230, 600, 170, 90);
		b9.setBounds(430, 600, 170, 90);
		b0.setBounds(30,  700, 170, 90);
		
		// b1.addActionListener(new ActionListener() {
			
		// 	@Override
		// 	public void actionPerformed(ActionEvent arg0) {
		// 		t1.setText("Welcome to my first GUI java program");
				
		// 	}
		// });

		// b2.addActionListener(new ActionListener() {

		// 	@Override
		// 	public void actionPerformed(ActionEvent arg0) {
		// 		t1.setText("");
		// 	}
		// });



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