public class Test {
	public static void main(String[] args) {
		String ans = "55/22+3/88+0-9";
		String[] array = new String[15];
		String temp_ = "";
		for (int i=0; i<ans.length(); i++) {
			char character = ans.charAt(i);
			if (character == '+'  || 
				character == '-'  ||
				character == '*'  ||
				character == '/' ){
				if (temp_.length() > 1){
					System.out.println("OK");
					System.out.println(array.length);
					array[array.length+1] = temp_;
				}
				array[array.length+1] = Character.toString(character);
			}
			else{
				temp_ += Character.toString(character);
				// System.out.println(temp_);
			}
		}
		// for (int i=0; i<array.length; i++){
			// System.out.println(array[i]);
		// }
	}
}
