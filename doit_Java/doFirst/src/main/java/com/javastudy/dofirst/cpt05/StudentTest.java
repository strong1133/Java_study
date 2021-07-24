package com.javastudy.dofirst.cpt05;

public class StudentTest {
    public static void main(String[] args) {
        Student studentAhn = new Student(); // 새로운 Student 클래스 생성
        studentAhn.setStudentName("정석무");

        System.out.println(studentAhn.studentName);
        studentAhn.getStudentInfo();
    }
}
