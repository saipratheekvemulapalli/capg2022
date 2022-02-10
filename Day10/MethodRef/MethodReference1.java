package com.Day10;

@FunctionalInterface
interface Messagable1 {

	void getMessage(String msg);

}

class Message1 {
	// creating constructor here
	Message1(String msg) {

		System.out.println(" from constructor");
		System.out.println(" =====================" + msg);// using method here
	}

}
public class MethodReference1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// interface
				Messagable reference = Message1::new; // using constructor here

				// calling here

				reference.getMessage("Hi");

	}

}
