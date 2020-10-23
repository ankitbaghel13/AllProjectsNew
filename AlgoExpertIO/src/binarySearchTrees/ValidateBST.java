package binarySearchTrees;

import binaryTrees.Node;
import binaryTrees.TreeUtility;

public class ValidateBST {

	public static void main(String[] args) {

		Node root = TreeUtility.getLargeTree();
		System.out.println(validateBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

	private static boolean validateBST(Node root, int minValue, int maxValue) {
		
		if(root==null)
			return true;
		
		if(root.key<minValue || root.key>maxValue)
			return false;
		
		return validateBST(root.left, minValue, root.key) &&
				validateBST(root.right, root.key, maxValue);
	}

}
