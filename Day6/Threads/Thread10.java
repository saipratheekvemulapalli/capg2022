package proj2;
class PrimeeThread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class Thread10 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		PrimeeThread thread1 = new PrimeeThread();
		thread1.start();

	}

}
