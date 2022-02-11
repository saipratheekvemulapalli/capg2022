package proj2;
class Common {
	volatile public Boolean joy = false;
	public synchronized void guardedJoy() {
		while (!joy) {
			try {
				wait();
				
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("Joy and efficiency have been achieved");
	}
	public synchronized void notifyJoy() {
		joy = true;
		notifyAll();
	}
}
public class Thread3 {

	public static void main(String[] args) {
		Common common = new Common();
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Invoking guardedJoy...");
				common.guardedJoy();
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Invoking notifyJoy...");
			}
		}).start();

	}

}
