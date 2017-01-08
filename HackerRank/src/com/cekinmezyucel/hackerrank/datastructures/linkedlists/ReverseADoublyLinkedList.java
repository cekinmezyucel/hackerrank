package com.cekinmezyucel.hackerrank.datastructures.linkedlists;

public class ReverseADoublyLinkedList {
	public static void main(String[] args) {
		DoublyNode node0 = new DoublyNode();
		DoublyNode node1 = new DoublyNode();
		DoublyNode node2 = new DoublyNode();
		DoublyNode node3 = new DoublyNode();
		node0.data = 0;
		node0.next = node1;
		node1.data = 1;
		node1.prev = node0;
		node1.next = node2;
		node2.data = 2;
		node2.prev = node1;
		node2.next = node3;
		node3.data = 3;
		node3.prev = node2;

		DoublyNode reverse = Reverse(node0);

		while (reverse != null) {
			System.out.println(reverse.data);
			reverse = reverse.next;
		}
	}

	static DoublyNode Reverse(DoublyNode head) {
		DoublyNode temp = head;
		DoublyNode newHead = head;

		while (temp != null) {
			DoublyNode prev = temp.prev;
			temp.prev = temp.next;
			temp.next = prev;
			newHead = temp;
			temp = temp.prev;
		}

		return newHead;
	}

}
