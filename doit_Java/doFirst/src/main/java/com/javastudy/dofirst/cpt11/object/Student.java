package com.javastudy.dofirst.cpt11.object;

public class Student {

    int studentId;
    String studentName;

    public Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String toString(){
        return studentId + "("+ studentName +")";
    }
}
