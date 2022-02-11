package proj2;
import java.time.LocalDate;

public class Calender {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalDate date2 = date.minusDays(100);
		LocalDate date3= date.plusDays(10);
		System.out.println(date);
		System.out.println(date3);
		System.out.println(date2);
		

	}

}
