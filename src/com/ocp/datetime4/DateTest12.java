package com.ocp.datetime4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTest12 {
public static void main(String[] args) {
	LocalDate date = LocalDate.of(2017, Month.JULY, 17);
	LocalTime time = LocalTime.of(10, 0);
	ZoneId zone = ZoneId.of("America/New_York");
	ZonedDateTime iceCreamDay = ZonedDateTime.of(date, time, zone);
	date = date.plusMonths(1);
	System.out.println(iceCreamDay.getMonthValue());
}
}

//Ans: 7
