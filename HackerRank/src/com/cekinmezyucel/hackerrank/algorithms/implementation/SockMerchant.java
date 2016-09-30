package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.HashMap;
import java.util.Scanner;

public class SockMerchant {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		HashMap<Integer, Integer> socks = new HashMap<>();

		while (n-- > 0) {
			int color = in.nextInt();

			Integer exist = socks.get(color);

			if (null == exist) {
				socks.put(color, 1);
			} else {
				socks.put(color, exist + 1);
			}
		}

		int pairs = 0;

		for (Integer exists : socks.values()) {
			pairs += exists >> 1; // arithmetic right shift
		}

		System.out.println(pairs);
	}
}
