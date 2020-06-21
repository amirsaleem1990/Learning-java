// Encapsulation
// https://youtu.be/Wo4Dx1pTWMY
// Encapsulation: is me ham koi ksi class me koi variable banaty hen or usy public k bajary <private> kar daty hen, esa karny sy wo variable srif usi class me access ho sakta h, ab agar hame usy bahir sy bhi use karwana (eg: hame us ki value chahye bhi, or hame us value ko change bhi karna h), to ham usi variable ki class me 2 functions banatay hen <public> type k, chuky in functions ko wo variable accessable hota h (q k un ki or variable ki class 1 hi h) to ham apny kam un functions k zarye sy karwaty hen
import java.util.Scanner;
public class Test extends classes {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("____ Before set a  new value ____\nmobile_no = " + t.get_());

		System.out.print("\nPlease set a new value to mobile_no: ");
		Scanner obj = new Scanner(System.in);
		int x = obj.nextInt();
		t.set_(x);
		System.out.println("\n\n____ After set a new value ____\nmobile_no = " + t.get_());
	}

}