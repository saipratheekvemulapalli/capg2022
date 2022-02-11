package proj2;

public class Exception4 {

	public static void main(String[] args) {
		System.out.println("Main Method Start");
		int x=12;
		int n=0;
		int result = 0;
		try {
			System.out.println("Start of try block");
			result = x/n;		
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally{
			System.out.println("Finally");
		}
		System.out.println(result);
		System.out.println("Main Method End");

	}

}
