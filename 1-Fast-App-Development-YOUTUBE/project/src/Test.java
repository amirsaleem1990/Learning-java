import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class Test {
	public static void main(String[] args) {
		// String ans = "55/22+3/88+0*99";
		// String[] array = new String[11];
		String ans = "3+1-4/2+3*4-3";
		String[] array = new String[13];
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

		List list = new ArrayList(Arrays.asList(array));
		System.out.println(list);

		int removed = 0;
		for (int i=0; i<array_2.length; i++){
			int x = array_2[i];
			if (x > 0){
				System.out.println("x        : " + x);
				System.out.println("removed  : " + removed);
				System.out.println("x-removed: " + (x-removed));
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
		double total = 0.0;
		for (int i=1; i<list.size(); i=i+2){

			System.out.println("total: " + total	);

			String o_1 = list.get(i-1).toString(); 
			double operand_1 = Double.valueOf(o_1).doubleValue();

			String o_2 = list.get(i+1).toString(); 
			double operand_2 = Double.valueOf(o_2).doubleValue();
			if (i != 1){
				operand_1 = 0;
			}
			System.out.println("operand_1: " + operand_1 + "\noperand_2: " + operand_2);
			if (list.get(i).equals(Character.toString('+'))){
				total += (operand_1 + operand_2);
			}else{
				total += (operand_1 - operand_2);
			}
			System.out.println("total: " + total	);
			System.out.println("_____________________");
		}
	}
}

