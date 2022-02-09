package proj33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*Java LinkedHashMap contains values based on the key.
Java LinkedHashMap contains unique elements.
Java LinkedHashMap may have one null key and multiple null values.
Java LinkedHashMap is non synchronized.
Java LinkedHashMap maintains insertion order.
The initial default capacity of Java HashMap class is 16 with a load factor of 0.75--room creating capacity in memory
*/

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<Integer, String>(); // legaecy way

		map.put(1, "pratheek");
		map.put(2, "Akanksha");
		map.put(3, "Saranya");
		map.put(4, "Charvi");

		Set<?> set = map.entrySet();

		Iterator itr = set.iterator();

		while (itr.hasNext()) {

			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) itr.next();
			System.out.println(" Key--->" + entry.getKey() + "value -->" + entry.getValue());
		}


	}

}
