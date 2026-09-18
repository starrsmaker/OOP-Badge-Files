package OOP.oop;

import OOP.oop.Animal;

public class Dog extends Animal{
    // 2. Complete your Dog class:
    //    - Add the properties "name" and "age"
    //    - Add a constructor that initializes both properties
    public Dog(String name, int age) {
        super(name, age);
    }

    //    - Add a makeSound() method that prints "bark"
    public void makeSound() {
        System.out.println("Bark bark!");
    }
}