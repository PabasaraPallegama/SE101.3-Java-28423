package com.mycompany.exercise3;
public class Exercise3 {

    public static void main(String[] args) 
    {
        //creating object to call the methods
        
        
        Employee ey = new Employee(50000.00f);
        ey.setEmployeeName("oshani");
        ey.setBasicSalary(40000);
        ey.calculateBonusAmount();
        
        System.out.println("Employee Name: "+ey.getEmployeeName());
        System.out.println("Basic Salary: "+ey.getBasicSalary());
        System.out.println("Bonus: "+ey.getBonus());
        
    }
}
