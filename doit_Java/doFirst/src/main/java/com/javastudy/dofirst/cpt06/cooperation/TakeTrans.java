package com.javastudy.dofirst.cpt06.cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        cpt06Student studentJay = new cpt06Student("Jay", 5000);
        cpt06Student studentTom = new cpt06Student("Tom", 12000);

        Bus bus100 = new Bus(100);
        studentJay.takeBus(bus100); // 승객 +1
        studentJay.showInfo(); //4000
        System.out.println();
        bus100.showInfo(); // 1명, 1000원
        System.out.println();

        Subway subway5 = new Subway(5);
        studentTom.takeSubway(subway5); // 승객 +1
        studentJay.takeSubway(subway5); // 승객 +1

        studentTom.showInfo(); //10500
        System.out.println();
        studentJay.showInfo(); //2500
        System.out.println();

        subway5.showInfo(); // 2명, 3000원

    }
}
