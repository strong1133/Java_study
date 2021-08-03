package com.javastudy.dofirst.cpt06.cooperation;

public class Bus {
    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber){
        this.busNumber = busNumber;
    }

    public void take(int money) {
        this.money += money;
        passengerCount ++;
    }

    public void showInfo(){
        System.out.printf("%d 번 버스의 승객은 %d 명이고, 수입은 %d 원 입니다.", busNumber, passengerCount, money);
    }
}
