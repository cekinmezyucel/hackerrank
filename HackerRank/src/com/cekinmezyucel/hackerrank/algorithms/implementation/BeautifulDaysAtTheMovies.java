package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		int j = in.nextInt();
		int k = in.nextInt();
		in.close();

		int count = 0;

		for (int start = i; start <= j; start++) {
			if (Math.abs(start - reverseNumber(start)) % k == 0) {
				count++;
			}
		}

		System.out.println(count);

	}

	static int reverseNumber(int input) {

		int reversedNum = 0;

		while (input != 0) {
			reversedNum = reversedNum * 10 + input % 10;
			input = input / 10;
		}

		return reversedNum;
	}

}
