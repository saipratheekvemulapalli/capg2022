package proj2;
import java.util.HashSet;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Johnson");
		set.add("John");
		set.add("Aafiya");
		set.add("Armaan");
		set.add("Mia");
		set.add("Johnson");
		for(String name:set) {
			System.out.println(name);
		}
	}

}
