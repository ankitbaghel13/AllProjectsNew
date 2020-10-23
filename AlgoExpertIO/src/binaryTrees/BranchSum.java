package binaryTrees;

import java.util.ArrayList;
import java.util.List;

public class BranchSum {

	static List<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) {

		Node root = TreeUtility.getSmallTree();
		getBranchSum(root,0);
		System.out.println(list);
	}

	/*					   1
	 *					 /	 \
	 * 				   2	  3
	 * 			     /	\		 
	 *			    4	 5
	 *               \
	 *                6	   
	 */
	private static void getBranchSum(Node root,int currSum) {
		
		if(root==null)
			return;
		currSum = currSum+root.key;
		
		if(root.left==null && root.right==null) {
			list.add(currSum);
			return;
		}
		
		getBranchSum(root.left, currSum);
		getBranchSum(root.right, currSum);
	}

}
