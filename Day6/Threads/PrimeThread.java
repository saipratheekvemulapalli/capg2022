package proj2;

class Prime extends Thread {
	public void Creating(){
		System.out.println(Thread.currentThread().getName());
	}
	
}

public class PrimeThread {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Prime p1= new Prime();
		p1.Creating();

	}

}
