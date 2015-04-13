/*
 * BinaryTreeMW.java
 * CSE 231 Class Project
 * 
 * Copyright (c) 2015 Joshua Herkness.
 */

package edu.oakland.production.ClassProject.Middleware;


//Import java util framework
import java.util.*;

//Import BinaryTreeDB.java & Node.java
import edu.oakland.production.ClassProject.Database.BinaryTreeDB;
import edu.oakland.production.ClassProject.Database.Node;


/*
 * BinaryTreeMW.  
 * This class is used to complete part 1B in the CSE231 class project.  
 * It allows a programmer to generate and mainipulate a binary tree, 
 * collecting data along the way.
 * 
 * @author Joshua Herkness, Middleware
 * @author Trevor Luebbert, Middleware
 * @version Version 2.6
 * @since version 1.0
 */
public class BinaryTreeMW {
	
	/// Minimum possible key value, used with generating a random key.
	private int minimumKeyValue = 400000;
	/// Maximum possible key value, used with generating a random key.
	private int maximumKeyValue = 800000;
	
	/// Minimum possible name value, used with generating a random name.
	private int minimumNameValue = 200000;
	/// Maximum possible key value, used with generating a random name.
	private int maximumNameValue = 600000;
	
	private BinaryTreeDB<String> binaryTreeDatabase;
	
	/*
	 * Default constructor for the BinaryTreeMW Class.
	 * 
	 * @return BinaryTreeMW
	 */
	public BinaryTreeMW(){
		
		this.binaryTreeDatabase = new BinaryTreeDB<String>();
	}
	
	/*
	 * Overloaded constructor for the BinaryTreeMW Class.
	 * Accepts a BinaryTreeDB<String> parameter.
	 * 
	 * @param binaryTreeDatabase BinaryTreeDB<String> object.
	 * @return BinaryTreeMW
	 */
	@supressWarnings("unchecked")
	public BinaryTreeMW(BinayTreeDB<String> binaryTreeDatabase){
		
		this.binaryTreeDatabase = binaryTreeDatabase;
	}
	
	/*
	 * Overloaded constructor for the BinaryTreeMW Class.  
	 * Popluates the binaryTreeDatabase given a size.
	 * 
	 * @param size Integer value corresponding to the desired size of the BinaryTreeDB<String> object.
	 * 
	 * @return BinaryTreeMW
	 */
	public BinaryTreeMW(int size){
		
		this.binaryTreeDatabase = new BinaryTreeDB<String>();
		
		// Populates the BinaryTreeDB object
		populateBinaryTreeDB(size);
	}
	
	/*
	 * Populates a private global BinaryTreeDB object with a given amount of nodes.  
	 * Creates a non-duplicate random key and name for each node.
	 * 
	 * @param size Integer value corresponding to the size of the binary tree.
	 * 
	 */
	public void populateBinaryTreeDB(int size){
		
		// Refresh the BinaryTreeDB object.
		this.binaryTreeDatabase = new BinaryTreeDB<String>();
		
		// Create a non-duplicate random number list for keys.
		List<Integer> nonDuplicateRandomNumberKeys = new ArrayList<Integer>();
		// Create a non-duplicate random number list for names.
		List<Integer> nonDuplicateRandomNumberNames = new ArrayList<Integer>();
		
		// Populate both key and name lists.
		nonDuplicateRandomNumberKeys = createNonDuplicateRandomNumbers(minimumKeyValue, 
																	   maximumKeyValue, 
																	   size);
		nonDuplicateRandomNumberNames = createNonDuplicateRandomNumbers(minimumNameValue, 
																		maximumNameValue, 
																		size);
		
		for (int i = 0; i < size; i++){
			
			// Reference key integer from a given index.
			int key = nonDuplicateRandomNumberKeys.get(i);
			// Reference name integer from a given index, then convert to a string.
			String name = String.valueOf(nonDuplicateRandomNumberNames.get(i));
			
			// Add a node to the BinaryTreeDB, given the key and name.
			this.binaryTreeDatabase.addNode(key, name);	
			
		}
	}
	
