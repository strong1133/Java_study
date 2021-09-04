package com.javastudy.dofirst.cpt08.inheritance;

public class CustomerTest01 {
    public static void main(String[] args) {
//        Customer customerLee = new Customer();
//        customerLee.setCustomerID(10001);
//        customerLee.setCustomerName("이상아");
//        customerLee.bonusPoint = 1000;
//        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerJeong = new VIPCustomer(10002, "정석진", 2001);

        System.out.println(customerJeong.showCustomerInfo());
    }
}
