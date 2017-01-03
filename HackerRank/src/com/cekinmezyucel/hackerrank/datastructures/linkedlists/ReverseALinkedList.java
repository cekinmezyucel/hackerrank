package com.cekinmezyucel.hackerrank.datastructures.linkedlists;

public class ReverseALinkedList {
	public static void main(String[] args) {
		Node head = new Node(1, new Node(2, new Node(3, new Node(4, null))));

		Print(Reverse(head));
	}

	static Node Reverse(Node head) {
		if (null == head || null == head.next) {
			return head;
		}

		Node rev = Reverse(head.next);
		head.next.next = head;
		head.next = null;

		return rev;
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
