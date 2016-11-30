package com.cekinmezyucel.hackerrank.datastructures.linkedlists;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	public Node() {
		super();
	}

	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
}

public class PrintTheElementsOfALinkedList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcases = scan.nextInt();

		for (int i = 0; i < testcases; i++) {
			int nodeCount = scan.nextInt();

			Node head = null;
			Node temp = null;
			for (int j = 0; j < nodeCount; j++) {
				Node node = new Node();
				node.data = scan.nextInt();

				if (temp != null) {
					temp.next = node;
				} else {
					head = node;
				}

				temp = node;
			}

			Print(head);
		}
		scan.close();
	}

	// This is the code without static keyword
	static void Print(Node head) {
		if (null != head) {
			if (null != head.next) {
				System.out.println(head.data);
				Print(head.next);
			} else if (null == head.next) {
				System.out.println(head.data);
			}
		}
	}
}

// TestCase
// 5
// 0
// 2
// 1 2
// 4
// 2 1 4 5
// 3
// 34 45 56
// 5
// 1 2 3 4 5
