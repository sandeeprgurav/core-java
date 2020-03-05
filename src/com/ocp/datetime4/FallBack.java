package com.ocp.datetime4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FallBack {
	// daylight savings time ends on November 5, 2017 at 02:00 a.m and we repeat
	// that hour.

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2017, Month.NOVEMBER, 5); // Month.OCTOBER==>>Ans:7
		LocalTime localTime = LocalTime.of(1, 0);
		ZoneId zone = ZoneId.of("America/New_York");
		ZonedDateTime z = ZonedDateTime.of(localDate, localTime, zone);

		for (int i = 0; i < 6; i++)
			// z.plusHours(1); since z.plusHours(1) not assigned back to z there will be no change in hour so Ans: 1
			z = z.plusHours(1); // here hour will increase by 6 hours after for loop execution but due to
								// daylight will consider 5 so 1+5 => Ans: 6 
		                        //without daylight will be 1+6 => 7
		                        // 

		System.out.println(z.getHour());
	}
}

// Ans: 1 so Non of the above