package com.javastudy.dofirst.cpt10.bookShelf;

public class BookShelfTest {
    public static void main(String[] args) {
        BookShelf shelfQueue = new BookShelf();
//        Queue shelfQueue = new BookShelf();
        shelfQueue.enQueue("태백산맥");
        shelfQueue.enQueue("금수강산");
        shelfQueue.enQueue("믹키유천");
        shelfQueue.enQueue("영웅재웅");


        while (0<shelfQueue.getSize()){
            System.out.println(shelfQueue.getSize());
            System.out.println(shelfQueue.deQueue());
        }

    }
}