	/*
	 * Searches for three integer key values, providing a record of the 
	 * amount of nodes searched durring a preorder search.
	 * 
	 * @param key1 Integer value corresponding to a key value.
	 * @param key2 Integer value corresponding to a key value.
	 * @param key3 Integer value corresponding to a key value.
	 * 
	 * @return nodesSearched String value corresponding to the number of nodes searched respectively.
	 */
	public String calculatePreorderNodesSearched(int key1, int key2, int key3){
		
		String nodesSearched = "";
		
		Node focusNode = this.binaryTreeDatabase.getRootNode();
		
		nodesSearched += String.valueOf(calculatePreorderNodesSearched(this.binaryTreeDatabase, focusNode, key1));
		nodesSearched += " ";
		
		nodesSearched += String.valueOf(calculatePreorderNodesSearched(this.binaryTreeDatabase, focusNode, key2));
		nodesSearched += " ";
		
		nodesSearched += String.valueOf(calculatePreorderNodesSearched(this.binaryTreeDatabase, focusNode, key3));
		
		return nodesSearched;
	}
	
	/*
	 * Searches for three integer key values, 
	 * providing a record of the amount of nodes searched durring an in order search.
	 * 
	 * @param key1 Integer value corresponding to a key value.
	 * @param key2 Integer value corresponding to a key value.
	 * @param key3 Integer value corresponding to a key value.
	 * 
	 * @return nodesSearched String value corresponding to the number of nodes searched respectively.
	 */
	public String calculateInOrderNodesSearched(int key1, int key2, int key3){
		
		String nodesSearched = "";
		
		Node focusNode = this.binaryTreeDatabase.getRootNode();
		
		nodesSearched += String.valueOf(calculateInOrderNodesSearched(this.binaryTreeDatabase, focusNode, key1));
		nodesSearched += " ";
		
		nodesSearched += String.valueOf(calculateInOrderNodesSearched(this.binaryTreeDatabase, focusNode, key2));
		nodesSearched += " ";
		
		nodesSearched += String.valueOf(calculateInOrderNodesSearched(this.binaryTreeDatabase, focusNode, key3));
		
		return nodesSearched;
	}
	
	/*
	 * Calculates the amount of nodes searched for locating a given key using a preorder search.
	 * 
	 * @param binaryTreeDatabase BinaryTreeDB<String> object.
	 * @param focusNode Start or begining node of the binary tree.
	 * @param key Integer value corresponding with desired search value.
	 * 
	 * @return int Integer type corresponding to the number of nodes searched through.
	 */
	private int calculatePreorderNodesSearched(BinaryTreeDB<String> binaryTreeDatabase, Node focusNode, int key){
		
		int nodesSearched = calculatePreorderNodesSearched(binaryTreeDatabase, focusNode, key, true);
		
		return nodesSearched;
		
	}
	
	/*
	 * Helper recursive method used to calculates the amount of nodes searched 
	 * for locating a given key using a preorder search.
	 * 
	 * @param binaryTreeDatabase BinaryTreeDB<String> object.
	 * @param focusNode Start or begining node of the binary tree.
	 * @param key Integer value corresponding with desired search value.
	 * @param continueSearching Boolean value corresponding to whether the node has been located.
	 * 
	 * @return int Integer type corresponding to the number of nodes searched through.
	 */
	private int calculatePreorderNodesSearched(BinaryTreeDB<String> binaryTreeDatabase, Node focusNode, int key, boolean continueSearching){
		
		// Begin each recursion with zero nodes searched.
		int nodesSearched = 0;
		
		// Ignore the recursion loop if the node is already found, or if the node is non existant.
		if (!continueSearching){
			return 0;
		} else if (focusNode == null){
			return 0;
		} else {
			// Count the node.
			nodesSearched++;
		}
		
		// If the focus node has the desired key, increment the amount of nodesSearched, 
		// and skip all other recursions.
		if (focusNode.getKey() == key){
			
			continueSearching = false;
			return nodesSearched;
			
		}
		
		if (focusNode.leftChild != null){
			
			// Call the recursive method again, 
			// sending it the reference to continueSearching.
			nodesSearched += calculatePreorderNodesSearched(binaryTreeDatabase, 
															focusNode.leftChild, 
															key, 
															continueSearching);
		}
		
		if (focusNode.rightChild != null){
			
			// Call the recursive method again, 
			// sending it the reference to continueSearching.
			nodesSearched += calculatePreorderNodesSearched(binaryTreeDatabase, 
															focusNode.rightChild, 
															key, 
															continueSearching);
		}
		
		// Return the amount of nodes searched for each recursion.
		return nodesSearched;
			
	}
	
