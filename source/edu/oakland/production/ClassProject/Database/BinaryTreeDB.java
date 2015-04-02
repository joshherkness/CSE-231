package edu.oakland.production.ClassProject.Database;

//Import Node.java
import edu.oakland.production.ClassProject.Database.*;

/*
 * Description.
 * 
 * @author Joshua Herkness Middleware
 * @version Version 1.0
 * @since Version 1.0
 */
public class BinaryTreeDB {

	/// Root node
	Node root;
	
	/*
	 * Description.
	 * 
	 * @returns BinaryTreeDB
	 */
	public BinaryTreeDB(){
		
	}

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
					focusNode = focusNode.leftNode;

					// If the left child has no children
					if (focusNode == null) {

						// then place the new node on the left of it
						parent.leftNode = newNode;
						return; // All Done

					}

				} else { // If we get here put the node on the right

					focusNode = focusNode.rightNode;

					// If the right child has no children
					if (focusNode == null) {

						// then place the new node on the right of it
						parent.rightNode = newNode;
						return; // All Done

					}
				}
			}
		}
	}
	
	/*
	 * Description.
	 * 
	 * @returns root Node object corresponding to the root node of the binaryTreeDB.
	 */
	public Node getRootNode(){
		
		return this.root;
	}
}