package com.javastudy.dofirst.cpt04;

// 구구단 짝수단
public class Loop02 {
    public static void main(String[] args) {
        int ans = 0;
        for(int i = 2; i<=9; i++){
            if (i % 2 != 0) {
                continue;
            }
            for (int j=1; j<=9; j++){
                System.out.printf("%d * %d = %d \n", i,j,i*j);
            }
            System.out.println(" ");
        }
    }
}
