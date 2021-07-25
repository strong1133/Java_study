package com.javastudy.dofirst.cpt06;

class Person{
    String name;
    int age;

    Person(){
        this("이름없음",14);  // => Person(String name, int age) 생성자 호출
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    Person returnItSelf(){
        return this; // Person 클래스형으로 this 반환
    }

    public void setName(String name){
        this.name = name;
    }
}

public class CallAnotherCont {
    public static void main(String[] args) {
        Person noName = new Person();

        System.out.println(noName.name);
        System.out.println(noName.age);

        Person p = noName.returnItSelf();  // this 반환으로 인해 noname 자기 자신이 반환되어 대입된다.

        System.out.println("p: " + p);
        System.out.println("noname: " + noName);
        // 따라서 두개의 주소값은 똑같다.

        System.out.println("===============================");

        p.setName("정석진");
        System.out.println("p.name: " + p.name);
        System.out.println("noname.name: " + noName.name);
    }

}
