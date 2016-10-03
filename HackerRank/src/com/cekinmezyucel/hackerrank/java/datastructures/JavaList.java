package com.cekinmezyucel.hackerrank.java.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(scan.nextInt());
		}

		int q = scan.nextInt();

		for (int j = 0; j < q; j++) {
			String key = scan.next();
			switch (key) {
			case "Insert":
				list.add(scan.nextInt(), scan.nextInt());
				break;
			case "Delete":
				list.remove(scan.nextInt());
				break;
			default:
				break;
			}
		}

		for (int k = 0; k < list.size(); k++) {
			System.out.printf(list.get(k) + " ");
		}
	}

}
