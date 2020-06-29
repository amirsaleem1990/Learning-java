//"/home/amir/github/working/Namaz-times/Namaz_2.csv"
import java.time.LocalDate;
import java.util.Arrays;
import java.io.*;  
import java.util.Scanner;  
public class Test  {
	public static void main(String[] args) throws Exception {
		int    current_time = current_time();  // 781
		String system_date  = current_date();  // 6-29

		Scanner sc = new Scanner(new File("/home/amir/github/working/Namaz-times/Namaz_2.csv"));  
		sc.useDelimiter("\n");
//		Month,Date,Subah_sadiq,Tulu_aaftab,Zawal,Asr_1,Asr_2,Magrib,Isha
		while (sc.hasNext()) {  //returns a boolean value
			String row = sc.next(); // 8,31,04:54,06:12,12:32,16:01,17:04,18:53,20:10
			String[] arrayrow = row.split(","); 
			String csv_date = arrayrow[0] + "-" + arrayrow[1];

			if (csv_date.equals(system_date)){
				int[] arrayrow_int = to_int(arrayrow);
				for (int i=0; i<arrayrow_int.length; i++){
					if (arrayrow_int[i] > current_time){
						int next_namaz_time_in_minute = arrayrow_int[i];
						int minutes_baqi_hen = next_namaz_time_in_minute - current_time;

						String next_namaz_name_ = next_namaz_name(i);

						System.out.println(minutes_baqi_hen);
						System.out.println(row.split(",")[i+2]);
						System.out.println(next_namaz_name_);

						break;
					}
				}
			}
		}
	sc.close();
	}  

	// helper functions
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
	public static int current_time(){
		String current_time = java.time.LocalTime.now().toString();

		String current_hour    = current_time.split(":")[0].replaceFirst("^0+(?!$)", "");
		String current_minutes = current_time.split(":")[1].replaceFirst("^0+(?!$)", "");

		int current_time_in_minutes = 0;

		current_time_in_minutes += Integer.parseInt(current_hour)*60;
		current_time_in_minutes += Integer.parseInt(current_minutes);

		return current_time_in_minutes;
	}
	public static String current_date(){
		String date_ = LocalDate.now().toString(); // 2020-06-29

		String current_month = date_.split("-")[1];
		String current_date  = date_.split("-")[2];

		current_month = current_month.replaceFirst("^0+(?!$)", "");
		current_date  = current_date.replaceFirst ("^0+(?!$)", "");

		String system_date = current_month + "-" + current_date;
		return system_date;
	}
	public static String next_namaz_name(int i){
		String name="";
		switch (i){
			case 0:
				name =  "Subah_sadiq";
				break;
			case 1:
				name =  "Tulu_aaftab";
				break;
			case 2:
				name =  "Zawal";
				break;
			case 3:
				name =  "Asr_1";
				break;
			case 4:
				name =  "Asr_2";
				break;
			case 5:
				name =  "Magrib";
				break;
			case 6:
				name =  "Isha";
				break;
			}
		return name;
	}
}