
package com.mycompany.containerobj1;
public class CylindericalContainer extends Container
{
    //declaring data
    private double height;
    private double radius;
    
    //using constructor method to assign values for member variables
    public CylindericalContainer(double H,double R)
    {
        this.height = H;
        this.radius = R;
    }
    //method
    @Override
    public double volume()
    {
        return 3.1459f*radius*radius*height;
    }
}
