package com.javastudy.dofirst.cpt02;

public class ImplicitConversion {
    // 묵시적
//    public static void main(String[] args) {
//        byte bnum = 10;
//        int inum = bnum; // byte 보다 int 가 더 크고 정밀하기 때문에 묵시적 형변환 수행
//
//        System.out.println("bnum: " + bnum );
//        System.out.println("inum: " + inum );
//
//    }

    //명시적
    public static void main(String[] args) {
        int inum = 1000;
        byte bnum = (byte) inum; // int -> byte 는 데이터의 손실이 발생할수 있기 때문에 명시적으로 (byte) 으로 변환할것임을 명시

        System.out.println("bnum: " + bnum ); // 1000이 byte의 표현 범위를 벗어나기 때문에 손실된 -24출력
        System.out.println("inum: " + inum );

    }
}
