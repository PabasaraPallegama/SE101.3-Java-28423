package com.mycompany.shapeobj01;
public  class Circle implements Shape
{
    //data
    private double radius;
    
    //giving constructor method to assign variables to member variables
    public Circle(double radius)
    {
        this.radius=radius;
    }
    
    //setter method to radius
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    
    //getter method to radius
    public double getRadius()
    {
        return radius;
    }
    
    //mentioning methods in the interface class to access within circle class
    @Override
    public  double calculateArea()
    {
        return Math.PI*radius*radius;
    }
    
    @Override
    public double calculatePerimeter()
    {
        return 2*Math.PI*radius;
    }
}
