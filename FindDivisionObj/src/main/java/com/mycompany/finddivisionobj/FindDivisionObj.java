package com.mycompany.finddivisionobj;
import java.util.Scanner;
public class FindDivisionObj {

    public static void main(String[] args) 
    {
        //declaring variable
     float num1,num2,div;
    Scanner sc = new Scanner(System.in);
    //using try catch block
    try
    {
        System.out.print("Enter first number ");
        num1 = Float.parseFloat(sc.nextLine());
        System.out.print("Enter second number ");
        num2 = Float.parseFloat(sc.nextLine());
        div = num1/num2;
        System.out.print("the division is "+div);
    }
    catch(ArithmeticException e)
    {
        System.out.print("divide by zero error"+e.getMessage()); 
    }
    
    }
}
