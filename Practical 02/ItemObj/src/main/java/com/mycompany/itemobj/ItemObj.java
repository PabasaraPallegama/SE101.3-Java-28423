package com.mycompany.itemobj;
public class ItemObj 
{

    public static void main(String[] args)
    {
        Item i1=new Item(5678,"Kandy");
        System.out.println("The Location is "+i1.getLocation());
        System.out.println("The Description is "+i1.getDescription());
        
        Monster m1=new Monster(1234,"Colombo");
        m1.setLocation(1234);
        m1.setDescription("Colombo");
        System.out.println("The location is "+m1.getLocation());
        System.out.println("The Description is "+m1.getDescription());
        
    }
}
/*Part 02

1. Which of these keywords is used to refer to member of base class from a sub class?
 	a) upper	b) super	c) this		d) None of the mentioned

 2. The modifier which specifies that the member can only be accessed in its own class is     
        a) public		b) private	c) protected		d) none 


3.	Which of these is a mechanism for naming and visibility control of a class and its content?
a) Object	b) Packages
c) Interfaces	d) None of the Mentioned.


4.	Which of the following is correct way of importing an entire package ‘pkg’?
a) import pkg.				b) Import pkg.
c) import pkg.*				d) Import pkg.*


5.	Which of these method of class String is used to extract a single character from a String object?
a) CHARAT()	b) charat()
c) charAt ()	d) CharAt()

6.	Which of these method of class String is used to obtain length of String object?
a) get()	b) Sizeof()
c) lengthof()	d) length()


PART 03: Fill in the blanks using appropriate term.

1.	Real-world objects contain state(data) and behaviour(method).
2.	A software object's state is stored in instance variables.
3.	A software object's behavior is exposed through methods.
4.	Hiding internal data from the outside world, and accessing it only through publicly exposed methods is known as data encapsulation.
5.	A blueprint for a software object is called a class.
6.	Common behavior can be defined in a superclass and inherited into a subclass using the extends keyword.
7.	A collection of methods with no implementation is called an interface.
8.	A namespace that organizes classes and interfaces by functionality is called a package.
9.	The term API stands for Application Programming Interface.

*/
