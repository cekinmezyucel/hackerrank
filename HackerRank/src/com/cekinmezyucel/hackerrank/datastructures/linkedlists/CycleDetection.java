package com.cekinmezyucel.hackerrank.datastructures.linkedlists;

public class CycleDetection {

	public static void main(String[] args) {
		Node head = new Node(1, new Node(2, new Node(3, new Node(4, null))));

		System.out.println(hasCycle(head));
	}

	static boolean hasCycle(Node head) {
		if (head == null) {
			return false;
		}

		Node slow = head;
		Node fast = head.next;
		while (slow != fast) {
			if (fast == null || fast.next == null) {
				return false;
			}

			slow = slow.next;
			fast = fast.next.next;
		}

		return true;
	}

}
