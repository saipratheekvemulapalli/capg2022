package proj2;


import java.time.Duration;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;


public class LocalDateTime {

	public static void main(String[] args) {
		ZoneId zone1 = ZoneId.of("Asia/Kolkata");
		ZoneId zone2 = ZoneId.of("Asia/Tokyo");
		LocalTime time1 = LocalTime.now(zone1);
		System.out.println("India Time zone: "+ time1);
		LocalTime time2 = LocalTime.now(zone2);
		System.out.println("Japan Time zone: "+ time2);
		Duration duration = Duration.between(time1, time2);
		System.out.println(duration);
		long hours = ChronoUnit.HOURS.between(time1, time2);
		long minutes = ChronoUnit.MINUTES.between(time1,time2);
		long htom = hours* 60;
		long actualMinutes = minutes - htom;
		System.out.println("Time difference is:"+ hours +"hours &"+ actualMinutes + "minutes");;
		

	}

}
