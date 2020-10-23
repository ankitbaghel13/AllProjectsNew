package binaryTrees;

public class RootToLeafPathSumEqualToNumber {

	public static void main(String[] args) {
		
		Node root = TreeUtility.getSmallTree();
		System.out.println(rootToLeafPathSumEqualToNumber(root,8));
	}

	/*					   1
	 *					 /	 \
	 * 				   2	  3
	 * 			     /	\		 
	 *			    4	 5
	 *               \
	 *                6	   
	 */
	private static boolean rootToLeafPathSumEqualToNumber(Node root, int rem) {
		
		if(root==null)
			return false;
		
		rem = rem-root.key;
		if(rem==0 && root.left==null && root.right==null)
			return true;
		
		return rootToLeafPathSumEqualToNumber(root.left, rem) || 
				rootToLeafPathSumEqualToNumber(root.right, rem);
	}

}
