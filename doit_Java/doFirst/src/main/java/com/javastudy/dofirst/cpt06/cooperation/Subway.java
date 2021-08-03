package com.javastudy.dofirst.cpt06.cooperation;

public class Subway {
    int subwayNumber;
    int passengerCount;
    int money;

    public Subway(int subwayNumber){
        this.subwayNumber = subwayNumber;
    }

    public void take(int money) {
        this.money += money;
        passengerCount ++;
    }

    public void showInfo(){
        System.out.printf("%d 호선 전철의 승객은 %d 명이고, 수입은 %d 원 입니다.", subwayNumber, passengerCount, money);
    }
}
