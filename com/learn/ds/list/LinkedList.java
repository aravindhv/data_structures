//$Id$
package com.learn.ds.list;

public class LinkedList {
	public Node node;
	
	public void insert(int value) {
		if(node != null) {
			Node tempNode = node;
			while(tempNode.nextNode != null) {
				tempNode = tempNode.nextNode;
			}
			tempNode.nextNode = new Node(value);
		} else {
			node = new Node(value);
		}
	}
	
	public void print() {
		if(node != null) {
			Node tempNode = node;
			while(tempNode.nextNode != null) {
				System.out.print(tempNode.value + " ");
				tempNode = tempNode.nextNode;
			}
			System.out.print(tempNode.value);
			System.out.println();
		} else {
			System.out.println("No Nodes present.!");
		}
	}
	
	public void reverse() {
		
	}

	public int length() {
		int length = 0;
		Node tempNode = node;
		while(tempNode.nextNode != null) {
			++length;
			tempNode = tempNode.nextNode;
		}
		return length;
	}
}