package edu.oakland.production;

//Import java util framework
import java.util.*;

//Import package containing Student.java
import edu.oakland.production.*;

/*
 * Middleware class for CSE231 class project.  Requires import of User class.
 * 
 * @author Joshua Herkness, Trevor Luebbert Middleware
 * @version version 1.1
 * @since version 1.0
 */
public class Middleware {
	
	/*
	 * Temporary stack of students to later be sent to the database.
	 */
	private Stack students = new Stack();
	
	/*
	 * Default constructor for the Middleware Class.
	 * 
	 * @returns Middleware
	 */
	public Middleware(){
		//Any cunstruction goes here.
	}	
	
	/*
	 * Adds a student to the temporary private stack within midleware, called students.  Does *NOT* add a student to the database.
	 * 
	 * @param grizzlyID Integer value
	 * @param name String name of user
	 * @param major String major of user
	 * @param gpa Double GPA of user
	 * @param thesisGrade Double thesis grade of user
	 */
	public void createStudent(int grizzlyID, String name, String major, double gpa, double thesisGrade){
		
		// Create a student object.
		Student student = new Student(grizzlyID, name, major, gpa, thesisGrade);
		// Add the student to the private students stack.
		students.push(student);
	}
		
}