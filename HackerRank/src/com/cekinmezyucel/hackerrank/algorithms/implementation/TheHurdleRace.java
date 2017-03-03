package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class TheHurdleRace {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int max = 0;

		while (n-- > 0) {
			int diff = in.nextInt() - k;
			if (diff > max) {
				max = diff;
			}
		}
		in.close();
		System.out.println(max);
	}

}
