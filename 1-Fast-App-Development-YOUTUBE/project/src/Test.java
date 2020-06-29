//"/home/amir/github/working/Namaz-times/Namaz_2.csv"
import java.time.LocalDate;
import java.io.*;  
import java.util.Scanner;  
public class Test  {
	public static void main(String[] args) throws Exception {  
		String date_ = LocalDate.now().toString();
		Scanner sc = new Scanner(new File("/home/amir/github/working/Namaz-times/Namaz_2.csv"));  
		sc.useDelimiter(",");
		while (sc.hasNext()) {  //returns a boolean value
			String am = sc.next();  //find and returns the next complete token from this scanner  
			System.out.println(am.length();)
		}
	sc.close();
	}  
}  