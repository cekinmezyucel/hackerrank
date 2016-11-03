package com.cekinmezyucel.hackerrank.tutorials.thirtydaysofcode;

import java.util.Scanner;

public class Day2Operators {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double mealCost = scan.nextDouble(); // original meal price
		int tipPercent = scan.nextInt(); // tip percentage
		int taxPercent = scan.nextInt(); // tax percentage
		scan.close();

		double tip = ((double) tipPercent / 100) * mealCost;
		double tax = ((double) taxPercent / 100) * mealCost;

		double cost = mealCost + tip + tax;

		// cast the result of the rounding operation to an int and save it as
		// totalCost
		int totalCost = (int) Math.round(cost);

		System.out.println("The total meal cost is " + totalCost + " dollars.");
	}

}
