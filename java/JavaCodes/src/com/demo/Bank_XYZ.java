package com.demo;

public class Bank_XYZ {
	public static int Fact(int n) {
		if (n<=1) {
			return 1;
		}
		return n*Fact(n-1);
	}

	public static void main(String[] args) {
		int t = 10;
		int y=12;
		int a= Fact(5);
		System.out.printf("the factorial of %d is %d",t,y);
		 
	}

}
