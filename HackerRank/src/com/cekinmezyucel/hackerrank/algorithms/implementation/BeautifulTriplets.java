package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BeautifulTriplets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();

		List<Integer> numbers = new ArrayList<>();

		while (n-- > 0) {
			numbers.add(in.nextInt());
		}

		in.close();

		int triplets = 0;

		for (Integer cur : numbers) {
			if (numbers.contains(cur + d) && numbers.contains(cur + (2 * d))) {
				triplets++;
			}
		}

		System.out.println(triplets);
	}

}
