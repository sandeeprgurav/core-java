package com.ocp.datetime4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTest3 {
public static void main(String[] args) {
	LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
	LocalTime time = LocalTime.of(1, 30);
	ZoneId zone = ZoneId.of("US/Eastern");
	ZonedDateTime dateTime1 = ZonedDateTime.of(date, time, zone);
	ZonedDateTime dateTime2 = dateTime1.plus(1, ChronoUnit.HOURS); // Add two hours due to daylight saving

	long hours = ChronoUnit.HOURS.between(dateTime1, dateTime2);// Consider ine hour diff between dates for ChronoUnit.HOURS unit
	int clock1 = dateTime1.getHour();
	int clock2 = dateTime2.getHour();
	System.out.println(hours + "," + clock1 + "," + clock2);//1,1,3
	
	
	LocalDate date1 = LocalDate.of(2016, Month.NOVEMBER, 6);
	LocalTime time1 = LocalTime.of(1, 30);
	ZoneId zone1 = ZoneId.of("US/Eastern");
	ZonedDateTime dateTime11 = ZonedDateTime.of(date1, time1, zone1);
	ZonedDateTime dateTime22 = dateTime11.plus(1, ChronoUnit.HOURS); // Add zero hours due to daylight saving

	long hours1 = ChronoUnit.HOURS.between(dateTime11, dateTime22);// Consider ine hour diff between dates for ChronoUnit.HOURS unit
	int clock11 = dateTime11.getHour();
	int clock22 = dateTime22.getHour();
	System.out.println(hours1 + "," + clock11 + "," + clock22); //1,1,1
	
}
}

//Ans: 1, 1, 3
