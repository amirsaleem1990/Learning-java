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

		List list = new ArrayList(Arrays.asList(array));
		// for (int i=0; i<array.length; i++){
			// list.remove(i);
		// }
		// list.remove(0);
		// list.remove(1);
		// list.remove(3);
		// list.remove(4);
		// System.out.println(list);

		// System.out.println(list);
		int removed = 0;
		for (int i=0; i<array_2.length; i++){
			int x = array_2[i];
			if (x > 0){
				// System.out.println("x        : " + x);
				// System.out.println("removed  : " + removed);
				// System.out.println("x-removed: " + (x-removed));
				if (array[x].equals(Character.toString('/'))) {
					double o1 = Double.parseDouble(array[x-1]);
					double o2 = Double.parseDouble(array[x+1]);
					double sum = o1  / o2;
					// System.out.println(x);
					// System.out.println(list);
					list.remove(x-removed);
					list.remove(x-removed);
					list.remove(x-1-removed);
					list.add(x-removed-1, sum);
					removed += 2;
					// System.out.println(list);
					// System.out.println("\n\n");
					// System.out.println(o1 + ", " + o2);
				}else if(array[x].equals(Character.toString('*'))){
					double o1 = Double.parseDouble(array[x-1]);
					double o2 = Double.parseDouble(array[x+1]);
					double sum =  o1  * o2;
					// System.out.println(x);
					// System.out.println(list);
					list.remove(x-removed);
					list.remove(x-removed);
					list.remove(x-1-removed);
					list.add(x-removed-1, sum);
					removed += 2;
					// System.out.println(list);
					// System.out.println("\n\n");
					// System.out.println(o1 + ", " + o2);
				}
			}
		}
		// System.out.println(list.get(0));
		// System.out.println(list.size());
		double total = 0.0;
		for (int i=1; i<list.size(); i=i+2){

			String o1 = list.get(i-1).toString(); 
			double o1 = Double.valueOf(o1).doubleValue();

			String o2 = list.get(i+1).toString(); 
			double o2 = Double.valueOf(o2).doubleValue();

			if (list.get(i).equals(Character.toString('+'))){
				total += o1 + o2;
			}else{
				total += o1 - o2;
			}
		}
		System.out.println(list);
		System.out.println(total);

		// for(int i=0; i<array_2.length; i++){
		// 	int x = array_2[i];
		// 	if (x>0){
		// 		System.out.println(x);
		// 		// System.out.println(list[x-1] + "," + list[x] + "," + list[x+1]);
		// 		// list.remove(x-1);
		// 		// list.remove(x);
		// 		// list.remove(x+1);

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

