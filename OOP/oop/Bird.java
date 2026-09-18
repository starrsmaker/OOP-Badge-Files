package OOP.oop;

import OOP.oop.Animal;

public class Bird extends Animal{

    public Bird(String name, int age) {
        super(name, age);
    }

    public void makeSound () {
        System.out.println("Cheep! Chirp!");
    }
    
}
