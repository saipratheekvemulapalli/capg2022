package proj2;

import java.util.Scanner;

class ArrayExample {
	int[] anArray;
	Scanner sc;
	float avg = 0;
	
	ArrayExample(){
		sc = new Scanner(System.in);
		anArray = new int[5];
		System.out.println(anArray.length);
		for(int i=0;i<anArray.length;i++) {
			System.out.println("Enter value for index"+i);
			anArray[i] = sc.nextInt();
			
		}
		for(int i=0; i <anArray.length;i++) {
			avg = avg+anArray[i];
		}
		avg=(float) avg  / anArray.length;
		System.out.println(avg);
	}
}
public class Array1 {

	public static void main(String[] args) {
		new ArrayExample();
	}

}
