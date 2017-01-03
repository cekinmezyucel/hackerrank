package com.cekinmezyucel.hackerrank.datastructures.linkedlists;

public class GetNodeValue {

	public static void main(String[] args) {
		Node head = new Node(1, new Node(2, new Node(3, new Node(4, null))));

		System.out.println(GetNode(head, 2));
	}

	static int GetNode(Node head, int n) {

		Node first = head;
		Node second = head;
		int iterator = 0;

		while (first.next != null) {
			first = first.next;

			if (iterator++ >= n) {
				second = second.next;
			}
		}
		return second.data;
	}

}
