package com.cekinmezyucel.hackerrank.java.datastructures;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		BitSet b1 = new BitSet(n);
		BitSet b2 = new BitSet(n);

		while (m-- > 0) {
			// SET 1 4
			switch (scan.next()) {
			case "AND":
				if (scan.nextInt() == 1) {
					b1.and(b2);
				} else {
					b2.and(b1);
				}
				scan.nextInt();
				System.out.println(b1.cardinality() + " " + b2.cardinality());
				break;
			case "OR":
				if (scan.nextInt() == 1) {
					b1.or(b2);
				} else {
					b2.or(b1);
				}
				scan.nextInt();
				System.out.println(b1.cardinality() + " " + b2.cardinality());
				break;
			case "XOR":
				if (scan.nextInt() == 1) {
					b1.xor(b2);
				} else {
					b2.xor(b1);
				}
				scan.nextInt();
				System.out.println(b1.cardinality() + " " + b2.cardinality());
				break;
			case "FLIP":
				if (scan.nextInt() == 1) {
					b1.flip(scan.nextInt());
				} else {
					b2.flip(scan.nextInt());
				}
				System.out.println(b1.cardinality() + " " + b2.cardinality());
				break;
			case "SET":
				if (scan.nextInt() == 1) {
					b1.set(scan.nextInt());
				} else {
					b2.set(scan.nextInt());
				}
				System.out.println(b1.cardinality() + " " + b2.cardinality());
				break;

			default:
				break;
			}
		}

		scan.close();
	}

}
