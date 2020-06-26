// Graphical User Interface
import javax.swing.JFrame;
public class Test {
	public static void main(String[] args){
		JFrame f = new JFrame("My first Java GUI program");
		f.setSize(600,600);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setVisible(true);

	}
}