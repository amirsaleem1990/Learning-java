// https://youtu.be/yFBHsptsdOM
// Polymorphism
// Polymorphism ye hota h k ham kafi sary functions banaty hen same name k, to python me to ye hota h k koi error nahi aata balky last wala sab ko overrie kar deta h, or srif wohi accessable rehta h, java me esa nahi h, ham 1 hi name k multiple functions bana sakty hen bash shart ye h k si bhi function k arguments same na hon, yani k agar me ny <print_> k name sy 1 function banaya h jis me 1 hi perameter h jis ki type <int> h to ab me isi name <print_> ka koi dusra function bhi define kar sakta hun magar shart ye h k us ka perameter 1 hi int na hon, balky ya to 2 int peremeters hon, ye 1 int ho dusra koi or type ka, ye sry sy perameter hi na ho, to khulasa ye k perameters agar same na hon to dusra function banaya ja sakta h
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
		System.out.println("Test func 1 called, no perameter");
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