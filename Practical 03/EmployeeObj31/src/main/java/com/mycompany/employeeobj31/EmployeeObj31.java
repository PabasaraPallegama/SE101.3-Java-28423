package com.mycompany.employeeobj31;
public class EmployeeObj31 
{

    public static void main(String[] args) 
    {
        //creating  an object to call the methods 
        Employee e1 = new Employee("pabasara",21,25000.00f);
        System.out.println("The Employee Name is "+e1.getEmpName());
        System.out.println("The Employee Age is "+e1.getEmpAge());
        System.out.println("The Salary of Employee is "+e1.getEmpSalary());
        
        
    }
}
