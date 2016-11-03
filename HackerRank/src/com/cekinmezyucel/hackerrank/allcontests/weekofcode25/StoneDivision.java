package com.cekinmezyucel.hackerrank.allcontests.weekofcode25;

import java.util.Arrays;
import java.util.Scanner;

public class StoneDivision {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();
		int m = scan.nextInt();
		long si[] = new long[m];

		for (int i = 0; i < m; i++) {
			si[i] = scan.nextLong();
		}

		Arrays.sort(si);

		if (calculateWin(n, m, si, si.length - 1, 1)) {
			System.out.println("First");
		} else {
			System.out.println("Second");
		}
	}

	static boolean calculateWin(long n, int m, long[] si, int siIndex, int count) {

		long siN = si[siIndex];

		if (n / siN == 0)
			return true;

		if (n == 1)

			if (n % siN == 0) {
				long nN = n / siN;
				count++;
			}

		return calculateWin(n, m, si, siIndex - 1, count);

	}

}
