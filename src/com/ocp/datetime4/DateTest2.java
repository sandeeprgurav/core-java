package com.ocp.datetime4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class DateTest2 {
public static void main(String[] args) {
	LocalDate xmas = LocalDate.of(2017,  12, 25);
	LocalDate blackFriday = LocalDate.of(2017, 11, 24);	
	long shoppingDaysLeft1 =blackFriday.until(xmas, ChronoUnit.DAYS) ;
	//long shoppingDaysLeft2 =blackFriday.until(xmas, TemporalUnit.DAYS) ; //TemporalUnit.DAYS not valid
	long shoppingDaysLeft3 = ChronoUnit.DAYS.between(blackFriday, xmas) ;
	//long shoppingDaysLeft4 =TemporalUnit.DAYS.between(blackFriday, xmas) ; //TemporalUnit.DAYS not valid
	System.out.println(shoppingDaysLeft1);
	System.out.println(shoppingDaysLeft3);
}
}

//Ans: TWO compilation errors
