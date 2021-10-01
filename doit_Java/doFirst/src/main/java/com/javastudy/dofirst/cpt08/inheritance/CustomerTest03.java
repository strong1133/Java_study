package com.javastudy.dofirst.cpt08.inheritance;

import java.util.ArrayList;

// 배열을 통한 클래스 관리  
public class CustomerTest03 {

    public static void main(String[] args) {

        // 인스턴스를 담아줄 클래스형 배열 선언
        ArrayList<Customer> customerArrayList = new ArrayList<Customer>();

        Customer customerLee = new Customer(10001, "이순신");
        Customer customerShin = new Customer(10002, "신사임당");
        Customer customerHong = new GoldCustomer(10003, "홍슬기");
        Customer customerJeong = new VIPCustomer(11111, "정석진", 12345);

        // 각 인스턴스를 배열에 add
        customerArrayList.add(customerLee);
        customerArrayList.add(customerShin);
        customerArrayList.add(customerHong);
        customerArrayList.add(customerJeong);

        System.out.println(" ===== 고객 정보 출력 ===== ");

        for(Customer customer : customerArrayList){
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println(" ===== 할인율과 보너스 계산 ===== ");
        int price = 12000;

        // 배열에 들어 있는 인스턴스에 맞는 클래스 형으로 오버라이딩 되어 매서드 실행
        for(Customer customer : customerArrayList){
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + " 님이 " + cost + "원 지불하셨습니다.");
            System.out.println(customer.getCustomerName() + " 님의 포인트는 " + customer.bonusPoint + " 점 입니다." );
        }
    }
}
