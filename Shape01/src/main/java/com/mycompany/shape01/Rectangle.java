package com.mycompany.shape01;
public class Rectangle extends Shape
{
    //data
    private double length;
    private double width;
    //set values for these variables
    public Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    @Override
    //method
    public double calculateArea()
    {
        return length*width;
        
    }
    
}
