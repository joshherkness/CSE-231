package edu.oakland.homework.assignment_2;

import junit.framework.*;
import edu.oakland.homework.assignment_2.*;

/**
* Pawn Test Class, to test a pawn
* @author JoshuaHerkness
* @version version 1.0 150201.
* @since version 1.0
*/
public class PawnTest extends TestCase{
    
    /**
    * Test Method
    */
    public void testCreate(){
        
        //Constants for the colors
        final String White = "white";
        final String Black = "black";
        
        Pawn pawn = new Pawn(White);
        Pawn pawn2 = new Pawn(Black);
        
        //Asks for the pawns color
        String pawnColor = pawn.getColor();
        String pawnColor2 = pawn2.getColor();
        
        //Test if pawn is white
        assertEquals(pawnColor, White);
        
        //Test if pawn2 is black
        assertEquals(pawnColor2, Black);
    }
}