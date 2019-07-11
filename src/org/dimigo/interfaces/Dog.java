package org.dimigo.interfaces;

public class Dog implements IAnimal {

//    @Override
//    public void eat() {
//        System.out.println("냠");
//    }
//
//    @Override
//    public void sleep() {
//        System.out.println("Zzz");
//    }

    @Override
    public void bark() {
        System.out.println("왈왈왈");
    }

    public void wag() {
        System.out.println("살랑살랑");
    }
}
