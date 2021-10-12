package com.javastudy.dofirst.cpt11.object;

class Book {
    int bookNumber;
    String bookTitle;

    Book(int bookNumber, String bookTitle){
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

    // Object 클래스에 기본적으로 있는 toString 오버라이딩
    // 기본적으로 sout는 toString()을 호출한다.
    @Override
    public String toString(){
     return bookTitle + ": " + bookNumber;
    }
}

public class ToStringEx{
    public static void main(String[] args) {
        Book book1 = new Book(10001, "모나드의 영역");
        System.out.println(book1);
        System.out.println(book1.toString());
    }
}