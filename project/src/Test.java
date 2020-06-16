public class Test {
	public static void main(String[] args) {
		String name = "Oqba amir";
		if (name.contains("ba")){
			System.out.println("Yes, <ba> in <" + name + ">");
		}
		if (name.endsWith("mir")){
			System.out.println("Yes, <" + name + "> ends with  <mir>");
		}
	}
}

string_variable_name.contains(sub_string) -> true/false
string_variable_name.endsWith(sub_string) -> true/false
