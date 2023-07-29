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
  answer-b

 2. The modifier which specifies that the member can only be accessed in its own class is     
        a) public		b) private	c) protected		d) none 
 answer-b


3.	Which of these is a mechanism for naming and visibility control of a class and its content?
a) Object	b) Packages
c) Interfaces	d) None of the Mentioned.
answer-d

4.	Which of the following is correct way of importing an entire package ‘pkg’?
a) import pkg.				b) Import pkg.
c) import pkg.*				d) Import pkg.*
answer-c

5.	Which of these method of class String is used to extract a single character from a String object?
a) CHARAT()	b) charat()
c) charAt ()	d) CharAt()
answer-c

6.	Which of these method of class String is used to obtain length of String object?
a) get()	b) Sizeof()
c) lengthof()	d) length()
answer-d

PART 03: Fill in the blanks using appropriate term.

1.	Real-world objects contain ______________ and ____________.
2.	A software object's state is stored in _____________________.
3.	A software object's behavior is exposed through ___________.
4.	Hiding internal data from the outside world, and accessing it only through publicly exposed methods is known as data ________________.
5.	A blueprint for a software object is called a _____________.
6.	Common behavior can be defined in a ______________ and inherited into a _____________ using the ___________ keyword.
7.	A collection of methods with no implementation is called an ____________.
8.	A namespace that organizes classes and interfaces by functionality is called a _________.
9.	The term API stands for ______________________________________.


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
