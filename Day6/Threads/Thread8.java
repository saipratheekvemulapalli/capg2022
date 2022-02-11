package proj2;
class PrimessThread implements Runnable{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i+" "+ Thread.currentThread().getName());
			try {
				Thread.sleep(2000);	
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	
}
public class Thread8 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		new Thread(new PrimessThread()).start();
		new Thread(new PrimessThread()).start();
	}

}
