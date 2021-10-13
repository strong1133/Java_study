package com.javastudy.dofirst.cpt11.object;

public class EqualTest {
    public static void main(String[] args) {
        Student studentJ = new Student(100, "정석진");
        Student studentJ2 = studentJ; // 주소 복사

        Student studentJ3 = new Student(100, "정석진");

        if (studentJ.equals(studentJ2)){
            System.out.println("J 와 J2 는 같습니다.");
        }else{
            System.out.println("J 와 J2 는 다릅니다.");
        }

        if (studentJ.equals(studentJ3)){
            System.out.println("J 와 J3 는 같습니다.");
        }else{
            System.out.println("J 와 J3 는 다릅니다.");
        }
    }
}
