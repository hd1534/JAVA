package org.dimigo.inheritance;

public class Animal_test {
    public static void main(String[] args) {
        Animal a = new Animal("뭔가 동물임");
        Dog d = new Dog("댕댕이");
        Cat c = new Cat("냥이");
        Tiger t = new Tiger("콘푸로스트");

        System.out.println(a);
        a.bark();
        a.eat();
        a.sleep();

        System.out.println(d);
        d.wag();
        d.bark();

        System.out.println(c);
        c.bark();
        c.scratch();

        System.out.println(t);
        t.bark();
        t.hunt();


        // upCasting
        System.out.println();

        Animal d2 = new Dog("뭉멍이");
        Animal c2 = new Cat("냥냥이");
        Animal t2 = new Tiger("콘푸라이트");

        d2.bark();
        c2.bark();
        t2.bark();

        //////////////////////////
        Animal[] animals = {
                new Dog("왈왈이"),
                new Cat("누렁이"),
                new Tiger("호돌이")
        };
        /*
        for (Animal Animal : animals) {
            System.out.println(Animal);
            Animal.eat();
            Animal.bark();
            Animal.sleep();
        }
        */
        for (Animal animal : animals) {
            doBark(animal);
        }

        System.out.println("\n\n\n\n\n\n\n\n\n");

//        Animal a2 = new Dog("야옹이");  강제 형변환은 무조건 원래 객체로만 가능
        Animal a2 = new Cat("야옹이");
        ((Cat) a2).scratch();

//
        Cat cat = (Cat) a2;
        cat.scratch();
//           ||
        ((Cat) a2).scratch();

        System.out.println(d instanceof Dog);
        System.out.println(d instanceof Animal);
        // System.out.println(d instanceof Cat); d는 확실히 Dog 타입이라 Cat인지 확인 x
        System.out.println(d2 instanceof Cat);  // d2는 Animal로 캐스팅 되어있다.
        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Dog);

    }

//    처음거
//    private static void doBark(Animal Animal) {
//        System.out.println(Animal);
//        Animal.eat();
//        Animal.bark();
//        Animal.sleep();
//        System.out.println();
//    }

    private static void doBark(Animal animal) {
        if (animal instanceof Cat)
            ((Cat)animal).scratch();
        else if (animal instanceof Dog)
            ((Dog)animal).wag();
    }
}
