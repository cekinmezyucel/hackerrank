package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class CountingValleys {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int seaLevel = 0;
		int valleyCount = 0;
		char[] arr = in.next().toCharArray();
		in.close();

		for (int i = 0; i < n; i++) {
			if (arr[i] == 'U') {
				++seaLevel;

				if (seaLevel == 0) {
					valleyCount++;
				}
			} else {
				--seaLevel;
			}
		}

		System.out.println(valleyCount);
	}

}
