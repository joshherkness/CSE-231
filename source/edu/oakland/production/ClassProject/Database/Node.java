package edu.oakland.production.ClassProject.Database;

/*
 * Node class, used for Middleware part 1B.
 * 
 * @author Joshua Herkness, Trevor Luebbert Middleware
 * @version Version 1.0
 * @since Version 1.0
 */
public class Node {

	/// Kay value.
	public int key;
	
	/// Name value.
	public String name;

	/// Left node. Less than the parent node.
	public Node leftNode;
	
	/// Right node.  Greater than the parent node
	public Node rightNode;

	/*
	 * Constructor for the Node object.  Accepts a integer key, and String name pair.
	 * 
	 * @param key Integer value corresponding to the key of the node.
	 * @param name String value corresponding to the name of the node.
	 * 
	 * @returns Node
	 */
	public Node(int key, String name) {

		this.key = key;
		this.name = name;

	}

	/*
	 * Creates a string description for the node.
	 * 
	 * @returns String
	 */
	public String toString() {

		return name + " has the key " + key;

		/*
		 * return name + " has the key " + key + "\nLeft Child: " + leftChild +
		 * "\nRight Child: " + rightChild + "\n";
		 */

	}
	
	/*
	 * Retrieves the name of the node.
	 * 
	 * @returns name String value corresponding to the name of the node.
	 */
	public String getName(){
		
		return name;
	}

}