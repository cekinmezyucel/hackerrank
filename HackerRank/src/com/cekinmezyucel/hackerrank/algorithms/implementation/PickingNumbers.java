package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class PickingNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<Integer, Integer> numberMap = new HashMap<>();
		int maxArray = Integer.MIN_VALUE;

		while (n-- > 0) {
			int number = in.nextInt();

			if (numberMap.containsKey(number)) {
				numberMap.put(number, numberMap.get(number).intValue() + 1);
			} else {
				numberMap.put(number, 1);
			}
		}

		in.close();

		Set<Entry<Integer, Integer>> entrySet = numberMap.entrySet();

		for (Entry<Integer, Integer> x : entrySet) {
			for (Entry<Integer, Integer> y : entrySet) {
				if (x.getValue() > maxArray) {
					maxArray = x.getValue();
				}

				if (Math.abs(x.getKey() - y.getKey()) == 1 && (x.getValue() + y.getValue()) > maxArray) {
					maxArray = x.getValue() + y.getValue();
				}
			}
		}

		System.out.println(maxArray);
	}
}
