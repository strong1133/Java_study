package com.javastudy.dofirst.cpt07.ObjectArray;

public class BookArray {
    public static void main(String[] args) {
        Book[] lib = new Book[5]; // Book 클래스 형으로 객체 배열 생성
        lib[0] = new Book("태백산맥", "조정래");
        lib[1] = new Book("아몬드", "정석진");
        lib[2] = new Book("총균쇠", "정형진");
        lib[3] = new Book("앙기모띠", "양금모");
        lib[4] = new Book("어린왕자", "생택쥐페리");


        for(int i =0; i < lib.length; i++){
           lib[i].showBookInfo();
        }
    }
}
