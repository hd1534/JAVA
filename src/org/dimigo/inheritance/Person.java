package org.dimigo.inheritance;

public class Person {
    /*
       public String name;  +
       protected int age;   #
       int height;          ~
       private weight;      -
     */
    private String name;
    private int age, height, weight;

    public Person(){
        System.out.println("부모객체 생성");
    }

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        System.out.println("부모객체 생성");
    }

    public void eat(){
        System.out.println(name + "이/가 밥을 먹는다.");
    }

    public void sleep(){
        System.out.println((name + "이/가 잠을 잔다."));
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
