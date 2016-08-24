package com.cekinmezyucel.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaEndOfFile {

	public static void main(String[] args) {

		int i = 1;
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			System.out.println(i + " " + scan.nextLine());
			i = i + 1;
		}

		scan.close();
	}

}
