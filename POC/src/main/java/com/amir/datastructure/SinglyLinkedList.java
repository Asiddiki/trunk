package com.amir.datastructure;

public class SinglyLinkedList {

	int counter ;
	Node head = null;
	Node tail = null;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void addNode(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	 
    public void reverse(Node current) {  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        else {   
            if(current.next == null) {  
                System.out.print(current.data + " ");  
                return;  
            }   
            reverse(current.next);  
            System.out.print(current.data + " ");  
        }  
    }
    
    public void deleteFromBegining() {
    	if(head == null) {  
            System.out.println("List is empty");  
            return;  
        } if(head.next == null) {
        	head= tail = null;
            return;  
        }
        head=head.next;
    }
    
	public void display() {
		Node current = head;
		if (current == null) {
			System.out.println("Link list is empty");
			return;
		}

		System.out.println("Nodes of singly linked list:");
		while (current != null) {
			counter++;
			System.out.print(current.data+" ");

			current = current.next;

		}
	}

	public static void main(String[] args) {

		   SinglyLinkedList sList = new SinglyLinkedList();    
	        sList.addNode(1);    
//	        sList.addNode(2);    
//	        sList.addNode(3);    
//	        sList.addNode(4);
//	        sList.addNode(5); 
//	        sList.addNode(6); 
	        sList.display();
	        System.out.println("\nTotal number of nodes: "+sList.counter);
	        //sList.reverse(sList.head);
	        System.out.println("Deleted from begining");
	        sList.deleteFromBegining();
	        sList.display();
	}

}
