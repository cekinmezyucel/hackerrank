package com.cekinmezyucel.hackerrank.java.datastructures;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class JavaDequeue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int max = Integer.MIN_VALUE;
		Deque<Integer> deque = new LinkedList<Integer>();
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < n; i++) {
			int num = in.nextInt();

			deque.add(num);
			set.add(num);

			if (deque.size() == m) {
				if (set.size() > max) {
					max = set.size();
				}

				int first = deque.remove();
				if (set.contains(first) && !deque.contains(first)) {
					set.remove(first);
				}
			}
		}

		in.close();
		System.out.println(max);
	}

}
