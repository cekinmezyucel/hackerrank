package com.cekinmezyucel.hackerrank.algorithms.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SherlockAndValidString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String word = scan.nextLine();

		calculate(word);

		scan.close();
	}

	static void calculate(String word) {
		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < word.length(); i++) {
			Character c = word.charAt(i);

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		List<Integer> list = new ArrayList<>();

		for (Integer i : map.values()) {
			list.add(i);
		}

		Set<Integer> set = new HashSet<Integer>(list);

		if (set.size() > 2) {
			System.out.println("NO");
		} else if (set.size() == 2) {
			int count = 0;
			for (Integer i : list) {
				if (list.get(0) == i) {
					count++;
				}
			}
			if (count == 1 || count == list.size() - 1) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} else {
			System.out.println("YES");
		}
	}

}
