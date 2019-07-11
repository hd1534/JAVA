package org.dimigo.oop2;

public class CarTest {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("제네시스"),
                new Car("펠리세이드"),
                new Car("그랜져")
        };
        //Car.setCompony("현대");
        //cars[0].setCompony("현대");

        for (Car car: cars){
            System.out.println(car);
        }

        System.out.println(Math.abs(-123));
    }
}
