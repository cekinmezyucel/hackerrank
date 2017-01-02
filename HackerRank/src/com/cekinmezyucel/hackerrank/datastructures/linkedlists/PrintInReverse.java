package com.cekinmezyucel.hackerrank.datastructures.linkedlists;

public class PrintInReverse {
	public static void main(String[] args) {
		Node head = new Node(1, new Node(2, new Node(3, new Node(4, null))));

		ReversePrint(head);
	}

	static void ReversePrint(Node head) {
		if (head == null) {
			return;
		} else {
			ReversePrint(head.next);
			System.out.println(head.data);
		}
	}
}
