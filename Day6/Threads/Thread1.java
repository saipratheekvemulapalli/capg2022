package proj2;

public class Thread1 {
	public int counter = 0;

	public static void main(String[] args) {
		Thread1 app = new Thread1();
		Thread thread1 = new Thread() {
			@Override
			public void run() {
				for(int i = 0;i<1000;i++) {
					app.counter++;
				}
			}
		};
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				try {
					thread1.join(2000);
				} catch(InterruptedException e) {
					System.out.println(e);
				}
				for (int i=0;i<1000;i++) {
					app.counter++;
				}
			}
		};
		thread1.start();
		thread2.start();
		try {
			thread2.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("The value of counter:"+app.counter);
		

	}

}
