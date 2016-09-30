package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int numbers[] = new int[t];

		for (int i = 0; i < t; i++) {
			numbers[i] = scan.nextInt();
		}

		while (isSticksFinished(numbers)) {
			int min = Integer.MAX_VALUE;
			int cutStick = 0;

			for (int i : numbers) {
				if (i > 0 && i < min) {
					min = i;
				}
			}

			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] > 0) {
					numbers[j] -= min;
					cutStick += 1;
				}
			}

			System.out.println(cutStick);

		}
		scan.close();
	}

	static boolean isSticksFinished(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return sum > 0;
	}

}
