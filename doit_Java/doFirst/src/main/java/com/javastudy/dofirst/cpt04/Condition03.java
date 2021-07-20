package com.javastudy.dofirst.cpt04;


// case 문의 중첩
public class Condition03 {
    public static void main(String[] args) {

        int month = 2;
        int day = 0;

        switch (month){
            case 1 : case 3: case 5: day=31;
            break;
            case 2: day=28;
            break;
            case 4: case 6: day=30;
            break;
        }

        /*
        이런 길어지고 중복 되는 코드를 한군데 모을 수 있다.
        switch (month){
            case 1 : day = 31;
            break;

            case 2 : day = 28;
                break;

            case 3 : day = 31;
                break;

            case 4 : day = 30;
                break;

            case 5 : day = 31;
                break;

            case 6 : day = 30;
                break;
        }*/

        System.out.println(day);

    }
}
