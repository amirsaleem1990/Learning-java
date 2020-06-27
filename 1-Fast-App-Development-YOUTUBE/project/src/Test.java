// import javax.script.ScriptEngineManager;
// import javax.script.ScriptEngine;
// import javax.script.ScriptException;

// public class Test {
//   public static void main(String[] args) throws ScriptException {
//     ScriptEngineManager mgr = new ScriptEngineManager();
//     ScriptEngine engine = mgr.getEngineByName("JavaScript");
//     String ans = "5/2*3";
//     System.out.println(engine.eval(ans));
//     } 
// }
import mXparser.*
public class Test{
	public static void main(String[] args){
		Expression ans = new Expression("5/2*3");
		double v = ans.calculate();
		System.out.println(v);
	}
}