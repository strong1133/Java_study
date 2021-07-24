package com.javastudy.dofirst.cpt05;

public class Shop {
    Long id; // 주문번호
    String username; // 고객 id
    String date; // 주문 날짜
    String name; // 고객 성명
    String productCode; // 상품 코드
    String address; // 주소

    public Shop(){ }

    public Shop(Long id, String username, String date, String name, String productCode, String address){
        this.id = id;
        this.username = username;
        this.date = date;
        this.name = name;
        this.productCode = productCode;
        this.address = address;
    }

    public void getOrderInfo(){
        System.out.printf(
                "주문 번호: %d \n" +
                "주문자 아이디: %s \n" +
                "주문 날짜: %s \n" +
                "주문자 성명: %s \n" +
                "주문 상품 번호: %s \n" +
                "배송 주소: %s \n" , id, username,date,name,productCode,address );
    }

}
