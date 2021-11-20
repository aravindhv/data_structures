//$Id$
package com.learn.ds.tree;

import java.util.Stack;

public class BinaryTree {
	
	/*
	 * 		  1
	 * 		/	\
	 * 	   2      3
	 *    / \
	 *   4  5
	 */
	
	private TreeNode root;
	
	public void createBinaryTree() {
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		
		root = first;
		
		first.left = second;
		first.right = third;
		
		second.left = fourth;
		second.right = fifth;
	}
	
	public void recursivePreOrderTraversal(TreeNode node) {
		if(node == null) {
			return;
		}
		System.out.print(node.data + " ");
		recursivePreOrderTraversal(node.left);
		recursivePreOrderTraversal(node.right);
	}

	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.createBinaryTree();
		System.out.println("Recursive PreOrder Traversal");
		binaryTree.recursivePreOrderTraversal(binaryTree.root);
		System.out.println("\nIterative PreOrder Traversal");
		binaryTree.iterativePreOrderTraversal();
		System.out.println("\nRecursive InOrder Traversal");
		binaryTree.recursiveInOrderTraversal(binaryTree.root);
		System.out.println("\nIterative InOrder Traversal");
		binaryTree.iterativeInOrderTraversal();
		System.out.println("\nRecursive PostOrder Traversal");
		binaryTree.recursivePostOrderTraversal(binaryTree.root);
		System.out.println("\nIterative PostOrder Traversal");
		binaryTree.iterativePostOrderTraversal();
	}

	public void iterativePostOrderTraversal() {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = root;
		while(!stack.isEmpty() || temp != null) {
			if(temp != null) {
				stack.push(temp);
				temp = temp.left;
			} else {
				TreeNode nextNode = stack.peek().right;
				if(nextNode == null) {
					nextNode = stack.pop();
					System.out.print(nextNode.data + " ");
					while(!stack.isEmpty() && nextNode == stack.peek().right) {
						nextNode = stack.pop();
						System.out.print(nextNode.data + " ");
					}
				} else {
					temp = nextNode;
				}
			}
		}
	}

	public void recursivePostOrderTraversal(TreeNode node) {
		if(node == null) {
			return;
		}
		recursivePostOrderTraversal(node.left);
		recursivePostOrderTraversal(node.right);
		System.out.print(node.data + " ");
	}

	public void iterativeInOrderTraversal() {
		if(root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = root;
		while(!stack.empty() || temp != null) {
			if(temp != null) {
				stack.push(temp);
				temp = temp.left;
			} else {
				temp = stack.pop();
				System.out.print(temp.data + " ");
				temp = temp.right;
			}
			
		}
	}

	public void recursiveInOrderTraversal(TreeNode root) {
		if(root == null) {
			return;
		}
		recursiveInOrderTraversal(root.left);
		System.out.print(root.data + " ");
		recursiveInOrderTraversal(root.right);
	}

	public void iterativePreOrderTraversal() {
		if(root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			System.out.print(temp.data + " ");
			if(temp.right != null) {
				stack.push(temp.right);
			}
			if(temp.left != null) {
				stack.push(temp.left);
			}
		}
	}
}