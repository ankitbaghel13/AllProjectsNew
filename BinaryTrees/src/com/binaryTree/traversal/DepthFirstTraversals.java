package com.binaryTree.traversal;

public class DepthFirstTraversals {

	Node root;

	public DepthFirstTraversals() {
		root = null;
	}

	public static void main(String[] args) {

		DepthFirstTraversals tree = new DepthFirstTraversals();
		/*tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);*/
		
		/*					   25
		 *					 /	  \
		 *				   /	    \			 
		 * 				15		       50
		 * 			  /	   \		 /    \  
		 *			10		22	   35	   70
		 * 		    /\	    /\     /\	   /\
		 * 		   4  12  18  24 31  44	 66  90
		 * 
		 * 
		 */
		tree.root = new Node(25);
		tree.root.left = new Node(15);
		tree.root.right = new Node(50);
		tree.root.left.left = new Node(10);
		tree.root.left.right = new Node(22);
		tree.root.right.left = new Node(35);
		tree.root.right.right = new Node(70);
		tree.root.left.left.left = new Node(4);
		tree.root.left.left.right = new Node(12);
		tree.root.left.right.left = new Node(18);
		tree.root.left.right.right = new Node(24);
		tree.root.right.left.left = new Node(31);
		tree.root.right.left.right = new Node(44);
		tree.root.right.right.left = new Node(66);
		tree.root.right.right.right = new Node(90);

		System.out.println("Preorder traversal of binary tree is ");
		tree.printPreorder();

		System.out.println("\nInorder traversal of binary tree is ");
		tree.printInorder();

		System.out.println("\nPostorder traversal of binary tree is ");
		tree.printPostorder();
	}

	void printPreorder() {
		printPreorder(root);
	}

	void printInorder() {
		printInorder(root);
	}

	void printPostorder() {
		printPostorder(root);
	}

	void printPreorder(Node root) {

		if (root != null) {
			System.out.print(root.key+" ");
			printPreorder(root.left);
			printPreorder(root.right);
		}
	}

	void printInorder(Node root) {

		if (root != null) {
			printInorder(root.left);
			System.out.print(root.key+" ");
			printInorder(root.right);
		}
	}

	void printPostorder(Node root) {

		if (root != null) {
			printPostorder(root.left);
			printPostorder(root.right);
			System.out.print(root.key+" ");
		}
	}

}
