package com.ocp.datetime4;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.ZoneId;

public class DateTest13 {
public static void main(String[] args) {
	ZonedDateTime depart = ZonedDateTime.of(2015, 1, 15, 3, 0, 0, 0,
			ZoneId.of("UTC-7"));
			ZonedDateTime arrive = ZonedDateTime.of(2015, 1, 15, 9, 0, 0, 0,
			ZoneId.of("UTC-5"));
			long hrs = ChronoUnit.HOURS.between(depart, arrive);
			//line n1
			System.out.println("Travel time is" + hrs + "hours");
}
}

//Ans: Travel time is4hours
