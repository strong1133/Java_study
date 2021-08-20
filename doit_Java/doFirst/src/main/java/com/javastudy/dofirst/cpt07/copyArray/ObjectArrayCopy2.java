package com.javastudy.dofirst.cpt07.copyArray;

import com.javastudy.dofirst.cpt07.ObjectArray.Book;

/*
* 객체 배열 복사 - 깊은 복사
* */
public class ObjectArrayCopy2 {

    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("태백산맥", "조정래");
        bookArray1[1] = new Book("아몬드", "정석진");
        bookArray1[2] = new Book("총균쇠", "정형진");

        // bookArray2 의 인스턴스 요소를 새로 생성 해줌
        bookArray2[0] = new Book();
        bookArray2[1] = new Book();
        bookArray2[2] = new Book();

        for(int i =0; i<bookArray2.length; i++){
            bookArray2[i].setBookName(bookArray1[i].getBookName());
            bookArray2[i].setAuthor(bookArray1[i].getAuthor());
        }

        for(int i =0; i<bookArray2.length; i++){
            bookArray2[i].showBookInfo();
        }
        // 변경 작업
        bookArray1[1].setBookName("돌이킬 수 없는 약속");
        bookArray1[2].setAuthor("홍슬기");

        System.out.println("Arr1");
        for(int i =0; i<bookArray1.length; i++){
            bookArray1[i].showBookInfo();
        }
        System.out.println();
        System.out.println("Arr2");
        for(int i =0; i<bookArray2.length; i++){
            bookArray2[i].showBookInfo();
        }


    }
}
