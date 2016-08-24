package com.cekinmezyucel.hackerrank.java.bignumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger n = in.nextBigInteger();
		in.close();
		javaPrimalityTest(n);
	}

	public static void javaPrimalityTest(BigInteger n) {
		if (n.isProbablePrime(1)) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}

}
