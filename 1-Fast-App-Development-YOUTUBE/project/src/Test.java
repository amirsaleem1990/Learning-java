public class Test {
	public static void main(String[] args) {
		String ans = "55/22+3/88";
		String[] array = new String[10];
		String temp_;
		for (int i=0; i<ans.length(); i++) {
			char character = ans.charAt(i);
			if (character.equals('+')	 || 
				character.equals('-')	 ||
				character.equals('*')	 ||
				character.equals('/')	){
					System.out.println(character);
				// if (temp_.length() > 1){
			// 		array[array.length+1] = temp_;
				}
				// array[array.length+1] = (String) character;
			// }else{
			// 	temp_ += character;
			// }
		}
	}
}
