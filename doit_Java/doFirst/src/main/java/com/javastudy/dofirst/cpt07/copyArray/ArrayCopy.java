package com.javastudy.dofirst.cpt07.copyArray;


import java.util.Arrays;

/*
* 배열 복사
* */
public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {10,20,30,40,50};

        System.arraycopy( arr2, 0, arr1 , 2, 3);
        // arr1의 2번째부터를 arr2의 0번째 부터 3개로 바꿈
        // arr1 = [1, 2, 10, 20, 30]

        System.out.println(Arrays.toString(arr1));
    }

}
