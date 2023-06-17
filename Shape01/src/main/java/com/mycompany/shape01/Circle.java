package com.mycompany.shape01;
public class Circle extends Shape
{
   //data
    private float radius;
    //set values for radius variable
    public Circle(float radius)
    {
        this.radius=radius;
    }
    @Override
    public double calculateArea()
    {
        return Math.PI*radius*radius;
    }
}
