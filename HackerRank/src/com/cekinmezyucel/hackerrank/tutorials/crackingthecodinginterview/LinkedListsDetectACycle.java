package com.cekinmezyucel.hackerrank.tutorials.crackingthecodinginterview;

import java.util.HashSet;

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

public class LinkedListsDetectACycle {

	public static void main(String[] args) {
		Node head = new Node(1, new Node(2, new Node(3, new Node(4, null))));

		System.out.println(hasCycle(head));
	}

	static boolean hasCycle(Node head) {

		if (null == head) {
			return false;
		}

		HashSet<Node> nodeHashSet = new HashSet<>();
		while (head.next != null) {
			if (nodeHashSet.contains(head)) {
				return true;
			} else {
				nodeHashSet.add(head);
				head = head.next;
			}
		}

		return false;
	}

}
