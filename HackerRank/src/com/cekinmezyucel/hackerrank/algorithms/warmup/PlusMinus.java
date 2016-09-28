package com.cekinmezyucel.hackerrank.algorithms.warmup;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Double pozitives = (double) 0;
		Double negatives = (double) 0;
		Double zeros = (double) 0;

		for (int i = 0; i < n; i++) {
			int number = scan.nextInt();

			if (number == 0) {
				zeros += 1;
			} else if (number > 0) {
				pozitives += 1;
			} else if (number < 0) {
				negatives += 1;
			}
		}

		DecimalFormat df = new DecimalFormat();
		df.setMinimumFractionDigits(6);

		System.out.println(df.format(pozitives / n));
		System.out.println(df.format(negatives / n));
		System.out.println(df.format(zeros / n));
		scan.close();
	}

}
