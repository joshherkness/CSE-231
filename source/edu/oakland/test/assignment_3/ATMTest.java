package edu.oakland.test.assignment_3;

//Import all of the helper classes for this assignment.
import edu.oakland.helper.assignment_3.*;

//Import all the production classes for this assignment.
import edu.oakland.production.assignment_3.*;

//Import junit framework
import junit.framework.*;

/*
 * @author Joshua Herkness
 * @version version 1.0 150702
 * @since version 1.0
 */
public class ATMTest extends TestCase {
    
    /*
     * Amount to be withdrawn from ATM.
     */
    int withdrawRequest;
    
    /*
     * Funds within the bank database.
     */
    int customerAccountBalance;
    
    /*
     * Instance of a bank database.
     */
    BankDataBase bankDataBase;
    
    /*
     * Instance of an ATM.
     */
    ATM atm;
    
    /*
     * Sets up the test.  Will be called before each test.
     */
    public void setUp(){
        
        //Initiallize withdraw request.
        withdrawRequest = 400;
        
        //Initiallize customer account balance.
        customerAccountBalance = 500;
        
        //Create a bank database instance, and pass it the customers account balance.
        bankDataBase = new BankDataBase(customerAccountBalance);
        
        //Create an ATM instance, and pass it the bank database.
        atm = new ATM(bankDataBase);
        
        //Simulate Customer selecting withdraw amountof (xxx).
        atm.receiveWithdrawAmount(withdrawRequest);
    }
    
    /*
     * Tests if bank database has sufficient funds for withdraw.
     */ 
    public void testATM(){
        
        boolean sufficientFunds;
        
        sufficientFunds = atm.checkSufficientFunds(atm.getWithdrawAmount());
        
        assertTrue(sufficientFunds);
    }
    
}