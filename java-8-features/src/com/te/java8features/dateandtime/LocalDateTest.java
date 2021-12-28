package com.te.java8features.dateandtime;

import java.time.LocalDate;

public class LocalDateTest {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		
		LocalDate date2 = LocalDate.parse("1996-09-21");
		 System.out.println(date1);
		 
		 System.out.println("Day of the month " + date1.getDayOfMonth());
		 System.out.println("Day of the year " + date1.getDayOfYear());
		 System.out.println("month value " + date1.getMonthValue());
			
		 System.out.println(date1.getDayOfWeek());
		
		 System.out.println(date1.isLeapYear());
			
		 System.out.println(date2.isAfter(date1));
			
		 System.out.println(date2.isBefore(date1));
			
		 System.out.println(date1.plusDays(1)); 
			
		
	}
}
