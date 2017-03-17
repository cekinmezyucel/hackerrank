package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MigratoryBirds {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<Integer, Integer> birdTypesAndCounts = new HashMap<>();
		int maxBirdCount = Integer.MIN_VALUE;
		int maxBirdType = Integer.MAX_VALUE;

		while (n-- > 0) {
			int birdType = in.nextInt();

			if (birdTypesAndCounts.containsKey(birdType)) {
				birdTypesAndCounts.put(birdType, birdTypesAndCounts.get(birdType).intValue() + 1);
			} else {
				birdTypesAndCounts.put(birdType, 1);
			}
		}

		in.close();

		for (Entry<Integer, Integer> entry : birdTypesAndCounts.entrySet()) {
			if (entry.getValue() > maxBirdCount) {
				maxBirdCount = entry.getValue();
				maxBirdType = entry.getKey();
			} else if (entry.getValue() == maxBirdCount) {
				if (entry.getKey() < maxBirdType) {
					maxBirdType = entry.getKey();
				}
			}
		}

		System.out.println(maxBirdType);

	}

}
