package com.Day10;

@FunctionalInterface
interface Messagable2 {

	void getMessage(int num);

}
class Message2 {
	Message2(int num) {
		
		if(num %2==0) {
			System.out.println("even " + num);
		}
		else {
			System.out.println("odd " + num);
		}
	}

}
public class MethodReferenceEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// interface
		Messagable2 reference = Message2::new;// using constructor here
		// calling here
		reference.getMessage(121);

	}

}
