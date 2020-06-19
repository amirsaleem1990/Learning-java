public class Test extends parent_class {
	public static void main(String[] args) {

	Test test = new Test();
	test.print_();
	test.print_(5);
	test.print_(5,6);
	test.print_("Amir");
	test.print_(4, "Amir");
	}
	public void print_() {
		System.out.println("Test func 1 called, not perameter");
	}
	public void print_(int x) {
		System.out.println("Test func 2 called, 1 int perameter");
	}
	public void print_(int x, int i) {
		System.out.println("Test func 3 called, 2 int perameters");
	}
	public void print_(String x) {
		System.out.println("Test func 4 called, 1 string perameter");
	}
}