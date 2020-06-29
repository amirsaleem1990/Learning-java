import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.util.Scanner;

public class eval throws ScriptException {
	String expression = "";
	public eval(expression){
		this.expression = expression;
	}
	ScriptEngineManager mgr = new ScriptEngineManager();
	ScriptEngine engine = mgr.getEngineByName("JavaScript");
	System.out.println(engine.eval(expression));
} 
