package com.mycompany.itemobj;
public class Item 
{
    // data(declaring variables)
    private int location;
    private String description;
    
    //using constructor method to assign the values
    protected Item(int location,String description)
    {
        this.location=location;
        this.description=description;
    }
    
    //setter method to location
    protected void setLocation(int x)
    {
        location=x;
    }
    
    //getter method to location
    protected int getLocation()
    {
        return location;
    }
    
    //setter method to description
    protected void setDescription(String y)
    {
        description=y;
    }
    //getter method to description
    protected String getDescription()
    {
        return description;
    }
    
}
