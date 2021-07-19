package com.javastudy.dofirst.cpt02;

public class Constant {
    public static void main(String[] args) {
        final int MAX_NUM = 100; // 선언과 동시에 초기화
        final int MIN_NUM; // 선언만 함

        MIN_NUM = 0; // 사용전 초기화를 해줘야 오류가 안남

        System.out.println(MAX_NUM); // 100
        System.out.println(MIN_NUM); // 0

//        MIN_NUM = 1000; // 상수는 값을 변경 할 수 없기 때문에 오류 처리

    }
}
