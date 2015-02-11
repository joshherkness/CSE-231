package edu.oakland.homework.assignment_2;

/**
* Pawn Class, like from chess, ya know?
* @author JoshuaHerkness
* @version version 1.0 150201.
* @since version 1.0
*/
public class Pawn{
    
    /**
    * String value of the color of the pawn, default being white
    */
    String color = "white";
    
    /**
    * Constructor for Pawn class
    * @param color Sring value of the color of the pawn
    */
    public Pawn(String color){
        this.color = color;
    }
    
    /**
    * Retrieves the color of a pawn
    * @return color String color of pawn
    */
    public String getColor(){
        return color;
    }
}