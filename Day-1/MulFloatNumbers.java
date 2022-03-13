package com.demo;

import java.util.Scanner;

class Mul {
	double product() {
		Scanner s = new Scanner(System.in);
		float a = s.nextFloat();
		float b = s.nextFloat();
		
		double result = a*b;
		
		return result;
	}
}

public class MulFloatNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mul m = new Mul();
		double temp = m.product();
		
		
		System.out.println("The product is: " + temp);

	}

}
