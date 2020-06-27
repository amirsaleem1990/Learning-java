public class Test{
	public static void main(String[] args) {
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");
		String str = "4*5";
		System.out.println(engine.eval(str));
	}
}