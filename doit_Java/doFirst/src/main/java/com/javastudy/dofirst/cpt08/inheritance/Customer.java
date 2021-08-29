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
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo(){
        return customerName + "님의 등급은 " + customerGrade +"이며, 보너스 포인트는 "+ bonusPoint + " 입니다.";
    }
}
