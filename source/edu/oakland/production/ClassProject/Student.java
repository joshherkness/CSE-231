package edu.oakland.production.ClassProject.Middleware;

/*
 * Student framework class representing a single student.  Should be accesible throughout the project.
 * 
 * @author Joshua Herkness, Trevor Luebbert Middleware
 * @version version 1.2
 * @since version 1.0
 */
public class Student{
	
	/// Grizzly ID integer value
	int grizzlyID;
	
	/// Name string value
	String name;
	
	/// Major string value
	String major;
	
	/// GPA double value
	double gpa;
	
	/// Thesis Grade double value
	double thesisGrade;
	
	/*
	 * Default constructor for a student object.  Requires a number of parameters, including Grizzly ID, Name, Major, GPA, And Thesis Grade.
	 * 
	 * @param grizzlyID Integer value
	 * @param name String name of user
	 * @param major String major of user
	 * @param gpa Double GPA of user
	 * @param thesisGrade Double thesis grade of user
	 * 
	 * @returns Student Representing a student.
	 */
	public Student(int grizzlyID, String name, String major, double gpa, double thesisGrade) {
		
		//Set all instance variables
		this.grizzlyID = grizzlyID;
		this.name = name;
		this.major = major;
		this.gpa = gpa;
		this.thesisGrade = thesisGrade;
		
	}
	
	/*
	 * Retrieves the students Grizzly ID.
	 * 
	 * @returns grizzlyID Integer value coresponding to the students Grizzly ID.
	 */
	public int getGrizzlyID(){
		return this.grizzlyID;
	}
	
	/*
	 * Retrieves the students name.
	 * 
	 * @returns name String value coresponding to the students name.
	 */
	public String getName(){
		return this.name;
	}
	
	/*
	 * Retrieves the students major.
	 * 
	 * @returns major String value coresponding to the students major.
	 */
	public String getMajor(){
		return this.major;
	}
	
	/*
	 * Retrieves the students GPA (Grade Point Average).
	 * 
	 * @returns gpa Double value coresponding to the students GPA.
	 */
	public double getGPA(){
		return this.gpa;
	}
	
	/*
	 * Retrieves the students thesis grade.
	 * 
	 * @returns thesisGrade Double value coresponding to the students thesis grade.
	 */
	public double getThesisGrade(){
		return this.thesisGrade;
	}
	
	/*
	 * Modifies the students Grizzly ID.
	 * 
	 * @param grizzlyID Integer value coresponding to the students [new] Grizzly ID.
	 */
	public void setGrizzlyID(int grizzlyID){
		this.grizzlyID = grizzlyID;
	}
	
	/*
	 * Modifies the students name.
	 * 
	 * @param name String value coresponding to the students [new] name.
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/*
	 * Modifies the students major.
	 * 
	 * @param major String value coresponding to the students [new] major.
	 */
	public void setMajor(String major){
		this.major = major;
	}
	
	/*
	 * Modifies the students GPA (Grade Point Average).
	 * 
	 * @param gpa Double value coresponding to the sudentes [new] GPA. 
	 */
	public void setGPA(double gpa){
		this.gpa = gpa;
	}
	
	/*
	 * Modifies the students thesis grade.
	 * 
	 * @param thesisGrade Double value coresponding to the students [new] thesis grade.
	 */
	public void setThesisGrade(double thesisGrade){
		this.thesisGrade = thesisGrade;
	}
}