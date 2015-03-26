package edu.oakland.production.ClassProject.Middleware;

/*
 * Node class, used for Middleware part 1B.
 * 
 * @author Joshua Herkness, Trevor Luebbert Middleware
 * @version Version 1.0
 * @since Version 1.0
 */
public class Node {

	/// Kay value.
	private int key;
	
	/// Name value.
	private String name;

	/// Left node. Less than the parent node.
	private Node leftChild;
	
	/// Right node.  Greater than the parent node
	private Node rightChild;

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