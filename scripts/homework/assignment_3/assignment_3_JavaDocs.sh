#!/bin/bash

#Creates javaDocs for assignment 3 souce code files.
javadoc -d /cse231/source/edu/oakland/javadoc_api/assignment_3 -private \
    /cse231/source/edu/oakland/helper/assignment_3/BankDataBase.java \
    /cse231/source/edu/oakland/production/assignment_3/ATM.java \
    /cse231/source/edu/oakland/test/assignment_3/ATMTest.java