package com.javastudy.dofirst.cpt05;

public class Student {
    int studentId;
    String studentName;
    int grade;
    String address;

    // getter
    public void getStudentInfo(){
        System.out.printf("이름은 %S", studentName); //이름
    }

    //setter
    public String setStudentName(String name){
        studentName = name;
        return studentName;
    }

    public static void main(String[] args) {
        Student studentAhn = new Student();
        studentAhn.studentName = studentAhn.setStudentName("정석진");

        System.out.println(studentAhn.studentName);
        studentAhn.getStudentInfo();


    }
}
