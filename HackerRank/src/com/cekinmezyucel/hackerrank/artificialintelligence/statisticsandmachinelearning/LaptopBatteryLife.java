package com.cekinmezyucel.hackerrank.artificialintelligence.statisticsandmachinelearning;

import java.util.Scanner;

public class LaptopBatteryLife {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double timeCharged = in.nextDouble();
		in.close();

		if (timeCharged > 4) {
			System.out.printf("%.2f", Double.valueOf("8"));
		} else {
			System.out.printf("%.2f", timeCharged * 2);
		}
	}

}
