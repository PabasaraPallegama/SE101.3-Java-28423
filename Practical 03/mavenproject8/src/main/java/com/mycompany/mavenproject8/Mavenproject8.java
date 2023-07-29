package com.mycompany.mavenproject8;
public class Mavenproject8 {

    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        e1.setEmpName("pabasara");
        e1.setEmpAge(21);
        e1.setEmpSalary(25000.00f);
        System.out.println("The Employee Name is "+e1.getEmpName());
        System.out.println("The Employee Age is "+e1.getEmpAge());
        System.out.println("The Employee Salary is "+e1.getEmpSalary());

    }
}
