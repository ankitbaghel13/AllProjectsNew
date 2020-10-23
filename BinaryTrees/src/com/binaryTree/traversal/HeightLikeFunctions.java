package com.binaryTree.traversal;

import com.binaryTree.util.TreeUtility;

public class HeightLikeFunctions {
	
	Node root;
	
	public HeightLikeFunctions(){
		root = null;
	}

	public static void main(String[] args) {

		HeightLikeFunctions tree = new HeightLikeFunctions();
		tree.root = TreeUtility.getLargeTree();
		
		int height = tree.getHeight();
		System.out.println("Height of binary tree is "+height);
		
		tree.printGivenLevel(5);
	}

	public void printGivenLevel(int level){
		printGivenLevel(root,level);
	}
	
	public void printGivenLevel(Node root,int level) {
	
		if(root==null)
			return;
		else if(level==1)
			System.out.print(root.key+" ");
		else if(level>1){
			
			printGivenLevel(root.left,level-1);
			printGivenLevel(root.right,level-1);
		}
	}

	public int getHeight() {
		return getHeight(root);
	}
	
	public int getHeight(Node root) {
		
		int lHeight,rHeight = 0;
		
		if(root==null)
			return 0;
		else{
			lHeight = getHeight(root.left);
			rHeight = getHeight(root.right);
		
			return Math.max(lHeight+1, rHeight+1);
		}	
	}

}
