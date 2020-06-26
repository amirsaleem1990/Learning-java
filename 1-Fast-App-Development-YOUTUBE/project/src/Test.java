// Graphical User Interface
import javax.swing.JFrame;
import javax.swing.JButton;
public class Test {
	public static void main(String[] args){
		JFrame f = new JFrame("My first Java GUI program");
		f.setSize(600,600);

		JButton b1 = new JButton("Show Text");
		JButton b2 = new JButton("Clear Text");




		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setVisible(true);

	}
}