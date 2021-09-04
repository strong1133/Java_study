package com.javastudy.dofirst.cpt08.inheritance;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class VIPCustomer extends Customer {
    private int agentID; // vip 상담원 ID
    double saleRatio; // vip 할인율

    public VIPCustomer(int customerID, String customerName, int agentID){
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
        System.out.println("VIPCustomer 생성자 호출");
    }

    public int getAgentID(){
        return agentID;
    }

    // 오버라이딩
    public String showCustomerInfo(){
        return customerName + "님의 등급은 " + customerGrade +"이며, 보너스 포인트는 "+ bonusPoint + " 입니다. 댬당 상담원의 아이디는 "+ agentID + "입니다";
    }
}
