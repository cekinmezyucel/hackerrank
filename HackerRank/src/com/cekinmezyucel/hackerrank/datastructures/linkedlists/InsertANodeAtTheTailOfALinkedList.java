package com.cekinmezyucel.hackerrank.datastructures.linkedlists;

public class InsertANodeAtTheTailOfALinkedList {

	public static void main(String[] args) {
		Node head = new Node(1, new Node(2, new Node(3, new Node(4, null))));

		Print(Insert(head, 5));
	}

	// This is the code without static keyword
	static Node Insert(Node head, int data) {
		if (null == head) {
			Node newNode = new Node();
			newNode.data = data;
			return newNode;
		}

		Node tmp = head;

		while (tmp.next != null) {
			tmp = tmp.next;
		}

		Node newTail = new Node();
		newTail.data = data;
		tmp.next = newTail;

		return head;
	}

	// TestCode
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
