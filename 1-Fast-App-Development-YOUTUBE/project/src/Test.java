import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class Test {
	public static void main(String[] args) {
		String ans = "55/22+3/88+0*99";
		String[] array = new String[11];
		int arry_filled = 0;
		String temp_ = "";
		for (int i=0; i<ans.length(); i++) {
			char character = ans.charAt(i);
			if (character == '+'  || 
				character == '-'  ||
				character == '*'  ||
				character == '/' ){
				if (temp_.length() > 0){
					array[arry_filled] = temp_;
					temp_ = "";
					arry_filled += 1;
				}
				array[arry_filled] = Character.toString(character);
				arry_filled += 1;
			}
			else{
				temp_ += Character.toString(character);
			}
		}
		if (temp_.length() > 0){
			array[arry_filled] = temp_;
			temp_ = "";
			arry_filled += 1;
		}



		int array_2_filled = 0;
		int[] array_2 = new int[5]; 
		for (int i=1; i<array.length; i=i+2){
			if (array[i].equals(Character.toString('/')) || 
				array[i].equals(Character.toString('*'))){
					array_2[array_2_filled] = i;
					array_2_filled += 1;
			}
		}

		// List<String> list_ = Arrays.asList(array);

		List list_ = new ArrayList(Arrays.asList(array));
		System.out.println(list_);
		list_.remove(1);
		System.out.println(list_);

		// double sum = 0;

		// for (int i=0; i<array_2.length; i++){
		// 	int x = array_2[i];
		// 	if (x > 0){
		// 		if (array[x].equals(Character.toString('/'))) {
		// 			double o1 = Double.parseDouble(array[x-1]);
		// 			double o2 = Double.parseDouble(array[x+1]);
		// 			// System.out.println(o1 + ", " + o2);
		// 			sum += o1  / o2;
		// 			// list.remove(x);
		// 			// System.out.println(x);
		// 			// list.remove(x-1);
		// 			// list.remove(x+1);
		// 		}else if(array[x].equals(Character.toString('*'))){
		// 			double o1 = Double.parseDouble(array[x-1]);
		// 			double o2 = Double.parseDouble(array[x+1]);
		// 			sum += o1  * o2;
		// 			// list.remove(x);
		// 			// list.remove(x-1);
		// 			// list.remove(x+1);
		// 			// System.out.println(o1 + ", " + o2);
		// 		}
		// 	}
		// }
		// System.out.println(list);


		// for (int i=1; i<array.length; i=i+2){
		// 	// System.out.println(array[i]);
		// 	if (array[i].equals(Character.toString('+')) ||
		// 		array[i].equals(Character.toString('-'))){
		// 			array_2[array_2_filled] = i;
		// 			array_2_filled += 1;
		// 	}
		// }
		// String sum = "";
		// for (int i=0; i<array_2.length; i++){
		// 	// System.out.println(array_2[i]);
		// 	// sum += array_2[i-1] + array_2[i] + array_2[i+1] + "\n";
		// 	sum += array[array_2[i]-1] + array[array_2[i]] + array[array_2[i]+1] + "\n";
		// }
		// System.out.println(sum);
	}
}

