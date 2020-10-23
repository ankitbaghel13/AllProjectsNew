package binaryTrees;

public class NodeDepths {

	static int totalDepth;
	public static void main(String[] args) {
		
		Node node = TreeUtility.getAlgoExpertTree();
		System.out.println(nodeDepths(node,0));
	}

	/*					   1
	 *					 /	 \
	 * 				   2	  3
	 * 			      /	\	 / \ 
	 *			     4	 5  6   7
	 *              / \
	 *             8   9	   
	 */
	private static int nodeDepths(Node node, int currDepth) {

//		if(node==null)
//			return 0;
//		
//		currDepth++;
//		totalDepth += currDepth;
//		nodeDepths(node.left, currDepth);
//		nodeDepths(node.right, currDepth);
//		
//		return totalDepth;
		
		if(node==null)
			return 0;
		
		return currDepth + nodeDepths(node.left, currDepth+1) + nodeDepths(node.right, currDepth+1);
	}

}
