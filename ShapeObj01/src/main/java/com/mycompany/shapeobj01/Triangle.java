package com.mycompany.shapeobj01;
public class Triangle implements Shape
{
    //declare variables
    private double triangleSide1;
    private double triangleSide2;
    private double triangleSide3;
    
    //using constructor method to assign variables to member variables
    public Triangle(double triangleSide1,double triangleSide2,double triangleSide3)
    {
        this.triangleSide1=triangleSide1;
        this.triangleSide2=triangleSide2;
        this.triangleSide3=triangleSide3;
    }
    
    //setter method to triangleSide1
    public void setTriangleSide1(double triangleSide1 )
    { 
        this.triangleSide1=triangleSide1;
    }
    
    //getter method to triangleSide1
    public double getTriangleSide1()
    {
        return triangleSide1;
    }
    
    //setter method to triangleSide2
    public void setTriangleSide2(double triangleSide2 )
    { 
        this.triangleSide2=triangleSide2;
    }
    
    //getter method to triangleSide2
    public double getTriangleSide2()
    {
        return triangleSide2;
    }
    
    //setter method to triangleSide3
    public void setTriangleSide3(double triangleSide3 )
    { 
        this.triangleSide3=triangleSide3;
    }
    
    //getter method to triangleSide2
    public double getTriangleSide3()
    {
        return triangleSide3;
    }
    
    //using override method 
    @Override
    public double calculateArea()
    {
       double s=(triangleSide1+triangleSide2+triangleSide3)/2;
       return Math.sqrt(s*(s - triangleSide1)*(s - triangleSide2)*(s - triangleSide3));
    }
    
    @Override
    public double calculatePerimeter()
    {
      return triangleSide1+triangleSide2+triangleSide3;  
    }
}
