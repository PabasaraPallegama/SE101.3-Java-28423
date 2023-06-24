
package com.mycompany.bankaccountobj;
public abstract class BankAccount 
{
    //declaring data
    private String accountNumber;
    private double balance;
 
    
    //setter mmethod to accountNumber
    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber=accountNumber;
    }
    //getter method to accountNumber
    public String getAccountNumber()
    {
        return accountNumber;
    }
    //setter method to balance
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    //getter method to balance
    public double getBalance()
    {
        return balance;
    }
    //create an abstract method called calculateInterest
    public abstract void calculateInterest();
    
        
    
}
