package proj2;
class TestStatic2 {
	private static int staticVariable = 0;
	
	public static int getStaticVariable() {
		return staticVariable;
	}
	public static void setStaticVariable(int staticVariable) {
		TestStatic2.staticVariable = staticVariable;
	}
}
public class TestStatic1 {

	public static void main(String[] args) {
		System.out.println("Current variable value:" + TestStatic2.getStaticVariable());
	    TestStatic2.setStaticVariable(1);
	    System.out.println("Current variable value: "+ TestStatic2.getStaticVariable());
	    TestStatic2.setStaticVariable(24);
	    System.out.println("Current variable value: "+ TestStatic2.getStaticVariable());

	}

}
