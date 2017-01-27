package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class TaumAndBday {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			long b = in.nextLong();
			long w = in.nextLong();
			long x = in.nextLong();
			long y = in.nextLong();
			long z = in.nextLong();
			long blackPrice = 0l;
			long whitePrice = 0l;

			long b2w = x + z;
			long w2b = y + z;

			if (w2b < x) {
				blackPrice = b * w2b;
			} else {
				blackPrice = b * x;
			}

			if (b2w < y) {
				whitePrice = w * b2w;
			} else {
				whitePrice = w * y;
			}

			System.out.println(blackPrice + whitePrice);
		}

		in.close();

	}

}
