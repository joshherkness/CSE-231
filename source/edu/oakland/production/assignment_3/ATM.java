package edu.oakland.production.assignment_3;

//Import all of the helper classes for this assignment.
import edu.oakland.helper.assignment_3.*;
    
/*
 * ATM object representing an instance of a phsical ATM that a Customer can interract with.
 * 
 * @author Joshua Herkness
 * @version version 1.0 150702
 * @since version 1.0
 */
public class ATM {
    
    /*
     * BankDatabase object representing the database that the ATM uses.
     */
    BankDataBase bankDataBase;
    
    /*
     * Amount to be withdrawn fom the ATM.  
     * Used because ATM must remember the withdraw amount.
     * Make sure you start with `0` every instance of ATM.
     */
    double withdrawAmount = 0;
    
    /*
     * Constructor for ATM (Overloaded).
     * 
     * @param bankDataBase Object representing the database of the ATM.
     */
    public ATM(BankDataBase bankDataBase){
        this.bankDataBase = bankDataBase;
    }
    
    /*
     * Constructorf or ATM (Overloaded).  Creates a default bank database with an account balance of '0'
     */
    public ATM(){
        
        // Uses default bank databse constructor.  Resulting in an account balance of '0'.
        this.bankDataBase = new BankDataBase();
    }
    
    /*
     * Receives the withdraw amount.  Acts as a setter for the withdraw amount.
     * 
     * @param withdrawAmount Amount to be withdrawn from the ATM.
     */
    public void receiveWithdrawAmount(int withdrawAmount){
        this.withdrawAmount = (double)withdrawAmount;
    }
	
	/*
     * Makes sure you have sfficient funds in the bank database to extract from.
     * 
     * @return Boolean Sufficient funds.
     */
    public boolean checkSufficientFunds(double withdrawAmount){
        return (withdrawAmount <= bankDataBase.getAccountBalance());
    }
    
    /*
     * Retreives the withdraw amount and stores it as an instance variable withdrawAmount.
     * 
     * @return withdrawAmount Amount to be withdrawn from the ATM.
     */
    public double getWithdrawAmount(){
        return withdrawAmount;
    }
    
    /*
     * Kitchy little temp method for prompting the customer for a withdraw amount.
     */
    public void displayRequestForWithdrawAmount(){
        System.out.println("How much would you like to withdraw?");
        //...
    }
    
    /*
     * Provides the customer with the amount of money requested, 
     * at the same time removes that amount from the account balance in bank database.
     */
    private void provideMoney(double withdrawAmount){
        bankDataBase.withdrawMoney(withdrawAmount);
        System.out.println("Here's your money, all " + withdrawAmount + " of it");
        //...
    }
    
    /*
     * Kitchy little temp method for prompting the customer for further transaction request.
     */
    public void displayFurtherTransacionRequest(){
        System.out.println("Would you like to complete any further transactions?");
        //...
    }
    
    /*
     * Kitchy little temp method for delivering ATM card to customer.
     */
    public void deliverATMCard(){
        System.out.println("Heres your ATM card!");
        //...
    }
	
	/*
     * Kitchy little temp method for notifying the customer of their insufficient funds.
     */
    public void notifyInsufficientFunds(){
        System.out.println("Oh no!  You dont seem to have enough money in your account!");
        //...
	}
	
	
}