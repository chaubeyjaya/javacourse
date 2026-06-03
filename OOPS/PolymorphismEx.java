
/**
 * ek name multi kaam ;
 * plymorphism =many form
 * 
 * Two main types:

Method Overloading → Compile-time
Method Overriding → Run-time
 */
public class PolymorphismEx {

    public static class Dog {

        void speak() {
            System.out.println("bho bho");
        }
    }

    public static class Cat {

        void speak() {
            System.out.println("moiww");
        }
    }

    public static class Lion {

        void speak() {
            System.out.println("GRRRRRR");
        }
    }

    public static class Human {

        void speak() {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        Lion l = new Lion();
        Human h = new Human();
        h.speak();
        c.speak();
        d.speak();
        l.speak();

    }
}


/**method overriding
 * class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound(); // Parent class method call both data will print if we remove this so only child wala print hoga
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


