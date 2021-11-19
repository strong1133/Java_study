package com.javastudy.dofirst.cpt10.printer;

public abstract class Machine {
    public abstract void getMachineName();

    public void turnOn (){
        System.out.println("전원을 켭니다.");
    }

    public void turnOff (){
        System.out.println("전원을 종료합니다.");
    }

}
