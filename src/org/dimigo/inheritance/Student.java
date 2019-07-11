package org.dimigo.inheritance;

public class Student extends Person {
    private String studentId;

    public Student(String studentId) {
        this.studentId = studentId;
        System.out.println("자식객체 생성");
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
        super(name, age, height, weight);  // 부모객체가 먼저 생성이 되야하므로 super가 먼저 있어야 됨.
        // 만약 부모의 기본 생성자를 명시하지 않은경우 컴파일러가 자동으로 suepr()를 즉, 부모의 기본 생성자를 추가한다.
        this.studentId = studentId;
        System.out.println("자식객체 생성");
    }

    public void studyAtNight() {
        System.out.println(getName() + "이/가 야자를 한다.");
    }

    public void rollCall() { //점호
        System.out.println(getName() + "이/가 점호를 한다.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + "', " +
                super.toString() + '}';
    }
}
