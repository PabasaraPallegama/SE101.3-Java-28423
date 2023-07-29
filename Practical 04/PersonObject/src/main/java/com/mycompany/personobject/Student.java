package com.mycompany.personobject;
public class Student extends Person
{
   //variable declaration and using super class variables
    
    
    private String course;
    // Setter and Getter for course
    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }
}
