public class Test {
	public static void main(String[] args) {
		String ans = "55/22+3/88+0-9";
		String[] array = new String[12];
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
		for (int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
	}
}
