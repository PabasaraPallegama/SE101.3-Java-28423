package com.mycompany.practical4exercise01;
public class Practical4Exercise01 
{

    public static void main(String[] args) 
    {
        //creating objects to call the methods
        Employee ep = new Employee();
        ep.setEmpId(2354);
        ep.setEmpName("Mr.Bogdan");
        ep.setEmpDesignation("Kandy");
        
        Employee ep1 = new Employee();
        ep1.setEmpId(8756);
        ep1.setEmpName("Ms.Bird");
        ep1.setEmpDesignation("Colombo");
        
        System.out.println("The Employee ID: "+ep.getEmpId());
        System.out.println("The Employee Name: "+ep.getEmpName());
        System.out.println("The Employee Designation: "+ep.getEmpDesignation());
        
        System.out.println(" ");
        
        System.out.println("The Employee ID: "+ep1.getEmpId());
        System.out.println("The Employee Name: "+ep1.getEmpName());
        System.out.println("The Employee Designation: "+ep1.getEmpDesignation());
    }
}
