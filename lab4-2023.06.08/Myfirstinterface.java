
package com.mycompan.practical5;

public interface Myfirstinterface 
{
   int x=5;
   //public static final int x=5;
   //when declaring a variable in an interface,it is  by default public static final.
   //so whether you explicitly mention these keywords or not,the variable is treated as public static final.
   //There is no difference between the two approaches.
   
   
  
  void display();
  //abstract void display();
  //when declaring a method in an interface,it is by default public abstract.
  //so whether you explicitly mention the abstract keyword or not,the method is treated as public abstract.
//  //There is no difference between the two approaches.
}
