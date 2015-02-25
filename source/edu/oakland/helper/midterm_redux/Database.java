package edu.oakland.helper.midterm_redux;

//Import arrays
import java.util.Arrays.*;

/*
 * Class representing a database of student grades.  Grades are indexed by students 0 to 40.
 * 
 * @author Joshua Herkness
 * @version version 1.0
 * @since version 1.0
 */
public class Database {
	
	int[] homeworkAverage = new int[]{60,20,40,38,40,28,49,60,90,100,
										90,20,0,0,67,58,94,89,49,79,
										90,94,97,62,29,60,48,79,27,70,
										74,83,70,40,76,92,81,95,86,100};
	
	int[] midtermExam = new int[]{83,96,72,96,62,2,96,90,31,61,
									20,60,53,74,67,87,25,100,91,100,
									23,67,89,58,43,71,89,100,10,100,
									95,97,99,99,62,10,100,85,56,95};
	
	int[] finalExam = new int[]{93,70,56,76,96,72,45,99,90,47,
								  100,83,67,87,26,98,74,65,25,10,
								  1,10,23,61,5,67,98,72,97,62,
								  28,87,98,86,87,86,73,89,9,87};
	
	int[] projectGrade = new int[]{84,92,96,85,52,23,74,45,72,56,
									 62,86,98,62,96,82,100,99,71,82,
									 20,60,72,56,78,61,70,67,87,62,
									 65,89,72,96,98,25,71,70,75,100};
	
	int[] classParticipation = new int[]{92,70,62,70,84,91,12,62,56,62,
										   78,96,90,99,100,20,62,86,75,100,
										   100,65,24,54,81,80,87,87,63,100,
										   100,96,69,72,86,100,99,88,77,100};
	
	/*
	 * Default Databse constructor.  Lets just initialize a temp database.
	 */
	public Database(){
		
	}
	
	/*
	 * Retreives the grades for a given student.
	 * 
	 * @param student Index of the student.  0 to 40.
	 * @return grades Array of students grades.
	 */
	public int[] getGradesForStudent(int student){
		
		int[] grades = new int[5];
		
		//Populate an array with the students grades.
		grades[0] = homeworkAverage[student];
		grades[1] = midtermExam[student];
		grades[2] = finalExam[student];
		grades[3] = projectGrade[student];
		grades[4] = classParticipation[student];
		
		return grades;
	}
}