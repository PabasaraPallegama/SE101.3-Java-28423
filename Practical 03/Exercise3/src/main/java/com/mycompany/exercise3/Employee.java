package com.mycompany.exercise3;
public class Employee 
{
    //declaring variables(data)
    private String employeeName;
    private float basicSalary;
    private float bonus;
    private float bonusAmount;
    
    //using set method to employeeName to set values
    public void setEmployeeName(String employeeName)
    {
        this.employeeName=employeeName;
    }
    
    //getter method to employeeName to retrieve value
    public String getEmployeeName()
    {
        return employeeName;
    }
    
    //set method to basicSalary
    public void setBasicSalary(float basicSalary )
    {
       this.basicSalary=basicSalary; 
    }
    
    //get method to retrieve value
    public float getBasicSalary()
    {
        return basicSalary;
    }
    
    //using constructor to bonus to pass the value
    public Employee(float bonus )
    {
        this.bonus=bonus;
        
    }
    //retrieve the bonus value
    public float getBonus()
    {
        return bonus;
    }
    
    //method to calculate bonus amount
    public void calculateBonusAmount()
    {
        bonusAmount = bonus + basicSalary;
        System.out.println("Bonus Amount: "+bonusAmount);
    }
}
