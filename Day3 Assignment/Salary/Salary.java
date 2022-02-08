package package02;
import java.util.*;
public class Salary {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Double yr=sc.nextDouble();
		Double sal=sc.nextDouble();
		if(yr>5) {
			Double y=sal/2;
			Double increment=y/10;
			System.out.println("increment:"+ increment);
		}
		else {
			System.out.println("less than 5 experience");
		}
	}

	}


