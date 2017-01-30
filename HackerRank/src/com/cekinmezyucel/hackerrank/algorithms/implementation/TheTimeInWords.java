package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TheTimeInWords {

	public static void main(String[] args) {
		Map<Integer, String> timeInWords = new HashMap<>();
		timeInWords.put(1, "one");
		timeInWords.put(2, "two");
		timeInWords.put(3, "three");
		timeInWords.put(4, "four");
		timeInWords.put(5, "five");
		timeInWords.put(6, "six");
		timeInWords.put(7, "seven");
		timeInWords.put(8, "eight");
		timeInWords.put(9, "nine");
		timeInWords.put(10, "ten");
		timeInWords.put(11, "eleven");
		timeInWords.put(12, "twelve");
		timeInWords.put(13, "thirteen");
		timeInWords.put(14, "fourteen");
		timeInWords.put(15, "quarter");
		timeInWords.put(16, "sixteen");
		timeInWords.put(17, "seventeen");
		timeInWords.put(18, "eighteen");
		timeInWords.put(19, "nineteen");
		timeInWords.put(20, "twenty");
		timeInWords.put(30, "half");

		Scanner in = new Scanner(System.in);
		int hour = in.nextInt();
		int minute = in.nextInt();
		in.close();

		if (minute == 0) {
			System.out.println(timeInWords.get(hour) + " " + "o' clock");
		} else if (minute == 15 || minute == 30) {
			System.out.println(timeInWords.get(minute) + " past " + timeInWords.get(hour));
		} else if (minute == 20) {
			System.out.println(timeInWords.get(minute) + " minutes past " + timeInWords.get(hour));
		} else if (minute <= 20) {
			String smin = minute == 1 ? " minute " : " minutes ";
			System.out.println(timeInWords.get(minute) + smin + " past " + timeInWords.get(hour));
		} else if (minute < 30) {
			int left = minute - 20;
			System.out.println(
					timeInWords.get(20) + " " + timeInWords.get(left) + " minutes past " + timeInWords.get(hour));
		} else if (minute == 45) {
			int to = 60 - minute;
			System.out.println(timeInWords.get(to) + " to " + timeInWords.get(hour + 1));
		} else if (minute == 40) {
			System.out.println(timeInWords.get(minute) + " minutes to " + timeInWords.get(hour + 1));
		} else if (minute > 40) {
			int to = 60 - minute;
			System.out.println(timeInWords.get(to) + " minutes to " + timeInWords.get(hour + 1));
		} else if (minute > 30) {
			int to = 40 - minute;
			System.out.println(
					timeInWords.get(20) + " " + timeInWords.get(to) + " minutes to " + timeInWords.get(hour + 1));
		}
	}

}
