/*
 * BinaryTreeMWTest.java
 * CSE231 Class Project
 * 
 * Copyright 2015 Joshua Herkness.
 */

package edu.oakland.test.ClassProject.Middleware;

// Import Java Util
import java.util.*

// Import BinaryTreeMW.java
import edu.oakland.production.ClassProject.Middleware.BinarTreeMW;

// Import BinaryTreeDB.java & Node.java
import edu.oakland.production.ClassProject.Database.BinarTreeDB;
import edu.oakland.production.ClassProject.Database.Node;

// Import JUnit
import junit.framework.*

/*
 * BinaryTreeMWTest.java
 * 
 * @author Joshua Herkness
 * @version Version 1.0
 * @since Version 1.0
 */
public class BinaryTreeMWTest extends TestCase {
	
	private int size = 5;
	
	private int key1 = 1;
	private int key2 = 3;
	private int key3 = 5;
	
	private String nodesSearched = "1 3 5"
	
	private Node nodeA;
	private Node nodeB;
	private Node nodeC;
	private Node nodeD;
	private Node nodeE;
	
	/// Instanciate a BinaryTreeDB<T> of value type String.
	private BinaryTreeDB<String> binaryTreeDatabase;
	
	/// Instanciate a BinaryTreeMW object.
	private BinaryTreeMW binaryTreeMiddleware;
	
	/*
	 * Description.
	 */
	public void setUp(){
		
		// Create nodes
		nodeA = new Node(1, "A");
		nodeB = new Node(2, "B");
		nodeC = new Node(3, "C");
		nodeD = new Node(4, "D");
		nodeE = new Node(5, "E");
		
		// Create binaryTreeDatabase, with value type String
		binaryTreeDatabase = new BinaryTreeDB<String>();
		
		// Add nodes to binaryTreeDatabase
		binaryTreeDatabase.addNode(nodeA);
		binaryTreeDatabase.addNode(nodeB);
		binaryTreeDatabase.addNode(nodeC);
		binaryTreeDatabase.addNode(nodeD);
		binaryTreeDatabase.addNode(nodeE);
		
		// Cunstruct the binaryTreeMiddleware with the binaryTreeDatabase.
		binaryTreeMiddleware = new BinaryTreeMW(binaryTreeDatabase);
	}
	
	/*
	 * Description.
	 */
	public void testInOrderBinarySearch {
		
	}
	
	/*
	 * Description
	 */
	public void testPreorderBinarySearch {
		
	}
	
	/*
	 * Description.
	 */
	public void testPreorderNodesSearched(){
		String nodesSearched = binarTreeMiddleware.calculatePreorderNodesSearched(this.key1, this.key2, this.key3);
		
		assertEqauls(this.nodesSearched, nodesSearched);
	}
	
	/*
	 * Description.
	 */
	public void testInOreorderNodesSearched(){
		String nodesSearched = binarTreeMiddleware.calculateInOrderNodesSearched(this.key1, this.key2, this.key3);
		
		assertEqauls(this.nodesSearched, nodesSearched);
	}
	
}