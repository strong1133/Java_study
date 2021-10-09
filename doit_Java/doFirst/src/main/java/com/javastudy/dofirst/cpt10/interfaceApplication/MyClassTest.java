package com.javastudy.dofirst.cpt10.interfaceApplication;

public class MyClassTest {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        // InterfaceX 으로 대입하면 InterfaceX에서 선언한 메서드만 호출가능
        InterfaceX xclass = myClass;
        xclass.x();

        InterfaceY yclass = myClass;
        yclass.y();

        // MyClass형은  MyInterface 구현 하였고
        // MyInterface는 x, y를 상속 받기 때문에
        // MyClass형은 MyInterface내에 구현된 모든 메서드에 접근 가능
        myClass.myMethod();
        myClass.x();
        myClass.y();
    }
}
