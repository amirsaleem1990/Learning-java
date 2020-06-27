import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test{
	public static void main(String[] args){
		String command = "/home/amir/py 5+6";
	    Process process = Runtime.getRuntime().exec(command);
	    System.out.println(process);
		}
	}
