package edu.oakland.homework.assignment_2;

/**
* Fixed SomethingIsWrong
* @author JoshuaHerkness
* @version version 1.0 150201.
* @since version 1.0
*/
public class SomethingIsRight {
    
    /**
    * Main Method
    * @param args String array
    */
    public static void main(String[] args) {
        
        //SomethingIsWong never created an actual instance of Ractangle
        Rectangle myRect = new Rectangle();
        
        myRect.width = 40;
        myRect.height = 50;
        
        System.out.println("myRect's area is " + myRect.area());
    }
}