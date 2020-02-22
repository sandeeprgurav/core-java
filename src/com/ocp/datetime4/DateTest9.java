package com.ocp.datetime4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTest9 {
public static void main(String[] args) {
	LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
	//Period p = Period.ofYears(2).ofDays(1); // This will consider the days
	Period p = Period.ofDays(1).ofYears(2); // This will skip the added days
	d = d.minus(p);
	DateTimeFormatter f = DateTimeFormatter.
	ofLocalizedDateTime(FormatStyle.SHORT);
	System.out.println(f.format(d));
}
}

//Ans: 5/10/13 11:22 AM
