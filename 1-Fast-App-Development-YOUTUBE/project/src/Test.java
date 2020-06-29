import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date; 

public class Test{
	public static void main(String[] args) {
        String current_time = java.time.LocalTime.now().toString();
//		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
//		Date date = new Date();
//		String current_time = formatter.format(date).toString();

		String current_hour    = current_time.split(":")[0].replaceFirst("^0+(?!$)", "");
		String current_minutes = current_time.split(":")[1].replaceFirst("^0+(?!$)", "");

		int current_time_in_minutes = 0;

		current_time_in_minutes += Integer.parseInt(current_hour)*60;
		current_time_in_minutes += Integer.parseInt(current_minutes);

	    System.out.println(current_time_in_minutes );
	}
}