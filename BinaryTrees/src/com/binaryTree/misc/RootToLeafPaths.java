package com.binaryTree.misc;

import com.binaryTree.traversal.Node;
import com.binaryTree.util.TreeUtility;

public class RootToLeafPaths {

	Node root;

	public RootToLeafPaths() {
		root = null;
	}

	public static void main(String[] args) {

		RootToLeafPaths tree = new RootToLeafPaths();
		tree.root = TreeUtility.getSmallTree();
		tree.printAllRootToLeafPaths();
	}

	public void printAllRootToLeafPaths() {
		int path[] = new int[6];
		printAllRootToLeafPaths(root,path,0);
	}

	public void printAllRootToLeafPaths(Node root, int[] path, int pathLen) {
	
		if(root==null)
			return;
		
		path[pathLen] = root.key;
		pathLen++;
		
		if(root.left==null&&root.right==null)
			printArray(path,pathLen);
		else{
			printAllRootToLeafPaths(root.left, path, pathLen);
			printAllRootToLeafPaths(root.right, path, pathLen);
		}
	}

	public void printArray(int[] path, int pathLen) {
	
		for(int i=0;i<pathLen;i++)
			System.out.print(path[i]+" ");
		System.out.println();
	}

}
