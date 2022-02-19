package com.Day2;

public class ModifiersDemo {
	void show() {

		System.out.println("hi this default case");

	}
	
	// public modifer case
	public void show1() {

		System.out.println("hi this public modifier case");

	}
	
	// private modifer case
	private void show2() {

		System.out.println("hi this private modifier case");

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ModifiersDemo d = new  ModifiersDemo();

		d.show();
		d.show2();
	}

}
