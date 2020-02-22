package com.ocp.datetime4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTest5 {
public static void main(String[] args) {
	//Example 1
	LocalDate montyPythonDay = LocalDate.of(2017, Month.MAY, 10);
	LocalDate aprilFools = LocalDate.of(2018,  Month.APRIL, 1);
	Duration duration = Duration.ofDays(1);
	LocalDate result = montyPythonDay.minus(duration); // Unsupported unit: Seconds
	System.out.println(result + " " + aprilFools.isBefore(result));
    ///Ans:None of the above (Runtime Exception)
	
	//Example 2	
	LocalDate montyPythonDay2 = LocalDate.of(2017, Month.MAY, 10);
	LocalTime time = LocalTime.of(5, 40);
	LocalDateTime dateTime = LocalDateTime.of(montyPythonDay2, time);
	Duration duration2 = Duration.ofDays(1);
	LocalDateTime result2 = dateTime.minus(duration2);
	System.out.println(result2);
	//Ans: 2017-05-09T05:40
}
}


