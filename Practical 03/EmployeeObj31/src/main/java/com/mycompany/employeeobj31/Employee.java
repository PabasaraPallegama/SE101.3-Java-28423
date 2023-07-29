package com.mycompany.employeeobj31;
public class Employee 
{
    //declaring data
    private String empName;
    private int empAge;
    private float empSalary;
    
    //using constructors to set values for variables
    public Employee(String empName,int empAge,float empSalary)
    {
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }
    
    //getter method to empName
    public String getEmpName()
    {
        return empName;
    }
    //getter method to empAge
    public int getEmpAge()
    {
        return empAge;
    }
    //getter method to empSalary
    public float getEmpSalary()
    {
        return empSalary;
    }
    
}
