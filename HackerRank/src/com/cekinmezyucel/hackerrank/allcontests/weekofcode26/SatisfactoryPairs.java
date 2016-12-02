package com.cekinmezyucel.hackerrank.allcontests.weekofcode26;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SatisfactoryPairs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();

		Set<String> combination = new HashSet<>();
		Date start = new Date();

		for (int a = 1; a <= n; a++) {
			for (int b = a + 1; b <= n; b++) {
				if ((a + b) > n) {
					break;
				}
				for (int x = 1; x <= n; x++) {
					if ((a * x) >= n) {
						break;
					}
					for (int y = 1; y <= n; y++) {
						if (((a * x) + (b * y)) > n) {
							break;
						}
						if ((a * x) + (b * y) == n) {
							combination.add(a + "+" + b);
						}
					}
				}
			}
		}
		System.out.println(combination.size());
		System.out.println(new Date().getTime() - start.getTime());
	}
	
	
/*	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();

		Set<String> combination = new HashSet<>();
		HashMap<Integer, List<Integer>> factorsMap = new HashMap<>();
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();

		factorsMap.put(12, giveFactors(12, factorsMap));
		giveFactors(6, factorsMap);

		for (int i = 1; i < n; i++) {

			if (factorsMap.containsKey(i)) {
				a = factorsMap.get(i);
			} else {
				a = giveFactors(i, factorsMap);
				factorsMap.put(i, a);
			}

			if (factorsMap.containsKey(n - i)) {
				b = factorsMap.get(n - i);
			} else {
				b = giveFactors(n - i, factorsMap);
				factorsMap.put(n - i, b);
			}

			for (Integer factorA : a) {
				for (Integer factorB : b) {
					if (factorB > factorA) {
						combination.add(factorA + "+" + factorB);
					}
				}
			}
		}

		System.out.println(combination.size());
	}

	static List<Integer> giveFactors(int number, HashMap<Integer, List<Integer>> factorsMap) {

		int factorNumber = 1;
		List<Integer> factors = new ArrayList<Integer>();
		while (factorNumber <= number) {
			if (number % factorNumber == 0) {
				int factor = number / factorNumber;
				if (factorsMap.containsKey(factor)) {
					factors.addAll(factorsMap.get(factor));

					for (Integer factorOfSub : factorsMap.get(factor)) {
						Integer absent = number / factorOfSub;
						if (!factors.contains(absent)) {
							factors.add(absent);
						}
					}
					break;
				} else {
					factors.add(factor);
				}
			}
			factorNumber++;
		}

		return factors;
	}*/

}
