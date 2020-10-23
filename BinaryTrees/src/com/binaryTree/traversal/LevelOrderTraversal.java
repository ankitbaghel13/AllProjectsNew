package com.binaryTree.traversal;

import java.util.LinkedList;
import java.util.Queue;

import com.binaryTree.util.TreeUtility;

public class LevelOrderTraversal {

	static Node root;

	public LevelOrderTraversal() {
		root = null;
	}

	public static void main(String[] args) {

		LevelOrderTraversal tree = new LevelOrderTraversal();
		tree.root = TreeUtility.getLargeTree();

		System.out.println("Level Order traversal of binary tree is ");
		//tree.levelOrderTraversalWithQueue();
		
		tree.printGivenLevel(root,4);
	}

	public void printGivenLevel(Node root, int level) {
		
		if (root == null) 
            return; 
        if (level == 1) 
            System.out.print(root.key + " "); 
        else if (level > 1) 
        { 
            printGivenLevel(root.left, level-1); 
            printGivenLevel(root.right, level-1); 
        } 
	}

	public void levelOrderTraversalWithQueue() {
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()){
			
			Node tempNode = queue.poll();
			System.out.print(tempNode.key+" ");
			if(tempNode.left!=null)	
				queue.add(tempNode.left);
			if(tempNode.right!=null)
				queue.add(tempNode.right);
		}
	}

}
