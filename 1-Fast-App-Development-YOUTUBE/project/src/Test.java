// Graphical User Interface
import javax.swing.JFrame;
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
		t1.setBounds(100, 100, 150, 30);

		b1.addActionListener(new addActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0){
				t1.setText("Welcome to my first GUI java program");
			}
		});

		f.add(b1);
		f.add(b2);
		f.add(t1);

		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setVisible(true);

	}
}