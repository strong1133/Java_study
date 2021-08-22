package com.javastudy.dofirst.cpt07.arrayList;

public class StudentTestCpt7 {
    public static void main(String[] args) {
        StudentCpt7 studentLee = new StudentCpt7(1001, "Lee");
        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 100);

        StudentCpt7 studentChol = new StudentCpt7(1002, "Choi");
        studentChol.addSubject("국어", 66);
        studentChol.addSubject("수학", 44);
        studentChol.addSubject("영어", 100);

        studentLee.showStudentInfo();
        System.out.println("=========");
        studentChol.showStudentInfo();
    }
}
