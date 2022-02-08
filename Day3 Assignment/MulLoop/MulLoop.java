package package02;
import java.util.*;

public class MulLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0){	
			for(int i=1;i<11;i++) {	
				System.out.println(n*i);						
			}			
		}
		else {
			System.out.println("enter a positive integer");
		}
	}

}
