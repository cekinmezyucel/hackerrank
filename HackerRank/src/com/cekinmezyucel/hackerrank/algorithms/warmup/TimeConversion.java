package com.cekinmezyucel.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String time = scan.nextLine();

		String[] stringArray = time.split(":");
		if ("PM".equalsIgnoreCase(stringArray[2].substring(2, 4))) {
			stringArray[0] = stringArray[0].equalsIgnoreCase("12") ? "12"
					: String.valueOf(Integer.valueOf(stringArray[0]) + 12);
		} else {
			stringArray[0] = stringArray[0].equalsIgnoreCase("12") ? "00" : stringArray[0];
		}

		stringArray[2] = stringArray[2].substring(0, 2);

		System.out.println(stringArray[0] + ":" + stringArray[1] + ":" + stringArray[2]);
	}

}
