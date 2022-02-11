package proj2;

public class String1 {

	public static void main(String[] args) {
		char [] data = {'a','b','c'};
		String abc = new String(data);
		System.out.println(abc);
		String cde = "cde";
		System.out.println(abc+cde);
		String c=abc.substring(0,1);
		System.out.println("abc.substring(2,3): "+ c);
		String d= cde.substring(1,2);
		System.out.println("abc.substring(1,2): "+ d);
		System.out.println(abc.length());


	}

}
