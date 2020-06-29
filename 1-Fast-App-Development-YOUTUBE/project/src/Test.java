//"/home/amir/github/working/Namaz-times/Namaz_2.csv"
import java.time.LocalDate;
import java.util.Arrays;
import java.io.*;  
import java.util.Scanner;  
public class Test  {
	public static void main(String[] args) throws Exception {
		String date_ = LocalDate.now().toString(); // 2020-06-29
		String current_month = date_.split("-")[1];
		String current_date  = date_.split("-")[2];
		current_month = current_month.replaceFirst("^0+(?!$)", "");
		current_date  = current_date.replaceFirst ("^0+(?!$)", "");
		String system_date = current_month + "-" + current_date;
		Scanner sc = new Scanner(new File("/home/amir/github/working/Namaz-times/Namaz_2.csv"));  
		sc.useDelimiter("\n");
//		Month,Date,Subah_sadiq,Tulu_aaftab,Zawal,Asr_1,Asr_2,Magrib,Isha
		while (sc.hasNext()) {  //returns a boolean value
			String row = sc.next(); // 8,31,04:54,06:12,12:32,16:01,17:04,18:53,20:10
			String[] arrayrow = row.split(","); 
			String csv_date = arrayrow[0] + "-" + arrayrow[1];
			if (csv_date.equals(system_date)){
			// 	String month = arrayrow[0];
			// 	String date = arrayrow[1];
			// 	String Subah_sadiq = arrayrow[2];
			// 	String Tulu_aaftab = arrayrow[3];
			// 	String Zawal = arrayrow[4];
			// 	String Asr_1 = arrayrow[5];
			// 	String Asr_2 = arrayrow[6];
			// 	String Magrib = arrayrow[7];
			// 	String Isha = arrayrow[8];	
			// 	System.out.println("Subah_sadiq: " +  Subah_sadiq);
			// 	System.out.println("Tulu_aaftab: " +  Tulu_aaftab);
			// 	System.out.println("Zawal      : " +  Zawal);
			// 	System.out.println("Asr_1      : " +  Asr_1);
			// 	System.out.println("Asr_2      : " +  Asr_2);
			// 	System.out.println("Magrib     : " +  Magrib);
			// 	System.out.println("Isha       : " +  Isha);
				int[] arrayrow_int = to_int(arrayrow);
				System.out.println(arrayrow_int[1]);
			}
		}
	sc.close();
	}  
	public static int[] to_int(String[] x){
		int[] array_minutes = new int[7];
		for (int i=2; i<x.length; i++){
			String[] splited = x[i].split(":");
			String hour   = splited[0].replaceFirst("^0+(?!$)", "");
			String minute = splited[1].replaceFirst("^0+(?!$)", "");  
			int h_m = Integer.parseInt(hour)*60;
			int m_m = Integer.parseInt(minute);
			array_minutes[i-2] = h_m + m_m;
		}
		return array_minutes;
	}
}