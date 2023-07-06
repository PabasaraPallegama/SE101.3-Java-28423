package com.mycompany.containerobj1;
public class ContainerObj1 {

    public static void main(String[] args) 
    {
        CylindericalContainer cc = new CylindericalContainer(21,12);
        System.out.println("Volume of Cylinder is "+cc.volume());
    }
}
