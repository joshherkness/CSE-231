package edu.oakland.homework.assignment_1;

//Imports packages
package edu.oakland.homework.assignment_1.*;

public class HelloWorld{
    
    public static void main(String []args){
        
        System.out.println("Hello World!");
        System.out.println("Hello Universe!");
        
        CmdLinePrinter cLPrinter = new CmdLinePrinter();
        cLPrinter.printOnCommand();
        
        SonOfClp sonOfClp = new SonOfClp();
        sonOfClp.useObjectServices();
    }
    
    public void providePrintServices(){
        
        System.out.println("I was called by another class");
    }
}