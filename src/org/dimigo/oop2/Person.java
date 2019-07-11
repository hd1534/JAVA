package org.dimigo.oop2;

public class Person {
    //private final String type = "영장류";
    public static final String TYPE = "영장류";  // 자바에서 상수는 대문자로, static으로 만드는게 보통이다.
    private final String birthDate;
    private String name;

    public Person(String birthDate, String name) {
        this.birthDate = birthDate;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "type='" + TYPE + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("20020202", "홍길둥");
        Person p2 = new Person("10010101", "홍길뒁");
        System.out.println(p1);
        System.out.println(p2);

        // Person.TYPE = "파충류";
    }
}
