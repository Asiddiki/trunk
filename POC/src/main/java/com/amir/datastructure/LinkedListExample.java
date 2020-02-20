package com.amir.datastructure;

public class LinkedListExample {

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public void  display(Node head) {
		
		Node p = head;
		while (p!=null) {
			
			System.out.println(p.data);
			p=p.next;
			
		}
	}
	
	public static void main(String[] args) {
		LinkedListExample linkedList = new LinkedListExample();
		Node first = new Node(0);
		Node second = new Node(1);
		Node third = new Node(2);
		Node fourth = new Node(4);
		
		first.next = second;
		second.next = third;
		third.next = fourth;
		
		linkedList.display(first);
	}
}
