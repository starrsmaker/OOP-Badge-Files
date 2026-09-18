package OOP.oop;

import OOP.oop.Animal;

public class Runner {
    public static void main(String[] args) {

        Animal[] animals = {new Cat("AsteroidDestroyer", 2), new Dog("Princess",23), new Bird("AnkleBiter", 3)};

        for (int i = 0; i < 3; i++) {
            animals[i].makeSound();
            animals[i].describe();
        }

    }
}
