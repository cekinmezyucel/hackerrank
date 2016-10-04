package com.cekinmezyucel.hackerrank.java.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		Map<String, Integer> phoneBook = new HashMap<>();
		for (int i = 0; i < n; i++) {
			phoneBook.put(in.nextLine(), in.nextInt());
			in.nextLine();
		}
		while (in.hasNext()) {
			String key = in.nextLine();
			if (phoneBook.containsKey(key)) {
				System.out.println(key + "=" + phoneBook.get(key).intValue());
			} else {
				System.out.println("Not found");
			}
		}
	}

}
