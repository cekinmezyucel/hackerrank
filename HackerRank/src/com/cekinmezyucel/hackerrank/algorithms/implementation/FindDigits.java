package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while (t-- > 0) {
			int value = in.nextInt();
			List<Integer> intArr = intToarr(value);
			int count = 0;

			for (int number : intArr) {
				if (number != 0 && value % number == 0) {
					count++;
				}
			}

			System.out.println(count);
		}

		in.close();
	}

	static List<Integer> intToarr(Integer value) {

		List<Integer> listArr = new ArrayList<>();

		while (value != 0) {
			listArr.add(value % 10);
			value /= 10;
		}

		return listArr;
	}

}
