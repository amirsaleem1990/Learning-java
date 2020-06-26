// Graphical User Interface
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
public class Test {
	public static void main(String[] args){
		JFrame f = new JFrame("My first Java GUI program");
		f.setSize(600,600);

		JButton b1 = new JButton("Show Text");
		JButton b2 = new JButton("Clear Text");

		JTextField t1 = new JTextField();

		b1.setBounds(100, 150, 150, 30);
		b2.setBounds(100, 200, 150, 30);
		t1.setBounds(100, 100, 250, 30);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				t1.setText("Welcome to my first GUI java program");
				
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				t1.setText("");
			}
		});

		f.add(b1);
		f.add(b2);
		f.add(t1);

		f.setLayout(null); // zaroori h
		f.setLocationRelativeTo(null); // hamari GUI center me appear ho gi
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE); // program mouse sy close sy krny sy terminate bhi ho jay ga, is line k bager agar ham mouse k zarye sy GUI band karen gy to wo band to ho jay gi magar program terminate nahi ho ga.
		f.setVisible(true); // ye bohot zaroori h, agar ye nahi ho ga to program chaly ga to sahi magar kuch bhi show nahi ho ga.

	}
}