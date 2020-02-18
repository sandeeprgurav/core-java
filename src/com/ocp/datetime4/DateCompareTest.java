package com.ocp.datetime4;

import java.time.LocalDate;
import java.time.Month;

public class DateCompareTest {

	public static void main(String[] args) {
		int year = 1874;
		//int month = Month.MARCH; // compile time error for type mismatch
		Month month = Month.MARCH;  
		int day = 24;
		LocalDate date = LocalDate.of(year, month, day);
		System.out.println(date.isBefore(LocalDate.now()));
	}
}

//The code does not compile.
