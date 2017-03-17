package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BreakingTheRecords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int games = in.nextInt();
		int best = Integer.MIN_VALUE;
		int worst = Integer.MAX_VALUE;
		int bestCount = 0;
		int worstCount = 0;

		while (games-- > 0) {
			int gamePoint = in.nextInt();

			if (gamePoint > best) {
				best = gamePoint;
				bestCount++;
			}

			if (gamePoint < worst) {
				worst = gamePoint;
				worstCount++;
			}
		}

		in.close();

		System.out.println(
				(bestCount > 0 ? bestCount - 1 : bestCount) + " " + (worstCount > 0 ? worstCount - 1 : worstCount));
	}

}
