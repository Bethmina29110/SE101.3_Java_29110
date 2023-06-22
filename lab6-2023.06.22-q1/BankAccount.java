
package com.mycompan.labquestion1;


public abstract class BankAccount 
{
  private String accountNo;
  private double balance;
  
  public abstract void calculateInterest();

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
  
}
