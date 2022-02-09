package proj3;

import java.util.Iterator;
//import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {

		Queue<String> lines = new PriorityQueue<String>();	
		
		lines.add("ram");
		lines.add("sham");
		lines.add("arnav");
		lines.add("varun");
		
		Iterator<String> itr = lines.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());

		}
	}

}
