package proj2;

public class Conversion {

	public static void main(String[] args) {
		char data[] = {'a','b','c'};
		String abc=new String(data);
		char[] beta = abc.toCharArray();
		System.out.println(beta[0]);
		System.out.println(abc.charAt(2));
	}

}
