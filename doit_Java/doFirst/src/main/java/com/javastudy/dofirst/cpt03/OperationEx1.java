package com.javastudy.dofirst.cpt03;

public class OperationEx1 {
    public static void main(String[] args) {

        int myAge = 23;
        int teacherAge = 38;

        boolean val = (myAge > 25);

        System.out.println("val: " + val); // false
        System.out.println(myAge <= 25); // true
        System.out.println(myAge == teacherAge); // false
        System.out.println(myAge != teacherAge); // true

        char ch;
        ch = (myAge > teacherAge) ? 'T':'F';

        System.out.println("ch: "+ ch); //F

    }
}
