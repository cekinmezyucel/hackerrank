package com.cekinmezyucel.hackerrank.java.datastructures;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int d = in.nextInt();
			arrayList.add(new ArrayList<Integer>());
			for (int j = 0; j < d; j++) {
				arrayList.get(i).add(in.nextInt());
			}
		}

		int q = in.nextInt();

		for (int i = 0; i < q; i++) {
			try {
				System.out.println(arrayList.get(in.nextInt() - 1).get(in.nextInt() - 1));
			} catch (Exception e) {
				System.out.println("ERROR!");
			}
		}

		in.close();
	}

}
