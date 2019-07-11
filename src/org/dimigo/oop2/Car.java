package org.dimigo.oop2;

public class Car {
    // 정적필드
    private static String compony;

    // 인스턴스 필드
    private String name;

    // static block
    static {
        compony = "기아";
        System.out.println("static block 호출");
    }

    public Car(String name) {
        this.name = name;
        System.out.println("constructor 호출");
    }

    public static String getCompony() {
        return compony;
    }

    public static void setCompony(String compony) {
        Car.compony = compony;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + compony + "', " +
                "name='" + name + '\'' +
                '}';
    }
}
