package com.mycompany.shapeobj01;
public class Rectangle implements Shape
{
    //declare data
    private double length;
    private double width;
    
    // using constructor method to assign variables to member variable
    public Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    
    //setter method to length
    public void setLength(double length)
    {
        this.length=length;
    }
    
    //getter method to length
    public double getLength()
    {
        return length;
    }
    
    //setter method to width
    public void setWidth(double width)
    {
        this.width=width;
    }
    
    //getter method to width
    public double getWidth()
    {
        return width;
    }
    
    //using override method to to write methods
    @Override
    public  double calculateArea()
    {
        return length*width;
    }
    @Override
    public  double calculatePerimeter()
    {
        return 2*(length+width);
    }
}   


