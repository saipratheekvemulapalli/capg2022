package proj3;
import java.util.concurrent.ConcurrentHashMap;
public class Concurrent1 {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> m = new 	ConcurrentHashMap<Integer, String>();
		
		m.put(1, "ram");
		m.put(2, "arnav");
		//m.put(3, "Raj");
		m.put(4, "sham");
		m.putIfAbsent(3, "mynameadded");   //
		
		System.out.println(m);

	}

}
