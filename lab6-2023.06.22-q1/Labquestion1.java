

package com.mycompan.labquestion1;


public class Labquestion1 {

    public static void main(String[] args)
    {
       SavingAccount s1=new SavingAccount();
       s1.setBalance(1000000);
       s1.calculateInterest();
       
       
       CheckingAccount s2=new CheckingAccount();
       s2.setBalance(20000000);
       s2.calculateInterest();
    }
}
