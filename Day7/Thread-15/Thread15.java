package proj2;

import java.util.Random;
 	
public class Thread15 implements Runnable {

	public static void main(String[] args) {
		Thread15 assignment2 = new Thread15();
		Thread t1 = new Thread(assignment2);
		t1.start();
	}

	@Override
	public void run() {
		Random random = new Random();
		String colours[] = {"white", "blue", "black", "green", "red", "yellow"};
		int index;
		
		while ((index = random.nextInt(6)) != 4) {
			System.out.println(colours[index]);
		}		

	}

}
