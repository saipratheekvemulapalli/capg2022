package proj2;

import java.time.LocalTime;

public class Time {

	public static void main(String[] args) {
		LocalTime time1 = LocalTime.of(10,43,12);
		System.out.println(time1);
		LocalTime time2 = time1.minusHours(2);
		LocalTime time3= time1.minusMinutes(30);
		System.out.println(time1 +" "+ time2+" "+time3);

	}

}
