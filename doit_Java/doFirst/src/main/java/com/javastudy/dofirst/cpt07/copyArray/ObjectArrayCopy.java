package com.javastudy.dofirst.cpt07.copyArray;


import com.javastudy.dofirst.cpt07.ObjectArray.Book;

import java.util.Arrays;

/*
* 객체 배열 복사
* */
public class ObjectArrayCopy {

    public static void main(String[] args) {
        Book [] bookArr1 = new Book[3];
        Book [] bookArr2 = new Book[3];

        bookArr1[0] = new Book("태백산맥", "조정래");
        bookArr1[1] = new Book("아몬드", "정석진");
        bookArr1[2] = new Book("총균쇠", "정형진");

        System.arraycopy(bookArr1, 0, bookArr2,0, 3);

        System.out.println("=== 변경 전 ===");
        for(int i =0; i<bookArr2.length; i++){
            bookArr2[i].showBookInfo();
            /*
            태백산맥, 조정래
            아몬드, 정석진
            총균쇠, 정형진
            */
        }

        // 얕은 복사
        // bookArr1 의 값만 변경
        bookArr1[0].setBookName("돌이킬수 없는 약속");
        bookArr1[1].setAuthor("홍슬기");

        System.out.println("=== 얕은 복사 ===");
        for(int i =0; i<bookArr2.length; i++){
            bookArr2[i].showBookInfo();
            /*
            돌이킬수 없는 약속, 조정래
            아몬드, 홍슬기
            총균쇠, 정형진
            */
        }


    }
}
