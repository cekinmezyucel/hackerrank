package com.cekinmezyucel.hackerrank.tutorials.thirtydaysofcode;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

public class Day15LinkedList {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt();

		while (N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);
		sc.close();
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static Node insert(Node head, int data) {

		if (head == null) {
			return new Node(data);
		}

		Node tmp = head;
		while (tmp.next != null) {
			tmp = tmp.next;
		}
		tmp.next = new Node(data);

		return head;

	}

}
