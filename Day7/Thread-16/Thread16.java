package proj2;


class Days extends Thread {
	private String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	
	@SuppressWarnings("deprecation")
	@Override
	public void run() {
		SalesPersons salesPersons = new SalesPersons();
		salesPersons.start();
		
		for (String day : days) {
			System.out.println(day);
			try {
				sleep(500);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			
			if (day.equals("Sunday")) {
				System.out.println("Suspending...");
				salesPersons.suspend();
				try {
					sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} 
			
			if (day.equals("Wednesday")) {
				System.out.println("Resuming...");
				salesPersons.resume();
			}
		}
	}
}
class SalesPersons extends Thread {
	private String[] names = {"Bob", "Alice", "John", "Richard", "Harry"};
	
	@Override
	public void run() {		
		for (String name : names) {			
			System.out.println(name);
			try {
				sleep(500);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}
}

public class Thread16 {

	public static void main(String[] args) {
		Days days = new Days();
		Thread t1 = new Thread(days);
		t1.start();		

	}

}
