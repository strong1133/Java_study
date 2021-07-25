package com.javastudy.dofirst.cpt06;

class Birthday {
    int day;
    int month;
    int year;

    public void setYear(int year){
        this.year = year;
    }

    public void showThis(){
        System.out.println(this);
    }

}

public class ThisExample{
    public static void main(String[] args) {
        Birthday bDay = new Birthday();
        bDay.setYear(1996);
        System.out.println(bDay);
        bDay.showThis();
    }
}