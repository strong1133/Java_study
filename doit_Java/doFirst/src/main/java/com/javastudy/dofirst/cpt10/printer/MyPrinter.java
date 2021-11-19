package com.javastudy.dofirst.cpt10.printer;

public class MyPrinter extends Printer implements Queue{

    Task task = new Task();

    @Override
    public void enQueue(String title) {
        task.add(title);
    }

    @Override
    public String deQueue() {
        return task.remove();
    }

    @Override
    public int getSize() {
        return task.getCount();
    }
}
