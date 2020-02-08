package com.ocp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FallBack {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2017, Month.NOVEMBER, 5);
		LocalTime localTime = LocalTime.of(1, 0);
		ZoneId zone = ZoneId.of("America/New_York");
		ZonedDateTime z = ZonedDateTime.of(localDate, localTime, zone);

		for (int i = 0; i < 6; i++)
			//z.plusHours(1); since z.plusHours(1) not assigned back to z there will be no change in hour
			z= z.plusHours(1); // here hour will increase by 5 hours after for loop execution. Ans: 6 

		System.out.println(z.getHour());
	}
}

//Ans: 1  so Non of the above