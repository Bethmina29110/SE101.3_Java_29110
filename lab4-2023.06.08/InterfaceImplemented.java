
package com.mycompan.practical5;

public class InterfaceImplemented implements Myfirstinterface 
{
    @Override
    public void display()
    {
        System.out.println("The value of x is "+x);
      //In the InterfaceImplemented class,you cannot change the value of x because it is declared as final in the interface
      //The final keyword makes a variable constant, meaning its value cannot be modified once assigned.
      //If you try to result value of x,it will result in a compilation error.
    }
}
