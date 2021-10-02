package com.javastudy.dofirst.cpt08.polymorphism;

import java.util.ArrayList;

public class AnimalTest2 {

    // 클래스 관리를 위한 클래스형 배열 생성
    ArrayList<Animal> animalArrayList = new ArrayList<Animal>();


    public static void main(String[] args) {
        AnimalTest2 aTest = new AnimalTest2();
        aTest.addAnimal();
        aTest.downCasting();
    }

    // animalArrayList 에 인스턴스를 Animal형으로 형 변환 하며 추가, 하나씩 꺼내서 move 매서드 호출 -> 오버라이딩
    public void addAnimal(){
        animalArrayList.add(new Human());
        animalArrayList.add(new Tiger());
        animalArrayList.add(new Eagle());

        for(Animal animal : animalArrayList){
            animal.move();
        }
    }

    // 다운캐스팅
    // VIP와 다른점은 VIP의 경우 Customer에 정의된 매서드를 오바라이딩 하여 쓰는 방식 이었지만.
    // 이 경우는 각 인스턴스 형 별로 별도의 매서드 들이 있기 때문에 오버라이딩 불가. 따라서 다운캐스팅을 한것.
    public void downCasting(){
        for (Animal animal : animalArrayList){
            if(animal instanceof Human){
                Human h = (Human) animal;
                h.readBook();
            }
            if(animal instanceof Tiger){
                Tiger t= (Tiger) animal;
                t.hunting();
            }
            if(animal instanceof Eagle){
                Eagle e= (Eagle) animal;
                e.flying();
            }
        }
    }

}
