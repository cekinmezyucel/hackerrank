package com.cekinmezyucel.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class ViralAdvertising {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int days = in.nextInt();
		double shearedPeople = 5;
		int reachedPeople = 0;
		in.close();

		while (days-- > 0) {
			int reachedPeaoplePerDay = (int) Math.floor(shearedPeople / 2);
			reachedPeople += reachedPeaoplePerDay;
			shearedPeople = reachedPeaoplePerDay * 3;
		}

		System.out.println(reachedPeople);
	}

}
