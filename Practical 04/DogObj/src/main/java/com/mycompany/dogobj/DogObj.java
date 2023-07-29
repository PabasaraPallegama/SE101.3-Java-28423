package com.mycompany.dogobj;
public class DogObj {

    public static void main(String[] args) 
    {
      Animal a = new Animal();
      Mammal m = new Mammal();
      Dog d = new Dog();
      System.out.println(m instanceof Animal);
      System.out.println(d instanceof Mammal);
      System.out.println(d instanceof Animal);

    }
}
/*output
true
true
true
*/

/*Since Mammal extends Animal, the instanceof operator returns true for this statement.
The instanceof operator is used to check whether an object is an instance of a particular class or its subclass in the inheritance hierarchy
*/
