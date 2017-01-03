package com.cekinmezyucel.hackerrank.datastructures.linkedlists;

public class MergeTwoSortedLinkedLists {

	public static void main(String[] args) {
		Node headA = new Node(1, new Node(3, new Node(5, new Node(7, null))));
		Node headB = new Node(2, new Node(4, new Node(6, new Node(8, new Node(10, null)))));

		Print(MergeLists(headA, headB));
	}

	static Node MergeLists(Node headA, Node headB) {

		if (null == headA && null == headB) {
			return headA;
		}

		if (null == headB) {
			return headA;
		}

		if (null == headA) {
			return headB;
		}

		Node headC = null;

		if (headA.data < headB.data) {
			headC = headA;
			headC.next = MergeLists(headA.next, headB);
		}

		if (headA.data > headB.data) {
			headC = headB;
			headC.next = MergeLists(headA, headB.next);
		}

		return headC;

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
