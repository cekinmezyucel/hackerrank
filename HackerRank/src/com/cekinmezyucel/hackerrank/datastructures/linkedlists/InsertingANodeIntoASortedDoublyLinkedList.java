package com.cekinmezyucel.hackerrank.datastructures.linkedlists;

import java.util.Scanner;

class DoublyNode {
	int data;
	DoublyNode prev;
	DoublyNode next;
}

public class InsertingANodeIntoASortedDoublyLinkedList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		while (t-- > 0) {
			int n = scan.nextInt();
			DoublyNode head = null;
			while (n-- > 0) {
				head = SortedInsert(head, scan.nextInt());
			}

			while (head != null) {
				System.out.println(head.data);
				head = head.next;
			}
		}
		scan.close();
	}

	static DoublyNode SortedInsert(DoublyNode head, int data) {
		DoublyNode n = new DoublyNode();
		n.data = data;

		if (null == head) {
			return n;
		} else if (data <= head.data) {
			n.next = head;
			head.prev = n;
			return n;
		} else {
			DoublyNode rest = SortedInsert(head.next, data);
			head.next = rest;
			rest.prev = head;
			return head;
		}
	}
}
