package proj2;
class PrimesssThread extends Thread{
	int n;
	
	PrimesssThread(int n){
		this.n=n;
	}
	public void run () {
		System.out.println(Thread.currentThread().getName() + " " + n);
	}
}

public class Thread9 {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		PrimesssThread thread1= new PrimesssThread(25);
		thread1.start();
		PrimesssThread thread2= new PrimesssThread(30);
		thread2.start();
		

	}

}
