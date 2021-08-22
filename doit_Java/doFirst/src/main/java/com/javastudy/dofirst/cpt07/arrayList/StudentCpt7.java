package com.javastudy.dofirst.cpt07.arrayList;

import java.util.ArrayList;

public class StudentCpt7 {
    int studentId;
    String  studentName;
    ArrayList<SubjectCpt7> subjectCpt7List;

    public StudentCpt7(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
        subjectCpt7List = new ArrayList<SubjectCpt7>(); // ArrayList 생성
    }

    public void addSubject(String name, int score){
        SubjectCpt7 subjectCpt7 = new SubjectCpt7();
        subjectCpt7.setName(name);
        subjectCpt7.setScore(score);
        subjectCpt7List.add(subjectCpt7);
    }

    public void showStudentInfo(){
        int total = 0;
        for(SubjectCpt7 s : subjectCpt7List){
            total += s.getScore();
            System.out.println("학생"+ studentName + "의 " + s.getName() + "과목 성적은 "+s.getScore() + " 입니다.");
        }
        System.out.println("학생 "+ studentName + "의 총점은 "+ total + "입니다.");

    }
}
