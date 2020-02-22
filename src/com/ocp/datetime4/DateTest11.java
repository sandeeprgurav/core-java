package com.ocp.datetime4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTest11 {
public static void main(String[] args) {
	 LocalDate polarBearDay = LocalDate.of(2017, 2, 27);
     DateTimeFormatter formatter = DateTimeFormatter
        .ofPattern("Holiday: yyyy dd MMM");
     System.out.println(polarBearDay.format(formatter));
}
}

//Ans: The code compiles but throws an exception at runtime.
