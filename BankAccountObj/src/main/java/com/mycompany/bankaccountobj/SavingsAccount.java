package com.mycompany.bankaccountobj;
public  class SavingsAccount extends BankAccount
{
  
    
 private static  final double SAVINGS_INTEREST_RATE=0.12;

   @Override
   public  void calculateInterest()
   {
      double interest= getBalance()*SAVINGS_INTEREST_RATE;
       System.out.println("The innterest for the savings account is Rs."+interest);
   }
}
