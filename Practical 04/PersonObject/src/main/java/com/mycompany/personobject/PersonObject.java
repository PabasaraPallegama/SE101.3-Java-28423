package com.mycompany.personobject;
public class PersonObject 
{

    public static void main(String[] args) 
    {
        // Create a Student object and set values
        Student st = new Student();
        st.setName("chalani");
        st.setID(9687);
        st.setCourse("Computer Science");

        // Create a Lecturer object and set values
        Lecturer le = new Lecturer();
        le.setName("Sameera Ekanayake");
        le.setID(5192);
        le.setProgramme("Software Engineering");

        // Print Student and Lecturer details
        System.out.println("Student Name: " + st.getName());
        System.out.println("Student ID: " + st.getID());
        System.out.println("Student Course: " + st.getCourse());

        System.out.println("\nLecturer Name: " + le.getName());
        System.out.println("Lecturer ID: " + le.getID());
        System.out.println("Lecturer Programme: " + le.getProgramme());
    }
    
}
