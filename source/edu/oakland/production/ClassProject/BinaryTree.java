package edu.oakland.production.ClassProject.Middleware;

//Import Node.java
import edu.oakland.production.ClassProject.Middleware.*;

/*
 * BinaryTree class for use on Middleware part 1B.
 * 
 * @author Joshua Herkness, Trevor Luebbert Middleware
 * @version Version 1.0
 * @since Version 1.0
 */
public class BinaryTree {

	/// Root node
	Node root;
	
	private nodeNameFound;

	/*
	 * Adds a node to the binary tree, given a int key, and string name pair.
	 * 
	 * @param key Integer value corresponding to the key of the node.
	 * @param name String value corresponding to the name of the node.
	 */
	public void addNode(int key, String name) {

		// Create a new Node and initialize it
		Node newNode = new Node(key, name);

		// If there is no root this becomes root
		if (root == null) {

			root = newNode;

		} else {

			// Set root as the Node we will start
			// with as we traverse the tree
			Node focusNode = root;

			// Future parent for our new Node
			Node parent;

			while (true) {

				// root is the top parent so we start
				// there
				parent = focusNode;

				// Check if the new node should go on
				// the left side of the parent node
				if (key < focusNode.key) {

					// Switch focus to the left child
					focusNode = focusNode.leftChild;

					// If the left child has no children
					if (focusNode == null) {

						// then place the new node on the left of it
						parent.leftChild = newNode;
						return; // All Done

					}

				} else { // If we get here put the node on the right

					focusNode = focusNode.rightChild;

					// If the right child has no children
					if (focusNode == null) {

						// then place the new node on the right of it
						parent.rightChild = newNode;
						return; // All Done

					}
				}
			}
		}
	}

	// All nodes are visited in ascending order
	// Recursion is used to go to one node and
	// then go to its child nodes and so forth
	public void inOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {

			// Traverse the left node
			inOrderTraverseTree(focusNode.leftChild);

			// Visit the currently focused on node
			System.out.println(focusNode);

			// Traverse the right node
			inOrderTraverseTree(focusNode.rightChild);

		}

	}
	
	public void preorderTraverseTree(Node focusNode) {

		if (focusNode != null) {

			System.out.println(focusNode);

			preorderTraverseTree(focusNode.leftChild);
			preorderTraverseTree(focusNode.rightChild);

		}

	}

	public void postOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {

			postOrderTraverseTree(focusNode.leftChild);
			postOrderTraverseTree(focusNode.rightChild);

			System.out.println(focusNode);

		}

	}
	
	/*
	 * Description
	 * 
	 * @param name String value name corresponding to a specific node name.
	 * 
	 * @returns nodesSearched Integer value corresponding to the amount of nodes search.
	 */
	public Node preorderSearchNode(Node focusNode, String name){
		
		Node focusNode = focusNode;
		
		Node result = null;
		
		if (focusNode == null) {
			return null;
		} else if (focusNode.getName().equals(name)){
			return focusNode;
		
		if (focusNode.leftNode != null){
			result = preorderSearchNodeCount(focusNode.leftNode, name);
		}
		
		if (result == null){
			result = preorderSearchNodeCount(focusNode.rightNode, name);
		}
			
		return result;
	}
	
	/*
	 * Description
	 * 
	 * @param name String value name corresponding to a specific node name.
	 * 
	 * @returns nodesSearched Integer value corresponding to the amount of nodes search.
	 */
	public int preorderSearchNodeCount(Node focusNode, String name){
		
		Node focusNode = focusNode;
		
		int nodeCount = 0;
		
		/*
		if (nodeNameFound){
			return
		}
		
		if (focusNode = null) {
			return 0;
		} else if (focusNode.getName().equals(name)){
			return 0;
		
		if (focusNode.leftNode != null){
			nodeCount += preorderSearchNodeCount(focusNode.leftNode, name);
		}
			
		if (nodeNameFound){
			nodeCount += preorderSearchNodeCount(focusNode.rightNode, name);
		}
		
		*/
		while (!focusNode.getName().equals(name)){
			
			if (focusNode != null){
				
				nodeCount += preorderSearchNodeCount(focusNode.leftNode, name);
				nodeCount += preorderSearchNodeCount(focusNode.rightNode, name);
				
			}
		}
		
		nodeFound = true;
		
	}
		

	public Node findNode(int key) {

		// Start at the top of the tree

		Node focusNode = root;

		// While we haven't found the Node
		// keep looking

		while (focusNode.key != key) {

			// If we should search to the left

			if (key < focusNode.key) {

				// Shift the focus Node to the left child

				focusNode = focusNode.leftChild;

			} else {

				// Shift the focus Node to the right child

				focusNode = focusNode.rightChild;

			}

			// The node wasn't found

			if (focusNode == null)
				return null;

		}

		return focusNode;

	}
}