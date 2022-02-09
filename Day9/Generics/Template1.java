package proj3;



class TempleteD<T> {
	
	T t;
	TempleteD(T t){
		
		this.t=t;
		
		System.out.println(t);
	}

}

public class Template1 {

	public static void main(String[] args) {
		 //integer type passing in constructor
		TempleteD t1 = new TempleteD(12);
		 //String type passing in constructor
		TempleteD t2 = new TempleteD("45");

	}

}
