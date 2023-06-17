package com.mycompany.shape01;
public abstract class Shape 
{
    //abstract method called calculateArea()
    public abstract double calculateArea();
    
    //non abstract method called display()
    public void display()
    {
        System.out.println("Area  is "+calculateArea());
        
        
    }
    
}
