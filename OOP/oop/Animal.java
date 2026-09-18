package OOP.oop;

public class Animal {
    // 3. Complete your Animal class:
    //    - Look at what properties & methods are shared between Cat.java and Dog.java. Add them in here
    //    - Add a constructor that initializes each property
    private String name;
    private int age;     

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {

    }

    public void describe() {
        System.out.println("Hi! My name is " + this.name + " and I'm " + this.age + ". Don't ask why I can speak.");
    }

    public String getName() {
        return name;
    }

    public void animalName(String animalName) {
        this.name = animalName;
    }

    public int getAge() {
        return age;
    }
    
    public void animalAge(int animalAge) {
        this.age = animalAge;
    }

}