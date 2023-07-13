
package com.mycompan.lab8q01;
import java.util.Scanner;
public class DivisionProgram
{
    public void display(){
        Scanner s1=new Scanner(System.in);
       
        System.out.println("Enter the numerator: ");
        int numerator=s1.nextInt();
        
        System.out.println("Enter the denominator: ");
        int denominator=s1.nextInt();
        
        try
        {
           int result= divide(numerator,denominator);
            System.out.println("Result: "+result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error: "+e.getMessage());
        }
    }
     public static int divide(int numerator,int denominator)
     {
         return numerator/denominator;
 
     }
}
