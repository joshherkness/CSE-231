package edu.oakland.production.midterm_redux;

//Import arrays
import java.util.Arrays.*;

//Import Database
import edu.oakland.helper.midterm_redux.*;

/*
 * Middlsware class representing the bridge between the display and the databse
 * 
 * @author Joshua Herkness
 * @version version 1.0
 * @since version 1.0
 */
public class Middleware {
	
	/*
	 * Database instance representing the database of student grades.
	 */
	Database database;
	
	/*
	 * Middleware constructor
	 * 
	 * @param database Database object representing the student database
	 */
	public Middleware(Database database){
		this.database = database;
	}
	
	/*
	 * Calculates the average grade for a specific student
	 * 
	 * @param student Index specifying a specific student.  0 to 40.
	 * @return averageGrade Grade average for the specific student.
	 */
	public int getGradeAverageForStudent(int student){
		
		int averageGrade;
		
		//Retrieve the grades for a particular student.
		int[] grades = database.getGradesForStudent(student);
		
		//Calculate the average grade.
		averageGrade = (int)(grades[0]*0.15 + grades[1]*0.15 + 
			grades[2]*0.25 + grades[3]*0.25 + grades[4]*0.20);
		
		return averageGrade;
	}
}