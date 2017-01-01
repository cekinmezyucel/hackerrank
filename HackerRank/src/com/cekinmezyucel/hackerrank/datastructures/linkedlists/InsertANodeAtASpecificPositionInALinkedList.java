package com.cekinmezyucel.hackerrank.datastructures.linkedlists;

public class InsertANodeAtASpecificPositionInALinkedList {

	public static void main(String[] args) {
		Node head = new Node(1, new Node(2, new Node(3, new Node(4, null))));

		Print(InsertNth(head, 5, 2));
	}

	// This is the code without static keyword
	static Node InsertNth(Node head, int data, int position) {

		if (position == 0) {
			Node start = new Node();
			start.data = data;
			start.next = head;
			return start;
		}

		Node tmp = head;
		while (position-- > 1) {
			tmp = tmp.next;
		}

		Node after = tmp.next;
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = after;
		tmp.next = newNode;

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
