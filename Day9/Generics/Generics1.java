package proj3;
import java.util.ArrayList;
public class Generics1 {

	public static void main(String[] args) {
		ArrayList<String> k = new ArrayList<String>(); // raw type

		k.add("12"); // integer
		k.add("45.6"); // double
		k.add("ram"); // string based
		System.out.println(k);
	}

}
