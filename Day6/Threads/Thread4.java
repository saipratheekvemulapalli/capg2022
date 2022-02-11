package proj2;
class Test {
	public void A() {
		B();
	}
	public void B() {
		C();
	}
	public void C() {
		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		System.out.println("Display the stack trace using stackTraceElement in java: ");
		for (StackTraceElement ste : stackTrace) {
			System.out.println(ste);
		}
	}
}

public class Thread4 {

	public static void main(String[] args) {
		new Test().A();
	}

}
