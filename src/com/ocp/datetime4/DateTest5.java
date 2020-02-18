package com.ocp.datetime4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;

public class DateTest5 {
public static void main(String[] args) {
	LocalDate montyPythonDay = LocalDate.of(2017, Month.MAY, 10);
	LocalDate aprilFools = LocalDate.of(2018,  Month.APRIL, 1);
	Duration duration = Duration.ofDays(1);
	LocalDate result = montyPythonDay.minus(duration); // Unsupported unit: Seconds
	System.out.println(result + " " + aprilFools.isBefore(result));
}
}

//Ans:None of the above (Runtime Exception)
