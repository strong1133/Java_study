package com.javastudy.dofirst.cpt04;


// if vs switch case
public class Condition02 {
    public static void main(String[] args) {

        int rank = 5;

        /*
        if (rank == 1){
            System.out.println(1);
        }else if (rank == 2){
            System.out.println(2);
        }
        else if (rank == 3){
            System.out.println(3);
        }
        else if (rank == 4){
            System.out.println(4);
        }else {
            System.out.println("측정불가");
        }
        */

        switch (rank){
            case 1 :
                System.out.println(1);
                break;
            case 2 :
                System.out.println(2);
                break;
            case 3 :
                System.out.println(3);
                break;
            case 4 :
                System.out.println(4);
                break;
            default:
                System.out.println("측정불가");
        }

    }
}
