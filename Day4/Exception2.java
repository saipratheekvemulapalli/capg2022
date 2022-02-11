package proj2;

public class Exception2 {

	public static void main(String[] args) {
		Object x = Integer.valueOf(2);
		try {
			System.out.println((Integer) x);
			System.out.println((String) x);
			
		} catch(ClassCastException e) {
			System.out.println(e.getClass());
		}

	}

}
