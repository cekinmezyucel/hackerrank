package com.cekinmezyucel.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int tallestCandle = Integer.MIN_VALUE;
		int tallestCandleCount = 0;

		while (n-- > 0) {
			int candleHeight = in.nextInt();

			if (candleHeight > tallestCandle) {
				tallestCandle = candleHeight;
				tallestCandleCount = 1;
			} else if (candleHeight == tallestCandle) {
				tallestCandleCount++;
			}
		}
		in.close();
		System.out.println(tallestCandleCount);
	}

}
