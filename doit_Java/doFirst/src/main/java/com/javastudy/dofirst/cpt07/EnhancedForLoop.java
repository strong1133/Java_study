package com.javastudy.dofirst.cpt07;

import java.util.Arrays;

public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] strArr = {"java", "C", "Node", "JS", "React"};


        // 일반적인 for
        for(int i =0; i<strArr.length; i++){
            System.out.println(strArr[i]);
        }

        //향상된 for
        for(String lang : strArr){
            System.out.println(lang);
        }

        //또다른 방법
        System.out.println(Arrays.toString(strArr));
    }
}