	/*
	 * Calculates the amount of nodes searched for locating a given key using an in order search.
	 * 
	 * @param binaryTreeDatabase BinaryTreeDB<String> object.
	 * @param focusNode Start or begining node of the binary tree.
	 * @param key Integer value corresponding with desired search value.
	 * 
	 * @return int Integer type corresponding to the number of nodes searched through.
	 */
	private int calculateInOrderNodesSearched(BinaryTreeDB<String> binaryTreeDatabase, Node focusNode, int key){
		
		// Call a recursive method, notifying it to continue searching initially (true)
		int nodesSearched = calculateInOrderNodesSearched(binaryTreeDatabase, 
														  focusNode, 
														  key, 
														  true);
		
		return nodesSearched;
	}
	
	/*
	 * Helper recursive method used to calculates the amount 
	 * of nodes searched for locating a given key using an in order search.
	 * 
	 * @param binaryTreeDatabase BinaryTreeDB<String> object.
	 * @param focusNode Start or begining node of the binary tree.
	 * @param key Integer value corresponding with desired search value.
	 * @param continueSearching Boolean value corresponding to whether the node has been located.
	 * 
	 * @return int Integer type corresponding to the number of nodes searched through.
	 */
	private int calculateInOrderNodesSearched(BinaryTreeDB<String> binaryTreeDatabase, Node focusNode, int key, boolean continueSearching){
		
		// Begin each recursion with zero nodes searched.
		int nodesSearched = 0;
		
		// Ignore the recursion loop if the node is already found, or if the node is non existant.
		if (!continueSearching){
			return 0;
		} else if (focusNode == null){
			return 0;
		} else {
			// Count the node.
			nodesSearched++;
		}
		
		if (focusNode.leftChild != null){
			
			// Call the recursive method again, 
			// sending it the reference to continueSearching.
			nodesSearched += calculateInOrderNodesSearched(binaryTreeDatabase, 
														   focusNode.leftChild, 
														   key, 
														   continueSearching);
		}
		
		// If the focus node has the desired key, increament the amount of nodesSearched,
		// and notify all other recursions to break.
		if (focusNode.getKey() == key){
			
			continueSearching = false;
			return nodesSearched;
			
		}
		
		if (focusNode.rightChild != null){
			
			// Call the recursive method again, 
			// sending it the reference to continueSearching.
			nodesSearched += calculateInOrderNodesSearched(binaryTreeDatabase, 
														   focusNode.rightChild, 
														   key, 
														   continueSearching);
		}
		
		// Return the amount of nodes searched for each recursion.
		return nodesSearched;
	}
	
	/*
	 * Calculates the amount of time (in milliseconds) needed to conduct a preorder 
	 * search on each of the three integer keys provided.
	 * 
	 * @param key1 Integer value corresponding to a key value.
	 * @param key2 Integer value corresponding to a key value.
	 * @param key3 Integer value corresponding to a key value.
	 * 
	 * @return duration String value corresponding to the time elapsed durring each of the searches respectively.
	 */
	public String calculatePreorderSearchDuration(int key1, int key2, int key3){
		
		String duration = "";
		
		Node focusNode = this.binaryTreeDatabase.getRootNode();
		
		duration += Long.toString(calculatePreorderSearchDuration(this.binaryTreeDatabase, 
																	focusNode, 
																	key1));
		duration += " ";
		
		duration += Long.toString(calculatePreorderSearchDuration(this.binaryTreeDatabase, 
																	focusNode, 
																	key2));
		duration += " ";
		
		duration += Long.toString(calculatePreorderSearchDuration(this.binaryTreeDatabase, 
																	focusNode, 
																	key3));
		
		return duration;
	}
	
