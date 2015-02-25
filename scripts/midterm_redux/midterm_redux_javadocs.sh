#!/bin/bash

#Creates javaDocs for the midterm redux souce code files.
javadoc -d /cse231/source/edu/oakland/javadoc_api/midterm_redux -private \
	/cse231/source/edu/oakland/helper/midterm_redux/Database.java \
	/cse231/source/edu/oakland/helper/midterm_redux/Display.java \
	/cse231/source/edu/oakland/production/midterm_redux/Middleware.java \
	/cse231/source/edu/oakland/test/midterm_redux/CalcTest.java