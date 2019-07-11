package org.dimigo.inheritanceNoSuper;

public class Student extends Person {
    private String studentId;

    public Student(String studentId) {
        this.studentId = studentId;
    }

    /*
    public Student(String name, int age, int height, int weight, String studentId) {
        this.name = name; // 접근제어자가 public이라서 가능
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.studentId = studentId;
    }
    */
    public Student(String name, int age, int height, int weight, String studentId) {
        super(name, age, height, weight);
        this.studentId = studentId;
    }

    public void studyAtNight() {
        System.out.println(name + "이/가 야자를 한다.");
    }

    public void rollCall() { //점호
        System.out.println(name + "이/가 점호를 한다.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
