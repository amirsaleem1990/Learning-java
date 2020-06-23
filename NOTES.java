// 1 hi datatype k multiple variables 1 hi line me define kar sakty hen: int x,j,y,q;
// / behaves as expected if one of the operands is float, when both are integers; the result is truncated, not rounded, to produce an integer value, thus 14/4=3.
//------------------------------------------------------------------------------------
/* in arithmatice operations: an expression is evelvated accordin to the rules of precedence. 
	the rules of precedence:
		first: the unary operators: +,-,++,--,!
		second: the binary operators: *,/,%
		third: the binray operators: +,-
	when binary operators have equal precedence, they are evaluated left-to-right.
	when unary  operators have equal precedence, they are evaluated right-to-left.
	when int and double are mixed, the result is a double. thus 4.2 * 3 = 12.6
	*/
//------------------------------------------------------------------------------------
// alway use <equals> method when comparing  two objects. so this is wrong:
String a = "may";
String b = "May";
if (a == b){
	System.out.println("a == b");
}
// ye complie to ho jay ga magar expected value nahi dy ga.


instead we use <equals>. so:
if (a.equals(b)){
	System.out.println("a == b");	
}
//------------------------------------------------------------------------------------
// String k ksi index par koi character <charAt> method k zarye sy lye jata h, eg:
String name = "amir";
name.charAt(0) // this will return <a> 
//------------------------------------------------------------------------------------
// adding a <char> and <int> return an <int>. eg:
'a' + 7 // 104
// jab ham <char> and <int> k beech koi arithmatic operation karthy hen, to <char> ki value ki jaga us ka ASCII code aa jata, or chunky wo code int h, is lye opereation perform ho jata h
// to convert back to a char, use a cast, eg: 
(char)('a' + 7) // 'h' 
//------------------------------------------------------------------------------------
// <char> is primitive like <int>, you can't call methods on it.
// 2 types k methods hoty hen: 1- static and member, jab ksi method ko ham static define nahi karty to wo member method hota h.
// overloading: jab ham same name sy +1 methods banaty hen, magar sab k parameters change hoty hen, eg: koi 1 int ly raha h, koi 2 int, koi 1 int and 1 string, koi perameter lay hi nahi raha. magar 1 hi name sy 1 jesy perametes k sath 1+ methods nahi ban sakty.
//------------------------------------------------------------------------------------
// scope: har variable ka scope start: jahan wo initilize ho, end: jahan <}> khatam ho rahy hon, so:
public void fun_() {
	{
		int x=4;
	}
	// ab <x> ko ham yahan use nahi kar sakty.
} 
//------------------------------------------------------------------------------------
// 1 scope me same name sy 1+ variables nahi ban sakty. 
// array define syntax: type[] name = new type[length], eg: String[] my_array = new int[15];
// myArry.length is length of myArray
// convert String to integer: Integer.parseInt("5") 
//------------------------------------------------------------------------------------
// array:
int[] Scores = {94,39,22,55};
int[] Scores = new int[4];
for (int i=4; i<8; i++){
	Scores[i-4] = i;
}
//------------------------------------------------------------------------------------
// a java method may return an array, so:
public static String[] method_name() {
	int[] x = {2,3,4,5};
	reutn x;
}
// must assing the returned array to appropriate (here String) array variable
//------------------------------------------------------------------------------------
// the Array class has some static methods for manupulating arrays:
toString(array)            -> // return as one String, eg: "[7,3,2]"
equals(array1, array2)     -> // true/false
fill(array, value)         -> // sets every element in the array to have the specified value
sort(array)                -> // set to ascending orders
binarySearch(array, value) -> // return the index of the given value in an array, (<0 if not found); the array must be sorted
// must import java.util.* to access the class
//------------------------------------------------------------------------------------
jab ham array bana lety hen lekin us me koi values nahi dalty to us ki sab values:
int me sab 0 hoty hen
float me sab 0.0 hoty hen
//------------------------------------------------------------------------------------
// multi dimention array:
int[][][] box = new int[3][5][2];
//------------------------------------------------------------------------------------
// anothr loop construct that can simplify some array loops:
for  (type iterator : arr) {
	statement using var;
}
// eg:
for (int i : numbers){
	total += sum;
}
// this is equivalent to:
for (int i=0; numbers.length; i++){
	total += numbers[i];
}
//------------------------------------------------------------------------------------
// max Function
public staic int max(int[] numbers) {
	int max_so_far = numbers[0];
	for (int num : numbers) {
		if (num > max_so_far){
			max_so_far = num;
		}
	return max_so_far;
	}
}
//------------------------------------------------------------------------------------
// Collections: a collection is a container that groups similar elements into a single entity.
ArrayList:
	pros:

	cons:
		the size is fiexed once the array is created
		not many builtin functions
		we had to manage where data was stored in the array
		not very efficient for some application
LinkedList
HashMap
Treeset

// all Collections in the java.util.package

//------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------