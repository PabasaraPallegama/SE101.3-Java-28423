package com.mycompany.bankaccountobj;
public class BankAccountObj
{

    public static void main(String[] args)
    {
       SavingsAccount savingsAccount=new SavingsAccount();
       savingsAccount.setBalance(20000000);
       savingsAccount.calculateInterest();
       
       CheckingAccount checkingAccount= new CheckingAccount();
       checkingAccount.setBalance(1000000);
       checkingAccount.calculateInterest();
       
    }
}
