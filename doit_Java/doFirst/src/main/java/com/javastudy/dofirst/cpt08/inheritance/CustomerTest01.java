package com.javastudy.dofirst.cpt08.inheritance;

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.setCustomerID(10001);
        customerLee.setCustomerName("이상아");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerJeong = new VIPCustomer();
        customerJeong.setCustomerID(10002);
        customerJeong.setCustomerName("정석진");
        customerJeong.setBonusPoint(100000);
        System.out.println(customerJeong.showCustomerInfo());
    }
}
