package proj2;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class Counter extends Thread{
	int count = 0;
	private Lock lock = new ReentrantLock();
	public void run() {
		int max = 1_000_00_000;
		lock.lock();
		for(int i=0; i<max; i++) {
			count++;
		}
		lock.unlock();
	}
}
public class DeadLock1 {

	public static void main(String[] args) throws InterruptedException {
		Counter c= new Counter();
		Thread first = new Thread(c,"First");
		Thread second = new Thread(c,"Second");
		first.start();
		second.start();
		first.join();
		second.join();
		System.out.println(c.count);
	}

}
