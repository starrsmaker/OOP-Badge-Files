package OOP.oop;

import OOP.oop.Animal;

public class Cat extends Animal {
    // 1. Complete your Cat class:
    //    - Add the properties "name" and "age"

    //    - Add a constructor that initializes both properties
    public Cat(String name, int age) {
        super(name,age);
    }

    //    - Add a makeSound() method that prints "meow"
    public void makeSound() {
        System.out.println("Meow!");
    }
}