package edu.oakland.homework.assignment_2;

import edu.oakland.homework.assignment_2.*;

/**
* Instance class relating to a real world deck of playing cards
* @author JoshuaHerkness
* @version version 1.0 150201.
* @since version 1.0
*/
public class PlayingCardDeck{
    
    /**
    * Integer value, corespondsto the amount of 
    * playing cards in a standard deck of cards
    */
    int cardsInDeck = 52;
    
    /**
    * String array of possible (standard) suites of playing cards
    */
    String[] suites = {"Hearts", "Clubs", "Spades", "Diamonds"};
    
    /**
    * String array of possible (standard) ranks of playing cards
    */
    String[] ranks = {"Ace", "Two", "Three", "Four", 
                      "Five", "Six", "Seven", "Eight", 
                      "Nine", "Ten", "Jack", "Queen", "King"};
    
    /**
    * PlayingCard Array of final (non-shuffled) cards withing a standard deck of cards
    */
    PlayingCard[] cards = new PlayingCard[cardsInDeck];

    /**
    * Constructor for a standar deck of playing cards
    */
    public PlayingCardDeck(){
        
        //Keeps track of current card index in array of cards
        int currentCard = 0;
        
        /*Adds one of each type of rank, in each type of 
        suite to the deck of cards in a logical manner
        */
        for(int s = 0; s < suites.length; s++){
            for(int r = 0; r < ranks.length; r++){
                //Adds each card to te deck
                cards[currentCard] = new PlayingCard(suites[s], ranks[r]);
                
                //Remember to increment the current card after its placed in the deck
                currentCard += 1;
            }
        }
    }
    
    /**
    * Prints the value of the suite and rank for each card in the deck
    */
    public void printCards(){
        for(int i = 0; i < cards.length; i++){
            System.out.println(cards[i].getSuite() + "," + cards[i].getRank());
        }
    }
    
}