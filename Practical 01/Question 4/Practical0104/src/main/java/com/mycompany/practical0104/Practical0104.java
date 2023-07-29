package com.mycompany.practical0104;
public class Practical0104 
{

    public static void main(String[] args) 
    {
        int[] number = {10,20,30,40,50};
        for(int x:number)
        {
            if(x==30)
            {
                continue;
            }
            System.out.println("x");
            System.out.println("\n");
        }
        System.out.println("I'm out of the Loop now");
    }
}
//output
/*x


x


x


x


I'm out of the Loop now*/
