public class Test{
	public static void main(String[] args) {

		void_func();
		
		int int_function_returned_value = int_func();
		System.out.println("int_func returned value is: " + int_function_returned_value);
	}

	public static void void_func() {
		System.out.println("Function Called");
	}
	
	public static int int_func() {
		return 5;
	}