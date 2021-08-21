package com.javastudy.dofirst.cpt07.multipleArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoDimension {
    public static void main(String[] args) {
        int[][] arr1 =  {{1,2,3},{4,5,6}};

        for (int i =0; i< arr1.length; i++){ // 행길이
            for(int j=0; j < arr1[i].length ; j++ ){ //열길이
                System.out.println(arr1[i][j]);
            }
        }
        System.out.println(Arrays.deepToString(arr1)); // 이렇게도 가능
    }
}
