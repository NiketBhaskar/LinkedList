package com.linkedlist;

public class Main {
	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		linkedlist.add(56);
		linkedlist.add(30);
		linkedlist.add(72);
		linkedlist.search(72);
		linkedlist.addAfter(30,40);
		linkedlist.deleteNode(30);
		linkedlist.deleteLast();
		linkedlist.inBetween(20, 3);
		System.out.println("Linked list is");
		linkedlist.print();
		
		OrderedLinkedList orderedList = new OrderedLinkedList();
		orderedList.add(56);
		orderedList.add(30);
		orderedList.add(40);
		orderedList.add(72);
		System.out.println("ordered list is");
		orderedList.print();
	}
}
