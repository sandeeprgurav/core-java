package com.ocp.datetime4;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTest4 {
public static void main(String[] args) {
	LocalDate trainDay = LocalDate.of(2017, 5, 13);
	LocalTime time = LocalTime.of(10, 0);
	ZoneId zone = ZoneId.of("America/Los_Angeles");
	ZonedDateTime zdt = ZonedDateTime.of(trainDay, time, zone);
	Instant instant = zdt.toInstant();
	instant = instant.plus(1, ChronoUnit.DAYS);
	System.out.println(instant);
	//Ans:2017-05-14T17:00:00Z	
	
	LocalDate date = LocalDate.of(2017, 5, 13);
	LocalTime time1 = LocalTime.of(10, 0);
	LocalDateTime trainDay1 = LocalDateTime.of(date, time1);
	/*Instant instant1 = trainDay1.toInstant(); //No method toInstant()
	instant = instant.plus(1, ChronoUnit.DAYS);
	System.out.println(instant);*/
	//Ans: The code does not compile.
}
}


