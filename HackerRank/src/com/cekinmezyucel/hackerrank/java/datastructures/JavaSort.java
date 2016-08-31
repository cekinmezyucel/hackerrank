package com.cekinmezyucel.hackerrank.java.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}

public class JavaSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}

		studentList.sort((s1, s2) -> Integer.valueOf(s1.getId()).compareTo(Integer.valueOf(s2.getId())));
		studentList.sort((s1, s2) -> s1.getFname().compareTo(s2.getFname()));
		studentList.sort((s1, s2) -> Double.valueOf(s2.getCgpa()).compareTo(Double.valueOf(s1.getCgpa())));

		for (Student st : studentList) {
			System.out.println(st.getFname());
		}
	}

}
