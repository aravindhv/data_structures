package com.learn.ds.list;

public class List {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		
		linkedList.insert(10);
		linkedList.insert(50);
		linkedList.insert(12);
		linkedList.insert(60);
		
		linkedList.print();
	}
}