public class class_with_cunstructer_perameter{

	String name = "Amir";
	int age = 30;

	// Constructor
	public class_with_cunstructer_perameter(String Name, int Age){
		name = Name;
		age = Age; 
	}
	// onother way to define Constructor is to defice it with perameters, to jab ham apni main me is class ka object banaen gay tabhi us ko perameters dy den gy

	public void print_func(){
		System.out.println("Name = " + name + "\nAge = " + age);
	}
}