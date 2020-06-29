//"/home/amir/github/working/Namaz-times/Namaz_2.csv"
import java.time.LocalDate;
import java.io.*;  
import java.util.Scanner;  
public class Test  {
	public static void main(String[] args) throws Exception {  
		String date_ = LocalDate.now().toString();
		Scanner sc = new Scanner(new File("/home/amir/github/working/Namaz-times/Namaz_2.csv"));  
		sc.useDelimiter("\n");
//		Month,Date,Subah_sadiq,Tulu_aaftab,Zawal,Asr_1,Asr_2,Magrib,Isha
		String month;
		String date;
		String Subah_sadiq;
		String Tulu_aaftab;
		String Zawal;
		String Asr_1;
		String Asr_2;
		String Magrib;
		String Isha;
		
		while (sc.hasNext()) {  //returns a boolean value
			String[] x = sc.next().split(",");  //find and returns the next complete token from this scanner  
			System.out.println(x[1]);
		}
	sc.close();
	}  
}  