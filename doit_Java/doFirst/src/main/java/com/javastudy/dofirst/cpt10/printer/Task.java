package com.javastudy.dofirst.cpt10.printer;

import lombok.Getter;

import java.util.ArrayList;


@Getter
public class Task {
    protected ArrayList<String> task;

    public Task(){
        task = new ArrayList<String>();
    }

    public int getCount (){
        return task.size();
    }

    public void add(String title) {
        task.add(title);
    }

    public String remove() {
        return task.remove(0);
    }
}
