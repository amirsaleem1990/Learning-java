public class Test {
	public static void main(String[] args) {
		String ans = "55/22+3/88+0-99";
		String[] array = new String[11];
		int arry_filled = 0;
		String temp_ = "";
		for (int i=0; i<ans.length(); i++) {
			char character = ans.charAt(i);
			// System.out.println(character);
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
				System.out.println(array[i]);
				System.out.println(array[i].equals(Character.toString('+')));
			// if (array[i] == "/" || array[i] == "*"){

				// array_2[array_2_filled] = i;
				// System.out.println(array_2[array_2_filled]);
				// array_2_filled += 1;
			// }
		}
		// for (int i=1; i<array.length; i=i+2){
		// 	// System.out.println(array[i]);
		// 	if (array[i] == "+" || array[i] == "-"){
		// 		array_2[array_2_filled] = i;
		// 		array_2_filled += 1;
		// 	}
		// }
		// for (int i=0; i<array_2.length; i++){
		// 	System.out.println(array_2[i]);
		// }





	}
}

