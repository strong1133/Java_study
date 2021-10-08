package com.javastudy.dofirst.cpt10.interfaceApplication;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Buy buyer = customer;
        Sell seller = customer;

        //Customer형 인스턴스는 두 메서드를 모두 호출할 수 있지만
        customer.buy();
        customer.sell();

        // 각 인터페이스형으로 변환된 인스턴스는 해당 인터페이스의 메서드만 호출할 수 있다.
        buyer.buy();
        seller.sell();


        // 이때 seller 인터페이스 형을 다시 Customer형으로 다운캐스팅 하면
        // 다시 모든 메서드를 사용할 수 있다.
        if(seller instanceof Customer){
            Customer customer2 = (Customer) seller;
            customer2.buy();
            customer2.sell();
        }
    }
}
