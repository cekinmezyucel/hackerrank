package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Map;
import java.util.Scanner;

public class EqualizeTheArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		Map<Integer, Integer> valueMap = new java.util.HashMap<>();
		int maxValue = 1;

		for (int i = 0; i < n; i++) {
			Integer key = in.nextInt();

			if (valueMap.containsKey(key)) {
				int newCount = valueMap.get(key).intValue() + 1;
				valueMap.put(key, newCount);
				if (newCount > maxValue) {
					maxValue = newCount;
				}
			} else {
				valueMap.put(key, 1);
			}
		}

		in.close();

		System.out.println(n - maxValue);

	}

}
