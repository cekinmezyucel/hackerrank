package com.cekinmezyucel.hackerrank.java.bignumber;

import java.math.BigDecimal;
import java.util.Scanner;

public class JavaBigDecimal {

	public static void main(String[] args) {
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();

		for (int i = 0; i < n - 1; i++) {
			int j = i + 1;

			while (j > 0) {
				if (BigDecimal.valueOf(Double.valueOf(s[j]))
						.compareTo(BigDecimal.valueOf(Double.valueOf(s[j - 1]))) > 0) {
					String temp = s[j - 1];
					s[j - 1] = s[j];
					s[j] = temp;
					j--;
				} else {
					j--;
				}
			}
		}

		// Output
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
		// pull request deneme
	}

}
