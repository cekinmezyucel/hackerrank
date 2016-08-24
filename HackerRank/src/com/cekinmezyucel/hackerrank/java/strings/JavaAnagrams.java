package com.cekinmezyucel.hackerrank.java.strings;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
		scan.close();
	}

	static boolean isAnagram(String a, String b) {

		// Complete the function by writing your code here.
		char[] upperCaseA = a.toUpperCase().toCharArray();
		char[] upperCaseB = b.toUpperCase().toCharArray();

		if (upperCaseA.length != upperCaseB.length) {
			return false;
		}

		Arrays.sort(upperCaseA);
		Arrays.sort(upperCaseB);

		return Arrays.equals(upperCaseA, upperCaseB);

	}

}
