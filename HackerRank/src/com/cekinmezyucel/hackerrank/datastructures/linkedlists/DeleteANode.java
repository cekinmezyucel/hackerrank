package com.cekinmezyucel.hackerrank.datastructures.linkedlists;

public class DeleteANode {

	public static void main(String[] args) {
		Node head = new Node(1, new Node(2, new Node(3, new Node(4, null))));

		Print(Delete(head, 2));
	}

	static Node Delete(Node head, int position) {
		if (position == 0) {
			return head.next;
		}
		head.next = Delete(head.next, position - 1);
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
