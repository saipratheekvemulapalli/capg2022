package proj2;
class PrimesThread implements Runnable {
	int n;
	PrimesThread(int n){
		this.n = n;
		
	}
	public void run() {
		System.out.println(Thread.currentThread().getName() + " " + n);
	}
}

public class Thread7 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		PrimesThread thread1 = new PrimesThread(25);
		Thread th1 = new Thread(thread1);
		th1.start();
		new Thread(new PrimesThread(30)).start();

	}

}
