package com.cekinmezyucel.hackerrank.tutorials.tendaysofstatistics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Day0MeanMedianAndMode {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		scan.close();

		Arrays.sort(a);

		mean(a);
		median(a);
		mode(a);

	}

	static void mean(int[] a) {
		double sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}

		System.out.println(sum / a.length);
	}

	static void median(int[] a) {
		int median = a.length / 2;

		if (a.length % 2 == 0) {
			double sum = a[median] + a[median - 1];
			System.out.println(sum / 2);
		} else {
			System.out.println(a[median - 1]);
		}
	}

	static void mode(int[] a) {
		HashMap<Integer, Integer> modeMap = new LinkedHashMap<>();

		for (int i = 0; i < a.length; i++) {
			if (!modeMap.containsKey(a[i])) {
				modeMap.put(a[i], 1);
			} else {
				modeMap.put(a[i], modeMap.get(a[i]).intValue() + 1);
			}
		}

		int mode = 0;
		int max = Integer.MIN_VALUE;
		for (Map.Entry<Integer, Integer> entry : modeMap.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				mode = entry.getKey();
			}
		}

		System.out.println(mode);

	}

}
