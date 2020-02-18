package com.ocp.datetime4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTest6 {
public static void main(String[] args) {
	LocalDate date = LocalDate.of(2017, Month.JULY, 17);
	LocalTime time = LocalTime.of(10, 0);
	ZoneId zone = ZoneId.of("America/New_York");
	ZonedDateTime iceCreamDay = ZonedDateTime.of(date, time, zone);
	//time = time.plusMonths(1); // no plusMonths in localTime object
	System.out.println(iceCreamDay.getMonthValue());
}
}

//Ans:The code does not compile. due to time.plusMonths(1) 
