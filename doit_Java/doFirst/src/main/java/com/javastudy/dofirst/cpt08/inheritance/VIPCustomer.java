package com.javastudy.dofirst.cpt08.inheritance;

public class VIPCustomer extends Customer {
    private int agentID; // vip 상담원 ID
    double saleRatio; // vip 할인율

    public VIPCustomer(){
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public int getAgentID(){
        return agentID;
    }
}
