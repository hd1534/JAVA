package org.dimigo.inheritance;

public class Teacher extends Person{

    private String subject;

    public Teacher(String name, int age, int height, int weight, String subject) {
        super(name, age, height, weight);
        this.subject = subject;
        System.out.println("자식객체 생성");
    }

    /*
    public Teacher(String name, int age, int height, int weight, String subject) {
        this.name = name; // 접근제어자가 public이라서 가능
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.subject = subject;
    }
    */

    public void teach() {
        System.out.println(getName() + "쌤이 가르친다.");
    }

    public void doTesk() {
        System.out.println(getName() + "쌤이 일을 한다.");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + "', " +
                super.toString() + '}';
    }
}