	/*
	 * Calculates the amount of time (in nanoseconds) needed to conduct 
	 * an in order search on each of the three integer keys provided.
	 * 
	 * @param key1 Integer value corresponding to a key value.
	 * @param key2 Integer value corresponding to a key value.
	 * @param key3 Integer value corresponding to a key value.
	 * 
	 * @return duration String value corresponding to the time elapsed durring each of the searches respectively.
	 */
	public String calculateInOrderSearchDuration(int key1, int key2, int key3){
		
		String duration = "";
		
		Node focusNode = this.binaryTreeDatabase.getRootNode();
		
		duration += Long.toString(calculateInOrderSearchDuration(this.binaryTreeDatabase, 
																   focusNode, 
																   key1));
		// Nanoseconds
		duration += " ns";
		
		duration += Long.toString(calculateInOrderSearchDuration(this.binaryTreeDatabase, 
																   focusNode, 
																   key2));
		// Nanoseconds
		duration += " ns";
		
		duration += Long.toString(calculateInOrderSearchDuration(this.binaryTreeDatabase, 
																   focusNode, 
																   key3));
		
		return duration;
	}
	
	/*
	 * Calculates the amount of time (in nanoseconds) needed to conduct a preorder search on the integer key provided.
	 * 
	 * @param binaryTreeDatabase BinaryTreeDB<String> object.
	 * @param focusNode Start or begining node of the binary tree.
	 * @param key Integer value corresponding with desired search value.
	 * 
	 * @return long Long type corresponding to time taken to search the binaryTreeDatabase.
	 */
	@SuppressWarnings("unchecked")
	private long calculatePreorderSearchDuration(BinaryTreeDB<String> binaryTreeDatabase, Node focusNode, int key){
		
		long startTime = System.nanoTime();
		int temporary = calculatePreorderNodesSearched(binaryTreeDatabase, focusNode, key);
		long endTime = System.nanoTime();
		
		return (endTime - startTime);
	}
	
	/*
	 * Calculates the amount of time (in nanoseconds) needed to conduct an in order search on the key provided.
	 * 
	 * @param binaryTreeDatabase BinaryTreeDB<String> object.
	 * @param focusNode Start or begining node of the binary tree.
	 * @param key Integer value corresponding with desired search value.
	 * 
	 * @return long Long type corresponding to time taken to search the binaryTreeDatabase.
	 */
	private long calculateInOrderSearchDuration(BinaryTreeDB<String> binaryTreeDatabase, Node focusNode, int key){
		
		long startTime = System.nanoTime();
		int temporary = calculateInOrderNodesSearched(binaryTreeDatabase, focusNode, key);
		long endTime = System.nanoTime();
		
		return (endTime - startTime);
	}
	
