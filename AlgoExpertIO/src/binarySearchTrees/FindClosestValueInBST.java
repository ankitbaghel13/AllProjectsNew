package binarySearchTrees;

import binaryTrees.Node;
import binaryTrees.TreeUtility;

public class FindClosestValueInBST {

	public static void main(String[] args) {
		
		Node node = TreeUtility.getLargeTree();
		System.out.println(findClosestValueInBST(node,21,Integer.MAX_VALUE));
	}

	/*					   25
	 *					 /	  \
	 *				   /	    \			 
	 * 				15		       50
	 * 			  /	   \		 /    \  
	 *			10		22	   35	   70
	 * 		    /\	    /\     /\	   /\
	 * 		   4  12  18  24 31  44	 66  90
	 */
	private static int findClosestValueInBST(Node node, int target, int closestValue) {
		
		if(node==null)
			return closestValue;
		
		if(Math.abs(node.key-target)<Math.abs(closestValue-target))
			closestValue = node.key;
		
		if(target<node.key) 
			return findClosestValueInBST(node.left, target, closestValue);
		else if(target>node.key) 
			return findClosestValueInBST(node.right, target, closestValue);
		else 
			return node.key;
	}
	

}
