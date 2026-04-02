/**
 * 1. Abstract Class in Java

👉 An abstract class is a class that:

Cannot be instantiated (no object directly)
Can have:
Abstract methods (no body)
Normal methods (with body)
Variables + constructors
✅ Example of Abstract Class
abstract class Animal {
    
    // abstract method (no body)
    abstract void sound();

    // normal method
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    
    // must override abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.eat();
    }
}
💡 Explanation:
Animal is abstract → cannot create object
sound() must be implemented by child class
eat() is already defined → reused directly
Dog provides implementation of sound()
🔷 2. Interface in Java

👉 An interface is a blueprint of a class:

All methods are by default abstract (Java 7)
Variables are public static final
Supports multiple inheritance
✅ Example of Interface
interface Animal {
    void sound();  // abstract method
}

class Dog implements Animal {
    
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
              d.sound();
    }
}
 */