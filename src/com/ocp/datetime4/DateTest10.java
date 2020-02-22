package com.ocp.datetime4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTest10 {
	public static void main(String[] args) {
		// The United States observes daylight savings time on March 12, 2017, by moving
		// the clocks forward an hour at 2 a.m. What does the following code output?
		LocalDate localDate = LocalDate.of(2017, 3, 12);
		LocalTime localTime = LocalTime.of(13, 0);
		ZoneId zone = ZoneId.of("America/New_York");
		ZonedDateTime z = ZonedDateTime.of(localDate, localTime, zone);
		Duration duration = Duration.ofHours(3);
		ZonedDateTime later = z.plus(duration);
		System.out.println(later.getHour()); //16
		
		
		LocalDate localDate1 = LocalDate.of(2017, 3, 12);
		LocalTime localTime1 = LocalTime.of(1, 0);
		ZoneId zone1 = ZoneId.of("America/New_York");
		ZonedDateTime z1 = ZonedDateTime.of(localDate1, localTime1, zone1);
		Duration duration1 = Duration.ofHours(3);
		ZonedDateTime later1 = z1.plus(duration1);
		System.out.println(later1.getHour()); //5
	}
}

// Ans: 16
