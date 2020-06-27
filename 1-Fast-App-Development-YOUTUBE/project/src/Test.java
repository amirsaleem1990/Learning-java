import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test{
	public static void main(String[] args){
//		Process process = Runtime.getRuntime ().exec ("/home/amir/py 5+6");
		ProcessBuilder builder = new ProcessBuilder("/home/amir/py 5+6");
		builder.redirectErrorStream(true);
		Process process = builder.start();
		
	}
}
