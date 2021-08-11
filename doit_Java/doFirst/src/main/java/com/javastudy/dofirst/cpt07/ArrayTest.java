package com.javastudy.dofirst.cpt07;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {

        int[] num01 = new int[]{1,2,3,4,5,6,7,8,9,10};

        // 길이가 3으로 선언되었지만 값을 한개만 넣은 경우 나머지는 길이만큼 0으로 채워진다.
        int[] num02 = new int[3];
        num02[0] = 1;

        System.out.println(Arrays.toString(num01)); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(Arrays.toString(num02)); //[1, 0, 0]

        // num01의 모든 요소 더하기
        // 모든 요소에 접근하기 위해 for반복문 사용
        int sum = 0, sum02 = 0;

        for(int i =0; i<=num01.length; i++){
            sum += i; // <= 으로 55
            // sum02+=num01[i]; <인경우로 55

        }
        System.out.println(sum);

    }
}
