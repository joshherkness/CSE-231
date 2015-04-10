// Make sure to have a Student type
BinaryTreeDB<Student> tree = new BinaryTree<Student>();

//student.getTG() has to be an integer here
tree.addNode(student1.getTG(),student1);	 	  
tree.addNode(student2.getTG(),student2);	 	
tree.addNode(student3.getTG(),student3);	 	 
tree.addNode(student4.getTG(),student4);	 	 
tree.addNode(student5.getTG(),student5);	 	
tree.addNode(student6.getTG(),student6);	 	 
tree.addNode(student7.getTG(),student7);	 	 
tree.addNode(student8.getTG(),student8);	 	 
tree.addNode(student9.getTG(),student9);	 	 
tree.addNode(student10.getTG(),student10);

// Yes, in concept this will work.  
// Make sure you know what the Traverse prints.  
// You may have to modify it slightly to print "key + name(which is a student object).getName()"
tree.preorderTraverseTree(tree.getRootNode());

// Assuming getLess() returns a ArrayList of nodes.
ArrayList<Node> ltNodes = tree.getLess(90,3.60);

// Ok, we create a ArrayList of students (Blank)
ArrayList<Student> ltStuds = new ArrayList<Student>();


for(int i = 0; i < ltNodes.size(); i++) {
	
	// Not sure if you have to cast into a Student, since it returns as a Student anyways.
	ltStuds.add((Student)ltNodes.get(i).getValue());
}

// Ok
return ltStuds