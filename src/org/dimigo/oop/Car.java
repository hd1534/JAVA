package org.dimigo.oop;  //페키지 이름은 도메인의 역순을 많이 쓴다.

import java.util.*;
// import java.lang.  이것들은 자동 import된다

public class Car {

    public Car() {
    }

    private int horsepower;

    private int maxspeed;

    private long price;

    private double fuelefficiency;

    private String company;

    public void foward() {
        System.out.println("앞으로");
    }

    public void backward() {
        System.out.println("뒤로");
    }

    public boolean stop() {
        System.out.println("정지");
        return true;
    }

    public void turnright(int angle) {
        System.out.println(angle + "도 우회전");
    }

    public void turnleft(int angle) {
        System.out.println(angle + "도 좌회전");
        
    }

}