package com.cekinmezyucel.hackerrank.allcontests.weekofcode26;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BestDivisor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int max = Integer.MIN_VALUE;
		List<Integer> divisors = new ArrayList<>();

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				int tempSum = sumOfDigits(i);
				if (tempSum > max) {
					max = tempSum;
					divisors.clear();
					divisors.add(i);
				} else if (tempSum == max) {
					divisors.add(i);
				}
			}
		}

		if (sumOfDigits(n) > max) {
			divisors.clear();
			divisors.add(n);
		} else if (sumOfDigits(n) == max) {
			divisors.add(n);
		}

		printTheBestNumber(divisors);
	}

	static void printTheBestNumber(List<Integer> divisors) {
		if (divisors.size() == 1) {
			System.out.println(divisors.get(0));
		} else {
			int lower = Integer.MAX_VALUE;
			int theBest = 0;
			for (Integer number : divisors) {
				if (sumOfDigits(number) < lower) {
					lower = sumOfDigits(number);
					theBest = number;
				}
			}

			System.out.println(theBest);
		}
	}

	static int sumOfDigits(int i) {
		int sum = 0;
		int num = i;
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}

		return sum;
	}

}