	/*
	 * Gives a Big O representaiton string for three different sizes of binary trees.
	 * 
	 * @return bigO String data of the Big O relationship of the binary tree.
	 */
	public String calculateBigORelationship(){

		// Initialize string variable.
		String bigO = new String();
		
		// Create an instance of Random.
		Random randomGenerator = new Random();

		// Declair and initialize an array of sizes.
		int[] sizes = {100000, 200000, 400000};

		// For each of the different sizes, gather data on Big O.
		for (int i  = 0, i < sizes.length - 1, i++){
			
			// Create an BianryTreeDB object.
			BinaryTreeDB<String> binaryTree = new BinaryTreeDB<String>(sizes[i]);
			
			// Generate a random key to search for, within the bounds of the binaryTree.
			int key = randomGenerator.nextInt(sizes[i]);

			// Gather the current system time.
			long startTime = System.nanoTime();
			
			// Calculate the number of nodes searched to locate a given key.
			int nodesSearched = calculateNodeCountForBigO(key)
			
			// Calculate the duration.
			long endTime = System.nanoTime();
			long duration = endTime - startTime;

			// Append Big O with data on the new binaryTree size.
			bigO += String.format("\nFor a binary tree with %d elements,"
								  "and A randomly generated key value of %d,"
								  "the number of nodes searched through was %d,"
								  "and the time taken to complete the search was %d", 
								  sizes[i], key, nodesSearched, duration);
		}

		// Append Big O with explination of the Big O relationship.
		bigO += "\nThe big O notation for a binary tree of size n is O (log2 of n)\n";

		return bigO;
	}

	/*
	 * Calculate the number of number of nodes searched in the binary tree.
	 * "Halves" the binary tree until a node with the given key is found.
	 * Used in calculating the Big O relationship.
	 * 
	 * @param key Integer value corresponding to a key in the binary tree.
	 * 
	 * @returns nodeCount Integer value corresponding to the number of nodes searched to locate a given key.
	 */
	private int calculateNodeCountForBigO(int key) {
		
		// Focus node is the root.
		Node focusNode = binaryTreeDatabase.getRootNode();
		
		int nodeCount = 0;
		
		// Half the binary tree untill the key is found.
		while(focusNode.getKey() != key) {
			
			if (key == focusNode.getKey) {
				// Do not count this as a node searched.
				return nodeCount;
			}
			
			if (key < focusNode.getKey()) {
				focusNode = focusNode.leftChild;
			} else {
				focusNode = focusNode.rightChild;
			}
			
			// Checks for errors.
			if (focusNode == null){
				// The key you are searching for does not exist in the binary tree.
				return -1;
			}
			
			// Count the node as a node searched.
			nodeCount++
		}
		
		return nodeCount;	
	}

	
	/*
	 * Generates a non-duplicate random number list, given a minimumValue, maximumValue, and size.
	 * 
	 * @param minimumValue Integer value corresponding to the minimum possible random value generated.
	 * @param maximumValue Integer value corresponding to the maximum possible random value generated.
	 * 
	 * @return List<int> List type, shuffled to mimic non-duplicate random numbers.
	 */
	private List<Integer> createNonDuplicateRandomNumbers(int minimumValue, int maximumValue, int size){
		
		// Create an instance of ArrayList, with type int.
		ArrayList<Integer> nonDuplicateRandomNumbers = new ArrayList<Integer>();
		
		//Test for errors with provided data.  If there arent enough possible numbers, return null.
		if ((maximumValue - minimumValue) < size){
			
			//There has been an error.
			return null;
			
		}
		
		// For the range of numbers provided.
		// Creates an ArrayList of integers from minimumValue to maximumValue.
		for (int i = minimumValue; i <= maximumValue; i++){
			
			// Add that number to the ArrayList.
			nonDuplicateRandomNumbers.add(i);
		}
		
		// Shuffle the ArrayList, randomizing the numbers.
		Collections.shuffle(nonDuplicateRandomNumbers);
		
		// Return a immutable List object, created from the ArrayList, trimming off unnecessary values.
		return nonDuplicateRandomNumbers.subList(0, size - 1);
	}
	
	/*
	 * Assigns the BinaryTreeDB object.
	 * 
	 * @param binaryTreeDatabaseBinaryTreeDB<String> object.
	 */
	public void setBinaryTreeDatabase(BinaryTreeDB<String> binaryTreeDatabase){
		
		this.binaryTreeDatabase = binaryTreeDatabase;
	}
	
	/*
	 * Retrieves the BinaryTreeDB object.
	 * 
	 * @return BinaryTreeDB<String>
	 */
	public BinaryTreeDB<String> getBinaryTreeDatabase(){
		
		return this.binaryTreeDatabase;
	}
}