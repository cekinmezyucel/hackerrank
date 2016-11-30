package com.cekinmezyucel.hackerrank.datastructures.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int lastAns = 0;
		int nS = scan.nextInt();
		int nQ = scan.nextInt();
		int query;
		int x;
		int y;
		int index;

		ArrayList<Integer>[] seqList = new ArrayList[nS];

		while (nQ-- > 0) {
			query = scan.nextInt();
			x = scan.nextInt();
			y = scan.nextInt();
			index = (x ^ lastAns) % nS;

			switch (query) {
			case 1:
				if (seqList[index] == null) {
					ArrayList<Integer> myList = new ArrayList<>();
					myList.add(y);
					seqList[index] = myList;
				} else {
					seqList[index].add(y);
				}
				break;

			case 2:
				System.out.println(lastAns = seqList[index].get(y % seqList[index].size()));
				break;

			default:
				break;
			}
		}
	}

}
