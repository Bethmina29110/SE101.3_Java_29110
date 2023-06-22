
package com.mycompan.labquestion1;

public class CheckingAccount extends BankAccount 
{
   private static final double interest_rate=0.02 ;
   @Override
   public void calculateInterest()
   {
      double interest=getBalance()*interest_rate;
       System.out.println("The interest for the checking account "+interest );
   }
}
