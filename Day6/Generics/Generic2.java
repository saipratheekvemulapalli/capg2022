package proj2;
class Box<T>{
	private T t;
	public void add(T t) {
		this.t=t;		
	}
	public T get() {
		return t;
	}
}
public class Generic2 {
	public static void main(String[] args) {
		Box<Integer> box1 = new Box<>();
		box1.add(25);
		System.out.println(box1.get()+10);

	}

}
