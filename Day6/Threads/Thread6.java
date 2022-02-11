package proj2;
class MyCounter extends Thread{
	private int threadNo;
	public MyCounter( int threadNo) {
		this.threadNo=threadNo;		
	}
	@Override
	public void run() {
		countMe();				
	}
	public void countMe() {
		for(int i=1;i<=9;i++) {
			try {
				sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("The value if 1 is:"+i+"and the thread number is:"+ threadNo);	
		}
	}
}

public class Thread6 {

	public static void main(String[] args) {
		MyCounter counter1 = new MyCounter(1);
		MyCounter counter2 = new MyCounter(2);
		long startTime = System.currentTimeMillis();
		//long endTime = System.currentTimeMillis();
		counter1.start();
		System.out.println("**********************");
		counter2.start();
		try {
			Thread.sleep(4505);
		} catch(InterruptedException e) {
			System.out.println(e.getMessage());
			
		}
		long endTime = System.currentTimeMillis();

		System.out.println("Total time required to process:"+ ( endTime- startTime));
	}

}
