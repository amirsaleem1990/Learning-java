//"/home/amir/github/working/Namaz-times/Namaz_2.csv"
import java.time.LocalDate;
import java.util.Arrays;
import java.io.*;  
import java.util.Scanner;  
public class Test  {
	public static void main(String[] args) throws Exception {  
		String date_ = LocalDate.now().toString(); // 2020-06-29
		String system_date = date_.split("-")[1] + "-" + date_.split("-")[2];
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
		// System.out.println(date_);
		while (sc.hasNext()) {  //returns a boolean value
			String row = sc.next(); // 8,31,04:54,06:12,12:32,16:01,17:04,18:53,20:10
			String[] arrayrow = row.split(","); 
			String csv_date = arrayrow[0] + "-" + arrayrow[1];
			System.out.println("csv_date: " + csv_date +  "\tsystem date: " + system_date);
		}
	sc.close();
	}  
}  