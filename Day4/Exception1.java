package proj2;
class AgeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AgeException(String msg) {
		super(msg);
	}
}
class AgeInput{
	int age;
	
	public AgeInput() {
		age=16;
	}
	public void Pro() throws AgeException{
		if(age < 18) {
			throw new AgeException("Age is not valid.");
			
		}else {
			System.out.println("Age is not valid.");
		}
	}
}
public class Exception1 {

	public static void main(String[] args) {
		System.out.println("Main Started");
		AgeInput ageInput = new AgeInput();
		try {
			ageInput.Pro();
		}catch (AgeException e) {
			System.out.println(e);
		}
		System.out.println("Main Ended");
	}

}
