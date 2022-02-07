package proj2;

public class Thread14 implements Runnable {
	static Thread oddThread;
	static Thread evenThread;

	public static void main(String[] args) {
		Thread14 thread2 = new Thread14();
		
		oddThread = new Thread(thread2, "OddThread");
		evenThread = new Thread(thread2, "EvenThread");
		
		oddThread.start();
		evenThread.start();

	}
	@Override
	public void run() {
		try {
			if (Thread.currentThread().getName().equals("OddThread")) 
				evenThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i = 1; i <= 20; i++) {
			if (Thread.currentThread().getName().equals("EvenThread")) {
				if (i % 2 == 0) System.out.println(i);
			} 
			
			if (Thread.currentThread().getName().equals("OddThread")) {
				if (i % 2 == 1) System.out.println(i);
			}
		}
	}

}
