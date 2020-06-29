//"/home/amir/github/working/Namaz-times/Namaz_2.csv"
import java.io.FileReader;
import java.io.*;  
import java.util.Scanner;  
public class Test  {
	public static void main(String[] args) {
		String csvFilename = "/home/amir/github/working/Namaz-times/Namaz_2.csv";
//		FileReader from = new FileReader("/home/amir/github/working/Namaz-times/Namaz_2.csv");
		BufferedReader csvReader = new BufferedReader(new FileReader(csvFilename));
//		int count = source.nextInt();
//		String str = source.next();
//		String wholeLine = source.nextLine();
		System.out.println(csvReader);
//		from.close();
	}
}