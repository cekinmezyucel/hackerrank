package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class GradingStudents {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		while (n-- > 0) {
			round(in.nextInt());
		}

		in.close();
	}

	static void round(int grade) {
		if (grade >= 38 && grade % 5 >= 3) {
			grade = grade + (5 - (grade % 5));
		}
		System.out.println(grade);
	}

}
