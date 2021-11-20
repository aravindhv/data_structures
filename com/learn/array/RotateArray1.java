//$Id$
package com.learn.array;

import com.learn.ds.list.LinkedList;
import com.learn.ds.list.Node;

public class RotateArray1 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		
		int noOfShift = 2;
		Node tempNode = list.node;
		Node tempHead = list.node;
		Node nextNode = list.node;
		int tempIndex = 0;
		while(tempNode.nextNode != null) {
			
			if(tempIndex != noOfShift && tempNode.nextNode.nextNode != null) {
				++tempIndex;
				nextNode = tempNode.nextNode.nextNode;
				tempNode.nextNode.nextNode = tempNode;
				tempNode = nextNode;
			}
			if(tempIndex == noOfShift) {
				nextNode = tempNode.nextNode.nextNode;
				tempNode.nextNode = null;
				tempNode = nextNode;
			}
			if(tempNode.nextNode == null) {
				tempNode.nextNode = tempHead;
			}
		}
	}

}
