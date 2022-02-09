package proj3;
import java.util.*;

public class DeQueue1 {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Ravi");
		deque.add("Vijay");
		deque.add("Ajay");
		// Traversing elements
		for (String str : deque) {
			System.out.println(str);
		}

	}

}
