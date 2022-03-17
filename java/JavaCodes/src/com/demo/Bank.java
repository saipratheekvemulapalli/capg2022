package com.demo;

 public class Bank {
	 static int f=1;
	public static int Fact(int n) {
		if(n<=1) {
			return 1;
		}
		else {
		for(int i=1;i<=n;i++) {
			 f = f *i;
			 System.out.println("hai");
		}
		return f;
		}
	}
	

	public static void main(String[] args) {
		System.out.println(Fact(5));
		int[] arr = new int[] {1,2,3,4,45};
		System.out.println(arr.length);
		for(int j : arr) {
			System.out.println(j);
		}
	}

}
