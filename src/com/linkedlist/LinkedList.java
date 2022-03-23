package com.linkedlist;

public class LinkedList {
public Node head;
	
	
	 // this class represents a node of linked list
	
	private class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	/**
	 * @param data this parameter is the data to be stored in the node
	 * this method adds a node with data to the end of the linked list
	 */
	public  void add(final int data) {
		
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			
		}
		else {
			Node temp=head;
			while(temp.next != null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	/**
	 * @param data is the value to be stored in node
	 * adds a node to the beginning of the LL
	 */ 
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next=head;
		head=newNode;
		
	}
	/**
	 * @param data is the value to be stored in node
	 * @param dest is the location where node is to be inserted
	 */
	public void inBetween(int data,int dest)
	{
	
		if(dest==1) {
			push(data);
		}
		else {
			Node newNode = new Node(data);
			int count = 1;
			Node next = head;
			Node prev = next;
			while(count < dest) {
				prev = next;
				next = next.next;
				count++;
			}
			prev.next = newNode;
			newNode.next = next;
			
		}
		
	}
	
	/**
	 * this method deletes first node of LL (USECASE5)
	 */
	public void deleteFirst()  {
		if(head==null) {
			System.out.println("Underflow, Linked list is empty");
			return;
		}
		Node temp=head;
		if(head.next==null) {
			head=null;
		}
		else {
			head=temp.next;
		}
	}
	/**
	 * this method deletes the last node from the LL (USECASE6)
	 */
	public void deleteLast()  {
		if(head==null) {
			System.out.println("Underflow, Linked list is empty");
			return;
		}
		Node temp=head;
		Node q=temp;
		if(head.next==null) {
			head=null;
		}
		else {
			while(temp.next!=null) {
				q=temp;
				temp=temp.next;
			}
			q.next=null;
		}
	}
	
	/**
	 * @param data is the element to be searched
	 * this method searchs for the given data in the LL
	 */
	public void search(int data) {
		Node temp=head;
		int count=0;
		if(head==null) {
			System.out.println("Underflow, Linked list is empty");
			return;
		}
		while(temp!=null) {
			if(temp.data==data) {
				System.out.println("Found at "+(count+1));
				return;
			}
			else {
				temp=temp.next;
				count++;
			}
		}
	}
	
	/**
	 * this method prints the content of the LL
	 */
	public void print() {
		Node temp= head;
		if(temp==null) {
			System.out.println("Underflow, Linked list is empty");
			return;
		}
		while(temp.next!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	
	/**
	 * @param key is the data of the node after which node is to be inserted
	 * @param data is the data of the node
	 * This method adds a node after the specified node
	 */
	public void addAfter(int key, int data) {
		
		Node newNode = new Node(data);
		if(head == null) {
			System.out.println("underflow, Linked list is empty");
			return;
		}
		Node temp = head;
		while(temp != null) {
			if(temp.data == key) {
				if(temp.next == null) {
					temp.next=newNode;
					return;
				}
				else {
					newNode.next=temp.next;
					temp.next=newNode;
					return;
				}
				
				
				
			}
			temp=temp.next;
		}
		System.out.println("Key not found");
		
		
		
	}
	
	/**
	 * @param data
	 * this method deletes the given data from LL
	 */
	public void deleteNode(int data) {

		if(head == null) {
			System.out.println("underflow, Linked list is empty");
			return;
		}
		if(head.next == null) {
			head=null;
			return;
		}
		else {
			Node temp = head;
			Node q = temp;
			while(temp.next != null) {
				if(temp.data == data) {
					q.next = temp.next;
					
				}
				q = temp;
				temp = temp.next;
			}
		}
		
		
	}
	
	
}
