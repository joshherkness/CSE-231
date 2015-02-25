package edu.oakland.helper.midterm_redux;

//Import middleware
import edu.oakland.production.midterm_redux.*;

/*
 * Display Class
 * 
 * @author Joshua Herkness
 * @version version 1.0
 * @since version 1.0
 */
public class Display {
	
	Middleware middleware;
	
	/*
	 * Default Display constructior
	 * 
	 * @param middleware Middleware reference
	 */
	public Display(Middleware middleware){
		this.middleware = middleware;
	}
	
	/*
	 * Displays A given students average grade in the class.
	 */
	public void displayGradeAverage(int student){
		
		int average = middleware.getGradeAverageForStudent(student);
		System.out.println("The average grade for student " + student + " is " + average);
	}
	
}