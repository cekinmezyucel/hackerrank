package com.cekinmezyucel.hackerrank.java.advanced;

import java.util.Scanner;

class Flower {
	public String whats_Your_Name() {
		return "I have many names and types";
	}
}

class Jasmine extends Flower {
	public String whats_Your_Name() {
		return "Jasmine";
	}
}

class Lily extends Flower {
	public String whats_Your_Name() {
		return "Lily";
	}
}

class Lotus extends Flower {
	public String whats_Your_Name() {
		return "Lotus";
	}
}

class State {
	public Flower your_National_Flower() {
		return new Flower();
	}
}

class WestBengal extends State {
	public Jasmine your_National_Flower() {
		return new Jasmine();
	}
}

class Karnataka extends State {
	public Lotus your_National_Flower() {
		return new Lotus();
	}
}

class AndhraPradesh extends State {
	public Lily your_National_Flower() {
		return new Lily();
	}
}

public class CovariantReturnTypes {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {

		Scanner sc = new Scanner(System.in);
		String className = sc.next();

		StringBuilder sb = new StringBuilder();
		sb.append("com.cekinmezyucel.hackerrank.java.advanced.");
		sb.append(className);

		State state = (State) Class.forName(sb.toString()).newInstance();
		Flower flower = state.your_National_Flower();
		System.out.println(flower.whats_Your_Name());

		sc.close();

	}
}
