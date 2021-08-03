package com.javastudy.dofirst.cpt06.cooperation;

public class cpt06Student {
    private String studentName;
    private int grade;
    private int money;

    // 이름과 돈을 매개변수로 받는 생성자
    public cpt06Student(String studentName, int money){
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus){
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway){
        subway.take(1500);
        this.money -= 1500;
    }

    public void showInfo(){
        System.out.printf("%s 님의 남은 금액은 %d 원 입니다", studentName, money);
    }
}
