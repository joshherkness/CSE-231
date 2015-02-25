#!/bin/bash

#Compile midterm redux files.  Include JUnit files
javac -d /cse231/bin -classpath $CLASSPATH:/cse231/bin -sourcepath /cse231/source \
	/cse231/source/edu/oakland/helper/midterm_redux/Database.java \
	/cse231/source/edu/oakland/helper/midterm_redux/Display.java \
	/cse231/source/edu/oakland/production/midterm_redux/Middleware.java \
	/cse231/source/edu/oakland/test/midterm_redux/CalcTest.java
	
#Execute midterm redux files.  Run JUnit swing UI.
java -classpath $CLASSPATH:/cse231/bin \
	junit.swingui.TestRunner \
	edu.oakland.test.midterm_redux.CalcTest