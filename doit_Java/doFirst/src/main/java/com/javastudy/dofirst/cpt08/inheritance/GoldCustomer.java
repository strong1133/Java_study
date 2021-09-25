package com.javastudy.dofirst.cpt08.inheritance;

public class GoldCustomer extends Customer{

    double saleRatio;

    public GoldCustomer(int customerID, String customerName){
        super(customerID, customerName);
        customerGrade = "GOLD";
        bonusRatio = 0.02;
        saleRatio = 0.1;
    }

    // 상위 클래스의 calcPrice -> 오버라이딩
    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio) ;
    }
}
