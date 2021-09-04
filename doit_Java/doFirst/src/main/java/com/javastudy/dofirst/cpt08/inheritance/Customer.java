package com.javastudy.dofirst.cpt08.inheritance;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    // 기본 생성자
    public Customer(){
        customerGrade = "SILVER";
        bonusRatio=0.01;
        System.out.println("Customer 생성자 호출");
    }

    // Custom 생성자 - customerID, customerName를 매개변수로 넘겨야 함.
    public Customer(int customerID, String customerName ){

        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio=0.01;
        System.out.println("Customer 생성자 호출22");
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo(){
        return customerName + "님의 등급은 " + customerGrade +"이며, 보너스 포인트는 "+ bonusPoint + " 입니다.";
    }
}
