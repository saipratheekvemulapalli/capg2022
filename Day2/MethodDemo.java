package com.Day2;

class Addition1 {
	// method declaration
	void Add() {
		// this my local varible
		int length = 10;
		int breadth = 20;

		int areadofreatanle = length * breadth;
		System.out.println("area of reactangle " + areadofreatanle);
	}
	
	// method declaration
	void Sub() {
		// this my local varible
		int num1 = 10;
		int num2 = 20;

		int result = num1 * num2;
		System.out.println("sub of two numbers " + result);
	}

}

// client program

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addition1 a1 = new Addition1(); // object

		a1.Add(); // calliing this method fom main cl ass
		for(int i=1;i<10;i++) {
		a1.Sub();
		}

	}

}
