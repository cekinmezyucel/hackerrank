package com.cekinmezyucel.hackerrank.datastructures.linkedlists;

public class DeleteDuplicateValueNodesFromASortedLinkedList {

	public static void main(String[] args) {
		Node head = new Node(1, new Node(1, new Node(2, new Node(3, null))));

		Print(RemoveDuplicates(head));
	}

	static Node RemoveDuplicates(Node head) {

		if (head == null) {
			return head;
		}
		if (null != head.next) {
			if (head.data == head.next.data) {
				if (null != head.next.next) {
					head.next = head.next.next;
					RemoveDuplicates(head);
				} else {
					head.next = null;
					return head;
				}
			} else {
				RemoveDuplicates(head.next);
			}
		}

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
