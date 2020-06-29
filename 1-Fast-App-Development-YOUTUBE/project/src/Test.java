import java.text.SimpleDateFormat;  
import java.util.Date; 

public class Test{
	public static void main(String[] args) {
		String name = FORLOOP();
		System.out.println(name);
		public String final FORLOOP() {
			for (int i=0; i<4; i++) {
				String name = "amir";
				String fName = "saleem";
				return name + "||" + fName;
			}
		}
	}
}