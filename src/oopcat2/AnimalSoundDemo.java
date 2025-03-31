package oopcat2;

// Superclass with a method to be overridden
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass overriding the method from Animal class
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass overriding the method from Animal class
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

// The main class where the program starts
public class AnimalSoundDemo {
    public static void main(String[] args) {
        // Creating objects of Animal, Dog, and Cat
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling overridden methods
        myAnimal.makeSound(); // Calls Animal version
        myDog.makeSound(); // Calls Dog version
        myCat.makeSound(); // Calls Cat version
    }
}
