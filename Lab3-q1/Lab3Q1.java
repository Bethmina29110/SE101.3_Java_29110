
package com.mycompan.lab3.q1;
public class Lab3Q1 {

    public static void main(String[] args) 
    {
         /*
        var Employee1 = new Employee("Bethmina",21,50000);
        
        System.out.println("Employee Name: "+Employee1.getEmployeeName());
        System.out.println("Age: "+Employee1.getAge());
        System.out.println("Salary: "+Employee1.getSalary());
        */
        
        var Employee2 = new Employee2();
        Employee2.setEmployeeName("Bethmina");
        Employee2.setSalary(50000);
        Employee2.setAge(21);
        
        System.out.println("Employee Name: "+Employee2.getEmployeeName());
        System.out.println("Age: "+Employee2.getAge());
        System.out.println("Salary: "+Employee2.getSalary());
    }
}
