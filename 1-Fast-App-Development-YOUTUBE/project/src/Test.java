public class Test {
	public static void main(String[] args) {
		String ans = "55/22+3/88+0-9";
		String[] array = new String[10];
		String temp_ = "";
		for (int i=0; i<ans.length(); i++) {
			char character = ans.charAt(i);
			if (character == '+'  || 
				character == '-'  ||
				character == '*'  ||
				character == '/' ){
				System.out.println(temp_.length());
				// if (temp_.length() > 1){
					// System.out.println("OK");
					// array[array.length+1] = "amir";
				}
				// array[array.length+1] = (String) character;
			// }else{
			// 	temp_ += character;
			// }
		}
		// for (int i=0; i<array.length; i++){
			// System.out.println(array[i]);
		// }
	}
}
