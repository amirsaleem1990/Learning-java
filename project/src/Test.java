public class Test {
	public static void main(String[] args) {
		String name = "Oqba amir";
		if (name.contains("ba")){
			System.out.println("<ba> in <" + name + ">");
		}
		if (name.endsWith("mir")){
			System.out.println("<" + name + "> ends with  <mir>");
		}
		if (name.equals("Oqba amir")){
			System.out.println("the variabel <name> equals <Oqba amir>");
		}
		if (name.equalsIgnoreCase("oqba AmiR")){
			System.out.println("<" + name + "> is equal to <oqba AmiR> regardless of case");
		}
	}
}

// string_variable_name.contains(sub_string) -> true/false
// string_variable_name.endsWith(sub_string) -> true/false
