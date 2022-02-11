package package01;
import java.util.*;
public class Reverse1 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("Red");
		list1.add("Orange");
		list1.add("Banana");
		list1.add("Apple");
		System.out.println("List1 before reverse:"+ list1);
		Collections.reverse(list1);
		System.out.println("List1 after reverse:"+ list1);
	}

}
