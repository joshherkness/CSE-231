package edu.oakland.helper.assignment_3;

//Import all the production classes for this assignment.
import edu.oakland.production.assignment_3.*;

/*
 * Bank database object, in this case, representing a customers bank account.
 * 
 * @author Joshua Herkness
 * @version version 1.0 150702
 * @since version 1.0
 */
public class BankDataBase {
    
    /*
     * Double value representing amount of money in a given user account in the database.
     */
    double accountBalance;
    
    /*
     * Constructor for a bank database (Overloaded)
     * 
     * @param accountBalance Amount of money in an account.  Type double.
     * @return BankDataBase Representing a bank database of a given account.
     */
    public BankDataBase(double accountBalance){
        this.accountBalance = (double)accountBalance;
    }
    
    /*
     * Constructor for a bank database (Overloaded)
     * 
     * @param accountBalance Amount of money in an account.  Type int.
     * @return BankDataBase Representing a bank database of a given account.
     */
    public BankDataBase(int accountBalance){
        this.accountBalance = (double)accountBalance;
    }
    
    /*
     * Constructor for a bank database (Overloaded)
     * 
     * @param accountBalance Amount of money in an account.  Type float.
     * @return BankDataBase Representing a bank database of a given account.
     */
    public BankDataBase(float accountBalance){
        this.accountBalance = (double)accountBalance;
    }
    
    /*
     * Constructor for bank databse. (Default) Contains an account balance of '0'.
     */
    public BankDataBase(){
        this.accountBalance = 0.0;
    }
    
    /*
     * Sets the account balance of the bank database to a given amount.
     * 
     * @param accountBalance Amount of money in the account.
     */
    public void setAccountBalance(int accountBalance){
        this.accountBalance = (double)accountBalance;
    }
	
	/*
	* Retreives the account balance of the bank database
	* 
	* @returns accountBalance Amount of funds currently in the account.
	*/
  	public double getAccountBalance(){
	  return accountBalance;
	}
    
    /*
     * Removes a given amount of money from the bank database.  
     * Already assumes that the bank database has sufficient funds.
     * 
     * @param withdrawAmount Amount of money that was withdrawn.
     */
    public void withdrawMoney(double withdrawAmount){
        accountBalance -= withdrawAmount;
    }
    
}