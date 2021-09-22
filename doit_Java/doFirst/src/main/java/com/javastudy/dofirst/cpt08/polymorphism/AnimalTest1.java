package com.javastudy.dofirst.cpt08.polymorphism;

class Animal {
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    public void move(){
        System.out.println("사람이 움직입니다.");
    }
}

class Tiger extends Animal {
    public void move(){
        System.out.println("호랑이가 움직입니다.");
    }
}

class Eagle extends Animal {
    public void move(){
        System.out.println("독수리가 움직입니다.");
    }
}

public class AnimalTest1{
    public static void main(String[] args) {
        AnimalTest1 animalTest1 = new AnimalTest1();
        animalTest1.moveAnimal(new Human());
        animalTest1.moveAnimal(new Tiger());
        animalTest1.moveAnimal(new Eagle());
        animalTest1.moveAnimal(new Animal());
    }

    public void moveAnimal(Animal animal){
        animal.move();
    }
}

