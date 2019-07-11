package org.dimigo.abstractclass;

public class AnimalTest{
    public static void main(String[] args) {
        // Animal a = new Animal(); 추상클래스는 객체 생성 x
        Animal[] animals = {
                new Duck(), new Pig(), new Cow()
        };
        Wolf wolf = new Wolf();

        System.out.println("=== 평온한 동물농장 ===");
        for (Animal animal : animals) {
            animal.eat();
        }

        System.out.println("=== 늑대가 나타났다 ===");
        for (Animal animal : animals) {
            animal.bark();
            wolf.eat();
        }
    }

}
