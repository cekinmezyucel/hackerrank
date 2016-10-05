package com.cekinmezyucel.hackerrank.java.datastructures;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student {
	private int token;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.token = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getToken() {
		return token;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}

class StudentComprator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getCgpa() == o2.getCgpa()) {
			if (o1.getFname().equals(o2.getFname())) {
				return Integer.compare(o1.getToken(), o2.getToken());
			} else {
				return o1.getFname().compareTo(o2.getFname());
			}
		} else {
			return Double.compare(o2.getCgpa(), o1.getCgpa());
		}
	}

}

public class JavaPriorityQueue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int totalEvents = Integer.parseInt(in.nextLine());
		StudentComprator comprator = new StudentComprator();
		PriorityQueue<Student> queue = new PriorityQueue<>(10, comprator);
		while (totalEvents > 0) {
			String event = in.next();

			switch (event) {
			case "ENTER":
				String fname = in.next();
				double cgpa = in.nextDouble();
				int id = in.nextInt();
				queue.add(new Student(id, fname, cgpa));
				break;

			case "SERVED":
				if (!queue.isEmpty()) {
					queue.remove();
				}
				break;

			default:
				break;
			}

			totalEvents--;
		}

		if (!queue.isEmpty()) {
			while (!queue.isEmpty()) {
				System.out.println(queue.remove().getFname());
			}
		} else {
			System.out.println("EMPTY");
		}
	}

}
