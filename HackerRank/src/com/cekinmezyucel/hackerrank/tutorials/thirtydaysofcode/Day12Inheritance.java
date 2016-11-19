package com.cekinmezyucel.hackerrank.tutorials.thirtydaysofcode;

import java.util.Scanner;

class Persson {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Persson(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
	}

}

class Student extends Persson {

	private int[] testScores;

	public Student(String firstName, String lastName, int identification, int[] testScores) {
		super(firstName, lastName, identification);
		this.testScores = testScores;
	}

	public String calculate() {
		int sumOfScores = 0;
		int avgScore = 0;
		String grade = null;

		for (int score : testScores) {
			sumOfScores += score;
		}

		avgScore = sumOfScores / testScores.length;

		if (avgScore >= 90 && avgScore <= 100) {
			grade = "O";
		} else if (avgScore >= 80 && avgScore < 90) {
			grade = "E";
		} else if (avgScore >= 70 && avgScore < 80) {
			grade = "A";
		} else if (avgScore >= 55 && avgScore < 70) {
			grade = "P";
		} else if (avgScore >= 40 && avgScore < 55) {
			grade = "D";
		} else if (avgScore < 40) {
			grade = "T";
		}

		return grade;

	}
}

public class Day12Inheritance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for (int i = 0; i < numScores; i++) {
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}

}
