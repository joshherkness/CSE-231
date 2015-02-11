package edu.oakland.homework.assignment_2;

/**
* framework for standard playing card.  Consists of a Suite and Rank.
* @author JoshuaHerkness
* @version version 1.0 150201.
* @since version 1.0
*/
public class PlayingCard{
    /**
    * String variable of the playing cards suite. i.e. Heart, Spade, Club, Diamond
    */
    String suite;
    
    /**
    * String variable of the playing cards rank. i.e. Ace, Two, Three, Four, ...
    */
    String rank;
    
    /**
    * Constructor for an instance of PlayingCard
    * @param suite String value of playing cards suite
    * @param rank String value of playing cards rank
    */
    public PlayingCard(String suite, String rank){
        this.suite = suite;
        this.rank = rank;
    }
    
    /**
    * Retrieves the suite os a playing card
    * @return String Coresponding to the suite of the card
    */
    public String getSuite(){
        return suite;
    }
    
    /**
    * Retrieves the rank os a playing card
    * @return String Coresponding to the rank of the card
    */
    public String getRank(){
        return rank;
    }
}