
package com.mycompany.myfirstinterfaceobj;
public class InterfaceImplemented implements MyFirstInterface 
{
    @Override
    public void display()
    {
        //x=10;
        System.out.println("x is: "+x);
         /*3.	In the output we will not get the modified value to the “x”variable.
Because we used the override method, and it will not supported in interface.  */      
    }

            }
