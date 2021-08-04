package com.javastudy.dofirst.cpt06.staticEx;

public class StudentTest01 {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.setName("이지원");
        System.out.println(studentLee.serialNum);

        studentLee.serialNum ++;

        Student studentSon = new Student();
        studentSon.setName("손흥민");
        System.out.println(studentLee.serialNum);
        System.out.println(studentSon.serialNum);
    }
}
