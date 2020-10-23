package customImplementation;

/**
 * 
 * @author Ankit
 *
 */
public class BinarySearchTree {

	Node root;

	public void insert(Node n, int value, String name) {
		if (value < n.key) {
			if (n.leftChild != null) {
				insert(n.leftChild, value, name);
			} else {
				n.leftChild = new Node(value, name);
			}
		}
		if (value > n.key) {
			if (n.rightChild != null) {
				insert(n.rightChild, value, name);
			} else {
				n.rightChild = new Node(value, name);
			}
		}
	}

	public void addNode(int key, String name) {

		Node newNode = new Node(key, name);

		if (root == null) {
			root = newNode;
		} else {
			Node parent;
			Node focusNode = root;

			while (true) {

				parent = focusNode;

				if (key < focusNode.key) {
					focusNode = focusNode.leftChild;

					if (focusNode == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {
					focusNode = focusNode.rightChild;

					if (focusNode == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}

		}
	}

	public void inOrderTraversal(Node focusNode) {

		if (focusNode != null) {
			inOrderTraversal(focusNode.leftChild);
			System.out.println(focusNode);
			inOrderTraversal(focusNode.rightChild);
		}
	}

	public void preOrderTraversal(Node focusNode) {

		if (focusNode != null) {
			System.out.println(focusNode);
			preOrderTraversal(focusNode.leftChild);
			preOrderTraversal(focusNode.rightChild);
		}
	}

	public void postOrderTraversal(Node focusNode) {

		if (focusNode != null) {
			postOrderTraversal(focusNode.leftChild);
			postOrderTraversal(focusNode.rightChild);
			System.out.println(focusNode);
		}
	}

	public Node findNode(int key) {
		Node focusNode = root;

		while (key != focusNode.key) {
			if (key < focusNode.key)
				focusNode = focusNode.leftChild;
			else
				focusNode = focusNode.rightChild;

			if (focusNode == null)
				return null;
		}
		return focusNode;
	}

	public boolean remove(int key) {

		// Start at the top of the tree

		Node focusNode = root;
		Node parent = root;

		// When searching for a Node this will
		// tell us whether to search to the
		// right or left

		boolean isItALeftChild = true;

		// While we haven't found the Node
		// keep looking

		while (focusNode.key != key) {

			parent = focusNode;

			// If we should search to the left

			if (key < focusNode.key) {

				isItALeftChild = true;

				// Shift the focus Node to the left child

				focusNode = focusNode.leftChild;

			} else {

				// Greater than focus node so go to the right

				isItALeftChild = false;

				// Shift the focus Node to the right child

				focusNode = focusNode.rightChild;

			}

			// The node wasn't found

			if (focusNode == null)
				return false;

		}

		// If Node doesn't have children delete it

		if (focusNode.leftChild == null && focusNode.rightChild == null) {

			// If root delete it

			if (focusNode == root)
				root = null;

			// If it was marked as a left child
			// of the parent delete it in its parent

			else if (isItALeftChild)
				parent.leftChild = null;

			// Vice versa for the right child

			else
				parent.rightChild = null;

		}

		// If no right child

		else if (focusNode.rightChild == null) {

			if (focusNode == root)
				root = focusNode.leftChild;

			// If focus Node was on the left of parent
			// move the focus Nodes left child up to the
			// parent node

			else if (isItALeftChild)
				parent.leftChild = focusNode.leftChild;

			// Vice versa for the right child

			else
				parent.rightChild = focusNode.leftChild;

		}

		// If no left child

		else if (focusNode.leftChild == null) {

			if (focusNode == root)
				root = focusNode.rightChild;

			// If focus Node was on the left of parent
			// move the focus Nodes right child up to the
			// parent node

			else if (isItALeftChild)
				parent.leftChild = focusNode.rightChild;

			// Vice versa for the left child

			else
				parent.rightChild = focusNode.rightChild;

		}

		// Two children so I need to find the deleted nodes
		// replacement

		else {

			Node replacement = getReplacementNode(focusNode);

			// If the focusNode is root replace root
			// with the replacement

			if (focusNode == root)
				root = replacement;

			// If the deleted node was a left child
			// make the replacement the left child

			else if (isItALeftChild)
				parent.leftChild = replacement;

			// Vice versa if it was a right child

			else
				parent.rightChild = replacement;

			replacement.leftChild = focusNode.leftChild;
		}
		return true;
	}

	public Node getReplacementNode(Node replacedNode) {

		Node replacementParent = replacedNode;
		Node replacement = replacedNode;

		Node focusNode = replacedNode.rightChild;

		// While there are no more left children
		while (focusNode != null) {

			replacementParent = replacement;
			replacement = focusNode;
			focusNode = focusNode.leftChild;
		}

		// If the replacement isn't the right child
		// move the replacement into the parents
		// leftChild slot and move the replaced nodes
		// right child into the replacements rightChild

		if (replacement != replacedNode.rightChild) {

			replacementParent.leftChild = replacement.rightChild;
			replacement.rightChild = replacedNode.rightChild;

		}

		return replacement;

	}

	public static void main(String[] args) {

		BinarySearchTree bt = new BinarySearchTree();
		bt.addNode(50, "Ankit");
		bt.addNode(25, "Punit");
		bt.addNode(15, "Varun");
		bt.addNode(30, "Deepak");
		bt.addNode(75, "Tarun");
		bt.addNode(85, "Vaibhav");

		// System.out.println(bt.root);

		// bt.inOrderTraversal(bt.root);
		System.out.println(bt.findNode(15));
	}

}

class Node {

	int key;
	String name;

	public Node(int key, String name) {
		this.key = key;
		this.name = name;
	}

	Node leftChild;
	Node rightChild;

	@Override
	public String toString() {

		return name + " has the key " + key;
		// return name + " has the key " + key + "\n[Left Child: " + leftChild +
		// "\nRight Child: " + rightChild + "]\n";

	}
}
