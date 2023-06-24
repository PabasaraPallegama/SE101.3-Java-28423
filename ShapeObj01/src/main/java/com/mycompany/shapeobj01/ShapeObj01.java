package com.mycompany.shapeobj01;
public class ShapeObj01 
{

    public static void main(String[] args) 
    {
        Circle c1= new Circle(10.0);
        System.out.println("The Area of circle is "+c1.calculateArea());
        System.out.println("The Perimeter of circle is "+c1.calculatePerimeter());
        
        Rectangle r1= new Rectangle (8.0,6.0);
        System.out.println("The Area of Rectangle is "+r1.calculateArea());
        System.out.println("The Perimeter of Rectangle is "+r1.calculatePerimeter());
        
        
        Triangle t1= new Triangle (2.0,4.0,6.0);
        System.out.println("The Area of Triangle is "+t1.calculateArea());
        System.out.println("The Perimeter of Triangle is "+t1.calculatePerimeter());
        
        
    }
}
