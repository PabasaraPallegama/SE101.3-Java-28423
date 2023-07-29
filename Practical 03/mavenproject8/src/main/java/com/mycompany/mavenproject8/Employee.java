package com.mycompany.mavenproject8;
public class Employee 
{
    //declaring data
    private String empName;
    private int empAge;
    private float empSalary;
    
    //setter method to empname
    public void setEmpName(String en)
    {
        empName=en;
    }
    
    //getter method to empname
    public String getEmpName()
    {
        return empName;
    }
    //setter method to empAge
    public void setEmpAge(int ea)
    {
        empAge=ea;
    }
    //getter method to empAge
    public int getEmpAge()
    {
        return empAge;
    }
    //setter method to empSalary
    public void setEmpSalary(float es)
    {
        empSalary=es;
    }
    //getter method to empSalary
    public float getEmpSalary()
    {
        return empSalary;
    }

}
