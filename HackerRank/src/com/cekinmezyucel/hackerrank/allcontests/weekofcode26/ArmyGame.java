package com.cekinmezyucel.hackerrank.allcontests.weekofcode26;

import java.util.Scanner;

public class ArmyGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		in.close();
		supplyCount(n, m);
	}

	static void supplyCount(int n, int m) {
		if (n > 1 && m > 1) {
			int area = n * m;
			int firstQuad = n / 2;
			int secondQuad = m / 2;
			int subArea = area - (firstQuad * secondQuad * 4);
			System.out.println((firstQuad * secondQuad) + calculateSingleArea(subArea));

		} else {
			System.out.println(calculateSingleArea(n * m));
		}
	}

	static private int calculateSingleArea(int area) {
		if (area % 2 == 0) {
			return area / 2;
		} else {
			return (area / 2) + 1;
		}
	}

}
