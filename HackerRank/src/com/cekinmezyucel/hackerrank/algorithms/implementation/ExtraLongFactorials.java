package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();

		BigInteger result = BigInteger.ONE;

		for (int i = n; i > 0; i--) {
			result = result.multiply(BigInteger.valueOf(i));
		}

		System.out.println(result);
	}

}
