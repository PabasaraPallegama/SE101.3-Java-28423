package com.mycompany.practical0105;
public class Practical0105 
{

    public static void main(String[] args)
    {
        char grade = 'A';
                    if(grade == 'A')
        {
           System.out.println("Excellent!"); 
        }
            else if(grade == 'D')
            {
                System.out.println("You passed");
            }
            else if (grade == 'F')
            {
                System.out.println("Better try again");
            }
            else
            {
                System.out.println("Invalid grade");
            }
        
        System.out.println("Your grade is "+grade);
    }
}
//output
/* Excellent!
Your grade is A
*/