package com.javastudy.dofirst.cpt04;

// 별찍기 - 피라미드
public class Loop03 {
    public static void main(String[] args) {

        int floor = 5;

        /*
        for(int i = 0; i<floor; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }*/

        for(int i = 0; i<floor; i++){
            for (int j = 1; j<floor-i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k<i*2+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = floor-1; i>0; i--){
            for (int j = floor-1; j>=i; j--){
                System.out.print(" ");
            }
            for (int k=1; k <= i*2-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
