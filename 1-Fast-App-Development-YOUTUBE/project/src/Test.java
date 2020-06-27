import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test{
	public static void main(String[] args){
		String line;
		Scanner scan = new Scanner(System.in);

		ProcessBuilder builder = new ProcessBuilder("/home/amir/py 5+6");
		builder.redirectErrorStream(true);
		Process process = builder.start();


		OutputStream stdin = process.getOutputStream ();
		InputStream stderr = process.getErrorStream ();
		InputStream stdout = process.getInputStream ();

		BufferedReader reader = new BufferedReader (new InputStreamReader(stdout));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(stdin));

		String input = scan.nextLine();
		input += "\n";
		writer.write(input);
		writer.flush();

		input = scan.nextLine();
		input += "\n";
		writer.write(input);
		writer.flush();

		while ((line = reader.readLine ()) != null) {
		System.out.println ("Stdout: " + line);
		}

		input = scan.nextLine();
		input += "\n";
		writer.write(input);
		writer.close();

		while ((line = reader.readLine ()) != null) {
		System.out.println ("Stdout: " + line);
		}
		
	}
}
