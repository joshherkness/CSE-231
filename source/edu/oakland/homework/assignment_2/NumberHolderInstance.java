package edu.oakland.homework.assignment_2;

/**
* Simple Class meant to test PlayingCardDeck and PlayingCard
* @author JoshuaHerkness
* @version version 1.0 150201.
* @since version 1.0
*/
public class NumberHolderInstance{
    
    /**
    * Main Method
    * @param args String array
    */
    public static void main(String[] args){
        
        //Create an instance of NumberHolder (Assumed to be imported already) 
        NumberHolder numberHolder = new NumberHolder();
        
        //Initialize each member variables in the class
        numberHolder.anInt = 1000;
        numberHolder.aFloat = 3.1415;
        
        //Prints the member variables
        System.out.println(numberHolder.anInt);
        System.out.println(numberHolder.aFloat);
    }
}