package binaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {

	public static void main(String[] args) {
		
		Node root = TreeUtility.getAlgoExpertTree();
		DepthFirstTraversals.printInorder(root);
		//invertBinaryTreeIteratively(root);
		invertBinaryTreeRecursively(root);
		System.out.println();
		DepthFirstTraversals.printInorder(root);
	}

	/*					   1		|		 1
	 *					 /	 \		|	   /   \ 
	 * 				   2	  3		|     3		2
	 * 			      /	\	 / \ 	|    / \   / \
	 *			     4	 5  6   7	|	7   6 5	  4
	 *              / \				|			 / \
	 *             8   9	   		|			9	8
	 */
	private static void invertBinaryTreeIteratively(Node root) {
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		Node current;
		while(!queue.isEmpty()) {
			current = queue.poll();
			if(current==null)
				continue;
			swapLeftAndRight(current);
			queue.add(current.left);
			queue.add(current.right);
		}
//		System.out.println();
//		DepthFirstTraversals.printInorder(root);
	}
	
	private static void invertBinaryTreeRecursively(Node root) {
		if(root == null)
			return;
		swapLeftAndRight(root);
		invertBinaryTreeIteratively(root.left);
		invertBinaryTreeRecursively(root.right);
	}
	
	
	
	private static void swapLeftAndRight(Node current) {
		Node temp = current.left;
		current.left = current.right;
		current.right = temp;
	}
}
