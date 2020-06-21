// Encapsulation
// https://youtu.be/Wo4Dx1pTWMY
import java.util.Scanner;
public class Test extends classes {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("Before set new value: " + t.get_());

		System.out.print("\nPlease set new value to mobile_no: ");
		Scanner obj = new Scanner(System.in);
		int x = obj.nextInt();
		t.set_(x);
		System.out.println("After set new value: " + t.get_());
	}
}