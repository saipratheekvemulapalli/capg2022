package proj2;

import java.time.LocalDate;

public class LeapYr {

	public static void main(String[] args) {
		LocalDate D1=LocalDate.of(2021,1,12);
		System.out.println(D1.isLeapYear());
		LocalDate D2=LocalDate.of(2016,12,10);
		System.out.println(D2.isLeapYear());
		
	   
	}

}
