public class Test {
  public static void main(String[] args)  {
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    String ans = "5/2*3";
    System.out.println(engine.eval(ans));
    } 
}