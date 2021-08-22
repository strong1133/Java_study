package com.javastudy.dofirst.cpt07.arrayList;

import com.javastudy.dofirst.cpt07.ObjectArray.Book;

import java.util.ArrayList; // ArrayList 사용을 위해선 해당 클래스를 임포트해줘야 함.

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> lib = new ArrayList<Book>(); // ArrayList 초기화

        lib.add(new Book("태백산맥", "조정래"));
        lib.add(new Book("드래곤라자", "김영도"));
        lib.add(new Book("탈무드", "홉킨스"));
        lib.add(new Book("어린왕자", "생택쥐베리"));
        lib.add(new Book("코스모스", "베르나르"));

        for (int i =0 ; i < lib.size(); i++){ // ArrayList는 length가 아닌 size 사용
            Book book = lib.get(i); // i에 해당하는 요소를 가져오기 위해 get() 사용
            book.showBookInfo();
        }
        System.out.println();

        System.out.println("향상된 for문");
        for(Book book : lib){
            book.showBookInfo();
        }
    }
}
