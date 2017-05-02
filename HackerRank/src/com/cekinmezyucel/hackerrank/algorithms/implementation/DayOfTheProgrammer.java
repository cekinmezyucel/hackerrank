package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class DayOfTheProgrammer {

	static String solve(int year) {
		if (year >= 1919) {
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
				return "12.09." + year;
			} else {
				return "13.09." + year;
			}
		} else if (year >= 1700 && year <= 1917) {
			if (year % 4 == 0) {
				return "12.09." + year;
			} else {
				return "13.09." + year;
			}
		} else {
			return "26.09." + year;
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(solve(in.nextInt()));
		in.close();
	}

}
