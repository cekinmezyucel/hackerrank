package com.cekinmezyucel.hackerrank.tutorials.thirtydaysofcode;

import java.util.Scanner;

public class Day16ExceptionsStringToInteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		in.close();

		try {
			System.out.println(Integer.valueOf(S));
		} catch (NumberFormatException e) {
			System.out.println("Bad String");
		}
	}

}
