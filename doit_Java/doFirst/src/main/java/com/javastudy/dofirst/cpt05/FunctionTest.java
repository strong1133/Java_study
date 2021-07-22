package com.javastudy.dofirst.cpt05;

public class FunctionTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int sum = add(num1,num2); // add() 함수를 호출하면서 num1,num2를 매개변수로 전달
        // 결과를 sum 변수에 초기화
        System.out.printf("%d + %d = %d", num1, num2, sum);
    }

    // add()함수 선언, 반환형 int
    public static int add(int a, int b){
        return a + b; // 매개변수로 입력받은 a,b를 더한 값을 반환
    }
}
