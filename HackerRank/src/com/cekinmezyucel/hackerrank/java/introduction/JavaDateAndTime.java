package com.cekinmezyucel.hackerrank.java.introduction;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class JavaDateAndTime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();

		calculateDayOfGivenDate(year, month, day);

		in.close();
	}

	public static void calculateDayOfGivenDate(String year, String month, String day) {

		int dDay = Integer.valueOf(day);
		int dMonth = Integer.valueOf(month);
		int dYear = Integer.valueOf(year);

		Calendar cal = new GregorianCalendar(dYear, dMonth - 1, dDay);

		int weekDay = cal.get(Calendar.DAY_OF_WEEK);

		switch (weekDay) {
		case 1:
			System.out.print("SUNDAY");
			break;
		case 2:
			System.out.print("MONDAY");
			break;
		case 3:
			System.out.print("TUESDAY");
			break;
		case 4:
			System.out.print("WEDNESDAY");
			break;
		case 5:
			System.out.print("THURSDAY");
			break;
		case 6:
			System.out.print("FRIDAY");
			break;
		case 7:
			System.out.print("SATURDAY");
			break;
		}
	}

}
