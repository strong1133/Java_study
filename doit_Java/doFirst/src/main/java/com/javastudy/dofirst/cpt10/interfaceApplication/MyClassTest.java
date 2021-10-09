package com.javastudy.dofirst.cpt10.interfaceApplication;

public class MyClassTest {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        
        InterfaceX xclass = myClass;
        xclass.x();

        InterfaceY yclass = myClass;
        yclass.y();

        myClass.myMethod();
        myClass.x();
        myClass.y();
    }
}
