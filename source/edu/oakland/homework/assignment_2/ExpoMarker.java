package edu.oakland.homework.assignment_2;

//Imports packages
import edu.oakland.homework.assignment_2.*;

/**
* This class resembles that of a real world Expo marker.
* @author JoshuaHerkness
* @version version 1.0 150201.
* @since version 1.0
*/
public class ExpoMarker implements Marker{
    
    /**
    * String Color of a marker
    */ 
    String color = "Black";
    
    /**
    * amount of ink left in the Expo marker.  Begins with 100 ink.  Dies at 0 ink.
    */ 
    int amountLeft = 100;
    
    /**
    * Boolean value determaining if the marker is still usable.
    */ 
    boolean usable = true;
    
    /**
    * Boolean value determininng if the cap is on the Expo marker or not.
    */ 
    boolean capOn = true;
    
    /**
    * Decreases the amount of ink left in the Expo marker by a given decrement.
    * @param decrement Amount of marker to be taken away from total
    */
    public void decrementAmountLeft(int decrement){
        amountLeft = amountLeft - decrement;
        
        //Renders the Expo marker useless if it has less than 0 ink left
        if (amountLeft <= 0){
            killMarker();
        }
    }
    
    /**
    * Renders the Expo marker un-usable
    */
    public void killMarker(){
        usable = false;
    }
    
    /**
    * Removes the cap, setting capOn to false
    */
    public void removeCap(){
        capOn = false;
    }
    
    /**
    * Adds the cap, setting capOn to true
    */
    public void addCap(){
        capOn = true;
    }
    
    /**
    * Uses the Expo marker, removing a given amount of ink from the Expo marker
    * @param amountUsed Amount of ink the marker uses
    */
    public void useMarker(int amountUsed){
        //Remove the cap, if one is on
        if (capOn){
            removeCap();
        }
        
        decrementAmountLeft(amountUsed);
        
        //Remember to add the cap once your finnished using the Expo marker
        addCap();
    }
}