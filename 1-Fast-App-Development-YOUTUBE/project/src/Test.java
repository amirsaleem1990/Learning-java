import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

import java.util.Scanner;
public class Test {
  public static void main(String[] args) throws ScriptException {
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");

    System.out.println("Enter your Expression: ");
    Scanner value_ ; Scanner(System.in);
    String expression = value_.nextInt();
    // String foo = "40/2+5";
    System.out.println(engine.eval(expression));
    } 
}