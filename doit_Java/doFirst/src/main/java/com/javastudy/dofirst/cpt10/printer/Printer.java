package com.javastudy.dofirst.cpt10.printer;

public class Printer extends Machine{

    public void startPrint(){
        System.out.println("출력을 시작합니다.");
    }

    public void endPrint(){
        System.out.println("출력을 종료합니다.");
    }

    @Override
    public void getMachineName() {
        System.out.println("장치 이름은 프린터");
    }

}
