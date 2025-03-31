package oopcat2;

// Abstract class Appliance
abstract class Appliance {
    // Abstract method to be implemented by subclasses
    abstract void turnOn();
}

// Subclass Fan implementing turnOn()
class Fan extends Appliance {
    @Override
    void turnOn() {
        System.out.println("Fan is now spinning.");
    }
}

// Subclass TV implementing turnOn()
class TV extends Appliance {
    @Override
    void turnOn() {
        System.out.println("TV is now displaying channels.");
    }
}

// Main class
public class ApplianceDemo {
    public static void main(String[] args) {
        // Creating objects of Fan and TV
        Appliance myFan = new Fan();
        Appliance myTV = new TV();

        // Demonstrating abstraction by calling turnOn()
        myFan.turnOn();
        myTV.turnOn();
    }
}
