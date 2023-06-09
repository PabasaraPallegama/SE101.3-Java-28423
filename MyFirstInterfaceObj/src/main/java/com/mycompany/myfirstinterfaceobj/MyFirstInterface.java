package com.mycompany.myfirstinterfaceobj;
public interface MyFirstInterface 
{
    //data
    /*1.	There is no difference between these approaches.
Without including public static final keywords to the code, variable is still considered above mentioned keywords by default.
Because this code has been declared within the interface.*/
    int x=5;
    //declaring abstract method without abstract keyword
    
    /*2.	No, it will not give us a different approach. 
when we declared a method without abstract keyword in interface, it will consider the methods as abstract by default.
So, we don’t have to put abstract keyword.*/
    
     void display();
}
