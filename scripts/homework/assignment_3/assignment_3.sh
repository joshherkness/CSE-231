#!/bin/bash

#Compiles all necessary source code for assignment 3
javac -d /cse231/bin -sourcepath /cse231/source /cse231/source/edu/oakland/helper/assignment_3/BankDataBase.java \
    /cse231/source/edu/oakland/production/assignment_3/ATM.java \
    /cse231/source/edu/oakland/test/assignment_3/ATMTest.java
    
#Executes the ATMTest using JUnit swingui  
java -classpath $CLASSPATH:/cse231/bin \
    junit.swingui.TestRunner \
    edu.oakland.test.assignment_3.ATMTest