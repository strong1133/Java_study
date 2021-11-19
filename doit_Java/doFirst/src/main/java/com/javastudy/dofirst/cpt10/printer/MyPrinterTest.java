package com.javastudy.dofirst.cpt10.printer;

public class MyPrinterTest {
    public static void main(String[] args) {
        MyPrinter myPrinter = new MyPrinter();

        myPrinter.getMachineName();

        myPrinter.turnOn();
        myPrinter.startPrint();

        myPrinter.enQueue("1번문서");
        myPrinter.enQueue("2번문서");
        myPrinter.enQueue("3번문서");
        myPrinter.enQueue("4번문서");

        while (0<myPrinter.getSize()){
            System.out.printf("남은 문서는 %d 건입니다." , myPrinter.getSize());
            System.out.println();
            System.out.printf("%s 출력완료",myPrinter.deQueue());
            System.out.println();
        }

        myPrinter.endPrint();
        myPrinter.turnOff();
    }
}
