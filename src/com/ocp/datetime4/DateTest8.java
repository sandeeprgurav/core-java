package com.ocp.datetime4;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

public class DateTest8 {
public static void main(String[] args) {
	LocalDate xmas = LocalDate.of(2017,  12, 25);
	LocalDate blackFriday = LocalDate.of(2017, 11, 24);
	long monthsLeft = ChronoUnit.MONTHS.between(xmas, blackFriday);
	System.out.println(monthsLeft);
}
}

//Ans: between(xmas, blackFriday)
