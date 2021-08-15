package com.javastudy.dofirst.cpt07.ObjectArray;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private String bookName;
    private String author;

    public Book(){}  // 가본 생성자

    public Book(String bookName, String author){
        this.bookName = bookName;
        this.author = author;
    }

    public void showBookInfo() {
        System.out.printf("%s, %s", bookName, author);
        System.out.println("");
    }
}
