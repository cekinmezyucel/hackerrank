package com.cekinmezyucel.hackerrank.algorithms.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Gemstones {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<String> list = new ArrayList<>();
		Set<String> set = new HashSet<>();
		Set<String> setX = new HashSet<>();
		in.nextLine();

		while (n-- > 0) {
			String gemStone = in.nextLine();
			list.add(gemStone);

			for (int i = 0; i < gemStone.length(); i++) {
				set.add(Character.toString(gemStone.charAt(i)));
			}
		}

		in.close();

		for (String gemstone : list) {
			for (String gem : set) {
				if (!gemstone.contains(gem)) {
					setX.add(gem);
				}
			}
		}

		System.out.println(set.size() - setX.size());
	}

}
