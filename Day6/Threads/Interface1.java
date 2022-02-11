package proj2;

@FunctionalInterface
interface Person {
	void workBehaviour1();
	default void display() {
		System.out.println("Default method");
	}
}
class Manager  implements Person{
	@Override
	public void workBehaviour1() {
		System.out.println("Organizes the work and processes to deliver results.");
	}	
}

class Trainer implements Person{
	@Override
	public void workBehaviour1() {
		System.out.println("Drives team performance and helps people get to their next level of effectiveness.");
	}
}
public class Interface1 {

	public static void main(String[] args) {
		Person manager = new Manager();
		Person trainer = new Trainer();
		manager.workBehaviour1();
		trainer.workBehaviour1();
		trainer.display();

	}

}
