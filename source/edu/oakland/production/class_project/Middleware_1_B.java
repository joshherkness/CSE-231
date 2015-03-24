package edu.oakland.production.ClassProject.Middleware;

//Import java util framework
import java.util.*;

//Import BinaryTree.java
import edu.oakland.production.ClassProject.Middlewar.*;


/*
 * Middleware Part 1B.  Purpose is to experiment with BinaryTrees'.
 * 
 * @author Joshua Herkness, Trevor Luebbert Middleware
 * @version version 1.0
 * @since version 1.0
 */
public class Middleware {
	
	/// Minimum possible key value, used with generating a random key.
	int minimumKeyValue = 400000;
	/// Maximum possible key value, used with generating a random key.
	int maximumKeyValue = 800000;
	
	/// Minimum possible name value, used with generating a random name.
	int minimumNameValue = 200000;
	/// Maximum possible key value, used with generating a random name.
	int maximumNameValue = 600000;
	
	/*
	 * Default constructor for the Middleware Class.
	 * 
	 * @returns Middleware
	 */
	public Middleware(){
		//Any cunstruction goes here.
	}
	
	/*
	 * Creates a BinaryTree object with a given size, populating the key and 
	 * name of each node with a non-duplicate random number.
	 * 
	 * @param size Integer value corresponding to the size of the binary tree.
	 * 
	 * @returns BinaryTree
	 */
	public BinaryTree createBinaryTree(int size){
		
		// Create in instance of a BinaryTree.
		BinaryTree binaryTree = new BinaryTree();
		
		// Create a non-duplicate random number list for keys.
		List<int> nonDuplicateRandomNumberKeys = new List<int>();
		// Create a non-duplicate random number list for names.
		List<int> nonDuplicateRandomNumberNames = new List<int>();
		
		// Populate both key and name lists.
		nonDuplicateRandomNumberKeys = nonDuplicateRandomNumbers(minimumKeyValue, maximumKeyValue, size);
		nonDuplicateRandomNumberNames = nonDuplicateRandomNumbers(minimumNameValue, maximumNameValue, size);
		
		for (int i = 0; i < size; i++){
			
			// Reference key integer from a given index.
			int key = nonDuplicateRandomNumberKeys.get(i);
			// Reference name integer from a given index, then convert to a string.
			String name = Integer.toString(nonDuplicateRandomNumberNames.get(i));
			
			// Add a node to the BinaryTree, given the key and name.
			binaryTree.addNode(key, name);	
			
		}
		
		return binaryTree;
	}
	
	/*
	 * Generates a non-duplicate random number list, given a minimumValue, maximumValue, and size.
	 * 
	 * @param minimumValue Integer value corresponding to the minimum possible random value generated.
	 * @param maximumValue Integer value corresponding to the maximum possible random value generated.
	 * 
	 * @returns List<int> List type, shuffled to mimic non-duplicate random numbers.
	 */
	private List<int> createNonDuplicateRandomNumbers(int minimumValue, int maximumValue, int size){
		
		// Create an instance of ArrayList, with type int.
		ArrayList<int> nonDuplicateRandomNumbers = new ArrayList<int>();
		
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
}