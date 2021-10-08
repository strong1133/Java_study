package com.javastudy.dofirst.cpt10.interfaceApplication;

// Buy, Sell 두개를 implements 하여 각각 오버라이딩
public class Customer implements Buy, Sell{
    @Override
    public void buy() {
        System.out.println("사기");
    }

    @Override
    public void sell() {
        System.out.println("팔기");
    }
}
