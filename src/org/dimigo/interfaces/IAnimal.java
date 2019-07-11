package org.dimigo.interfaces;


//    모든 인터페이스는 접근 제어자가 public 이다
public interface IAnimal {
//     인터페이스의 필드는 상수이다.
//    public static final이 자동으로 붙는다.
    String FARM_NAME = "디미 동물 농장";
    public static final String FARM_LOCATION = "디미";

//     인터페이스의 메소드는 추상이다.
//     public abstract가 자동으로 붙는다.
//    public abstract void eat();
//    abstract void sleep();
    void bark();


//    JDK 8 이상부터 default 메소드를 인터페이스에 쓸 수 있다.
    public default void eat() {
        System.out.println("냠");
    }

    public default void sleep() {
        System.out.println("Zzz");
    }

//    JDK 8 이상부터 default 메소드를 인터페이스에 쓸 수 있다.
    public static void hello() {
        System.out.println("디미 동물농장에 온걸 환영합니다. ");
    }
}