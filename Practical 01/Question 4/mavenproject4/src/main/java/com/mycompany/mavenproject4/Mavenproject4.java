package com.mycompany.mavenproject4;
public class Mavenproject4 {

    public static void main(String[] args) 
    {
      int[] number = {10,20,30,40,50};
        for(int x:number)
        {
            if(x==30)
            {
                break;
            }
            System.out.println("x");
            System.out.println("\n");
        }
        System.out.println("I'm out of the Loop now");  
    }
}
//output
/* x


x


I'm out of the Loop now*/
