package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ManasaAndStones {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int n = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();

			Set<Integer> resultSet = new HashSet<>();

			for (int i = 0; i < n; i++) {
				resultSet.add((i * a) + ((n - 1 - i) * b));
			}

			List<Integer> sortedList = new ArrayList<>(resultSet);
			Collections.sort(sortedList);

			for (Integer num : sortedList) {
				System.out.printf(num + " ");
			}
			System.out.println();
		}

		in.close();
	}

}
