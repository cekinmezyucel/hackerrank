package com.cekinmezyucel.hackerrank.java.introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		NumberFormat nfUS = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat nfIndia = NumberFormat.getCurrencyInstance(new Locale("en", "in"));

		System.out.println("US format = " + nfUS.format(payment));
		System.out.println("India format = " + nfIndia.format(payment));
	}

}
