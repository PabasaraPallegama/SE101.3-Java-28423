package com.mycompany.arrayexceptionobj;
public class ArrayExceptionObj {

    public static void main(String[] args) 
    {
        int []numbers  ={1,2,3,4,5};
      
        try
        {
            int value = numbers[10];
            int result=value/0;
            System.out.println("array value is "+value);
        }
        catch(ArithmeticException e)
        {
            System.out.println("error: array index is out of bounds");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        finally{
            for(int i=0;i<numbers.length;i++)
            {
                System.out.println(numbers[i]+"");
            }
        }
        
    }
}
