package com.javastudy.dofirst.cpt06.singleton;

public class CompanyTest {
    public static void main(String[] args) {

        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();
        System.out.println(company1);
        System.out.println(company2);
        System.out.println(company1==company2); // 두 변수가 주소가 같은지 확인
    }
}
