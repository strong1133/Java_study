package com.javastudy.dofirst.cpt08.inheritance;

public class CustomerTest02 {

    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;

        VIPCustomer customerKim = new VIPCustomer(10020, "김수현", 12345);
        customerKim.bonusPoint = 20000;

        // 묵시적 클래스 형 변환과 오버라이딩, Customer를 VIPCustomer으로 묵시적 형변환 함.
        Customer customerHong = new VIPCustomer(10030, "홍슬기", 12345);

        int price = 20000;
        System.out.println(customerLee.getCustomerName() + " 님이 지불해야 하는 금액은 " + customerLee.calcPrice(price)+ "원 입니다.");
        System.out.println(customerKim.getCustomerName() + " 님이 지불해야 하는 금액은 " + customerKim.calcPrice(price)+ "원 입니다.");

        // customerHong은 Customer로 생성되었지만 VIPCustomer으로 형변환 하여 calcPrice 이 오버라이딩 되어 실행됨.
        System.out.println(customerHong.getCustomerName() + " 님이 지불해야 하는 금액은 " + customerHong.calcPrice(price)+ "원 입니다.");
    }
}
