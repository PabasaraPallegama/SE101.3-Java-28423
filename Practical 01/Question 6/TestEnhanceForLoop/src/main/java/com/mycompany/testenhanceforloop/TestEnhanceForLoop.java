package com.mycompany.testenhanceforloop;
public class TestEnhanceForLoop {

    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        for(int x:numbers)
        {
            System.out.print(x);
            System.out.print(",");
        }
        System.out.print("\n");
        //error- not using ";" end of the statement
        String[]names = {"James","Larry","Tom","Lacy"};
                for(String name:names)
                {
                    System.out.print(name);
                    System.out.print(",");
                }
    }
}
/*10,20,30,40,50,
James,Larry,Tom,Lacy,*/
