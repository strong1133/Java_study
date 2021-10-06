package com.javastudy.dofirst.cpt10.interfaceEx;

public interface Calc {
    // 인터페이스에서 선언한 맴버변수는 컴파일 시 상수로 인식됨.
    double PI = 3.14;
    int ERROR = -99999999;

    // 인터페이스 의 매서드는 모두 추상메서드 이다.
    int add(int num1, int num2);
    int sub(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    // 디폴트 매서드
    default void description(){
        System.out.println("계산기를 구현합니다.");
    }

    //정적 메서드
    static int total(int[] arr){
        int total = 0;

        for(int i : arr){
            total += i;
        }
        return total;
    }


}
