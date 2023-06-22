
package com.mycompan.labquestion1;


public class SavingAccount extends BankAccount
{
 private static final double interest_rate=0.12;
 
 @Override
 public void calculateInterest()
 {
    double interest=getBalance()*interest_rate;
     System.out.println("The interest for the saving account "+interest);
 }
}
