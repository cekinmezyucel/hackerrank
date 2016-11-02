package com.cekinmezyucel.hackerrank.allcontests.weekofcode25;

import java.util.Scanner;

public class BabyStepGiantStep {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int q = scan.nextInt();

		for (int i = 0; i < q; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int d = scan.nextInt();

			System.out.println(calculateSteps(a, b, d));

		}
		scan.close();
	}

	static int calculateSteps(int a, int b, int d) {
		if (d == 0) {
			return d;
		}

		if (a == d) {
			return 1;
		}

		if (d % b == 0) {
			return d / b;
		}

		if (d > b) {
			return (d / b) + 1;
		} else {
			return 2;
		}
	}

}
