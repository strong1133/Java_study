package com.javastudy.dofirst.cpt09.abstractEx;

public class DeskTop extends Computer {

    @Override
    public void display(){
        System.out.println("DeskTop display()");
    }

    @Override
    public void typing(){
        System.out.println("DeskTop typing()");
    }
}
