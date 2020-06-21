// Encapsulation
// https://youtu.be/Wo4Dx1pTWMY
import java.util.Scanner;
public class Test extends classes {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("____ Before set a  new value ____\nmobile_no = " + t.get_());

		System.out.print("\nPlease set a new value to mobile_no: ");
		Scanner obj = new Scanner(System.in);
		int x = obj.nextInt();
		t.set_(x);
		System.out.println("____ After set a new value ____\nmobile_no = " + t.get_());
	}
}