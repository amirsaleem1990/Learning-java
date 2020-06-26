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