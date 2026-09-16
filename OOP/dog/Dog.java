package OOP.dog; 

public class Dog {
    // 1. Write your properties here. 
    public String name; 
    public String breed;
    public String color;
    // add more properties below

    // 2. Fill in the constructor below so that the dog's name is correctly set
    public Dog(String dogName, String dogBreed, String dogColor) {
        this.name = dogName; 
        // add more initializers below
        this.breed = dogBreed;
        this.color = dogColor;
    }

    // 3. Write your methods here. 
    public void bark() {
        // Add print statement to bark!
        System.out.println("Borf Borf!");
    }

}