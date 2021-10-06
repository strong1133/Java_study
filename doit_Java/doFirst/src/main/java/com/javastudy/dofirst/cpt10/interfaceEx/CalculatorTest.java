package com.javastudy.dofirst.cpt10.interfaceEx;

public class CalculatorTest {
    public static void main(String[] args) {
        int num = 10;
        int num2 = 5;

        CompleteCalc completeCalc = new CompleteCalc();

        System.out.println(completeCalc.add(1,2));
        System.out.println(completeCalc.sub(5,2));
        System.out.println(completeCalc.times(11,23));
        System.out.println(completeCalc.divide(4,2));
        completeCalc.ShowInfo();
        completeCalc.description();

        Calc calc = new CompleteCalc();

        System.out.println( calc.add(1,2));
        System.out.println( calc.sub(1,2));
        System.out.println(calc.times(2,3));
        System.out.println(calc.divide(3,0));

        // 정적 매서드 사용
        int [] arr = {1,2,3,4,5};
        System.out.println(Calc.total(arr));




    }
}
