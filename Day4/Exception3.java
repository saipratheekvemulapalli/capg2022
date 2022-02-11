package proj2;
class Z {
	public void proA() throws ArithmeticException{
	}
}
class B{
	public void proB() throws ArithmeticException{
		System.out.println("proB");
		new Z().proA();
	}
}
class C{
	public void proC() throws ArithmeticException{
		System.out.println("proC");
		new B().proB();
	}
}
public class Exception3 {

	public static void main(String[] args) {
		System.out.println("Start of Main Method");
		try {
			new C().proC();
			
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("End of Main method");

	}

}
