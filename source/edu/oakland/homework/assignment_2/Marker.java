package edu.oakland.homework.assignment_2;

/**
* This class is the interface that resembles a real world marker.
* @author JoshuaHerkness
* @version version 1.0 150201.
* @since version 1.0
*/
interface Marker{
 
    /**
    * Decreases the amount of ink left in the marker by a given decrement.
    * @param decrement Amount of ink to be taken away from total
    */
    void decrementAmountLeft(int decrement);
    
    /**
    * Renders the marker un-usable
    */
    void killMarker();
    
    /**
    * Removes the cap, setting capOn to false
    */
    void removeCap();
    
    /**
    * Adds the cap, setting capOn to true
    */
    void addCap();
    
    /**
    * Uses the marker, removing a given amount of ink from the Expo marker
    * @param amountUsed Amount of ink to be used
    */
    void useMarker(int amountUsed);
}