package package02;
import java.util.*;

public class AgeCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if (a>b && b>c){
			System.out.println("A is Oldest");
			System.out.println("C is the youngest");	
		}
		else if(a>c && c>b) {
			System.out.println("A is the oldest");
			System.out.println("B is the youngest");
		}
		else if(b>a && a>c) {
			System.out.println("B is oldest");
			System.out.println("C is youngest");	
		}
		else if(b>c && c>a) {
			System.out.println("B is the oldest");
			System.out.println("A is the youngest");
		}
		else if(c>a && a>b) {
			System.out.println("C is oldest");
			System.out.println("B is youngest");
		}
		else if(c>b && b>a) {
			System.out.println("C is the oldest");
			System.out.println("A is the youngest");
		}
	}

}
