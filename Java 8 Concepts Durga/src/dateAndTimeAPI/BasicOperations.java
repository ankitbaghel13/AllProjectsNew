package dateAndTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class BasicOperations {

	public static void main(String[] args) {

		//1. LocalDate
		//localDateMethods();

		//2. LocalTime
		//localTimeMethods();
		
		//3. LocalDateTime
		//localDateTime();
		
		//4. LocalDateTime.of(yy,mm,dd,h,m,s,n)
		//localDateTimeOf();
		
		//5. Period
		//period();
		
		//6. Year
		//year();
		
		//7. Zone
		zone();
	}

	private static void zone() {
	
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId laZone = ZoneId.of("America/Los_Angeles");
		ZonedDateTime laDateTime = ZonedDateTime.now(laZone);
		System.out.println("Time in Los Angeles is : "+laDateTime);
	}

	private static void year() {
	
		Year year1 = Year.of(2001);
		Year year2 = Year.of(2000);
		
		System.out.println("2001 is leap year - "+year1.isLeap()+"\n2000 is leap year - "+year2.isLeap());
		
	}

	private static void period() {
	
		LocalDate birthday = LocalDate.of(1992,01,13);
		LocalDate today = LocalDate.now();
		
		Period period = Period.between(birthday, today);
		System.out.printf("Age is %d years %d months %d days",period.getYears(),period.getMonths(),period.getDays());
		
		LocalDate deathDay = birthday.plusYears(71);
		Period deathPeriod = Period.between(today, deathDay);
		System.out.printf("\nYou will be dead in %d years %d months %d days",deathPeriod.getYears(),deathPeriod.getMonths(),deathPeriod.getDays());
		
		int daysRemaining = deathPeriod.getYears()*365+deathPeriod.getMonths()*30+deathPeriod.getDays();
		System.out.println("\nYou have "+daysRemaining+" days remaining.");
	}

	private static void localDateTimeOf() {
	
		LocalDateTime urLocalDateTime = LocalDateTime.of(1992, 01, 13, 13, 13, 13, 13);
		System.out.println(urLocalDateTime);
		
		System.out.println("After 6 months date : "+urLocalDateTime.plusMonths(6));
		System.out.println("Before 6 months date : "+urLocalDateTime.minusMonths(6));
	}

	private static void localDateTime() {
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		int day = dateTime.getDayOfMonth();
		int month = dateTime.getMonthValue();
		int year = dateTime.getYear();
		
		System.out.println(day+"-"+month+"-"+year);
		
		int hour = dateTime.getHour();
		int min = dateTime.getMinute();
		int sec = dateTime.getSecond();
		int nanoSec = dateTime.getNano();
		
		//System.out.println(hour+":"+min+":"+sec+":"+nanoSec);
		
		System.out.printf("%d:%d:%d:%d",hour,min,sec,nanoSec);
	}

	public static void localDateMethods() {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		int day = date.getDayOfMonth();
		int month = date.getMonthValue();
		int year = date.getYear();
		
		System.out.println(day+"-"+month+"-"+year);
	}

	public static void localTimeMethods() {
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		int hour = time.getHour();
		int min = time.getMinute();
		int sec = time.getSecond();
		int nanoSec = time.getNano();
		
		System.out.println(hour+":"+min+":"+sec+":"+nanoSec);
		
		System.out.printf("%d:%d:%d:%d",hour,min,sec,nanoSec);
	}

}
