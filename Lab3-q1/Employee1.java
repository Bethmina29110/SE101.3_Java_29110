package com.mycompan.lab3.q1;
public class Employee1 
{
   private String employeeName;
    private int age;
    private float salary;
    
    public Employee1(String employeeName, int age, float salary){
        this.employeeName = employeeName;
        this.age = age;
        this.salary = salary;
    }

    public String getEmployeeName(){
        return employeeName;
    }
    public int getAge(){
        return age;
    }
    public float getSalary(){
        return salary;
    }
     
}
