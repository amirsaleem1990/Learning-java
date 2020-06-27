import java.io.InputStream;

public class Test{
	public static void main(args[] main){
		ProcessBuilder builder = new ProcessBuilder("~/home/amir/py 5+8");
		builder.redirectErrorStream(true);
		Process process = builder.start();
		InputStream is = process.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));

		String line = null;
		while ((line = reader.readLine()) != null) {
		   System.out.println(line);
		}

	}
}
