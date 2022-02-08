package package01;
import java.util.*;

public class HashElem {

	public static void main(String[] args) {
		 HashSet<String> hs = new HashSet<String>();
		 hs.add("R");
	      hs.add("S");
	      hs.add("T");
	      hs.add("V");
	      hs.add("W");
	      hs.add("Y");
	      hs.add("Z");
	      System.out.println("Set = "+hs);
	      System.out.println("Is character S part of the set? "+hs.contains("S"));
	      System.out.println("Is character B part of the set? "+hs.contains("B"));

	}

}
