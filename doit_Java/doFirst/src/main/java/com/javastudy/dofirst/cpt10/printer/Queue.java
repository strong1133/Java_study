package com.javastudy.dofirst.cpt10.printer;

public interface Queue {
    void enQueue(String title);
    String deQueue();
    int getSize();
}
