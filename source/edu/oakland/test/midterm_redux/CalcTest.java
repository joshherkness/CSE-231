package edu.oakland.test.midterm_redux;

//Import Display and Database
import edu.oakland.helper.midterm_redux.*;

//Import Middleware
import edu.oakland.production.midterm_redux.*;
	
//Import junit framework
import junit.framework.*;

/*
 * CalcTest Junit test class
 * 
 * @author Joshua Herkness
 * @version version 1.0
 * @since version 1.0
 */
public class CalcTest extends TestCase {
	
	/*
	 * Middleware instance
	 */
	Middleware middleware;
	
	/*
	 * database instance
	 */
	Database database;
	
	/*
	 * Display instance
	 */
	Display display;
	
	/*
	 * Desired student for average grade.
	 */
	int student;
	
	/*
	 * Called before all test methods.
	 */
	public void setUp(){
		
		database = new Database();
		middleware = new Middleware(database);
		display = new Display(middleware);
		
		student = 1;
	}
	
	/*
	 * Tests whether or not the system can correctly calculate the grade average.
	 */
	public void test(){
		
		//Human calculated grade average for student 1
		//3 + 14.4 + 17.5 + 23 + 14 = 71.9 = (int)71
		int humanCalculatedAverage = 71;
		
		//Check if the middleware grade average is correct.
		assertEquals(humanCalculatedAverage, middleware.getGradeAverageForStudent(student));
	}
}