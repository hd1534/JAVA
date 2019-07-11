package org.dimigo.interfaces;

public class AnimalTest  {
    public static void main(String[] args) {
        System.out.println(IAnimal.FARM_NAME);
        IAnimal[] animals = {
                new Dog(), new Cat()
        };

        for (IAnimal animal : animals) {
            animal.eat();
            animal.sleep();
            animal.bark();
            if (animal instanceof Dog)
                ((Dog)animal).wag();
        }
    }
}
