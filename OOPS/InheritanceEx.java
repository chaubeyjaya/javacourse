
// public class InheritanceEx{
//     public static void main(String[] args) {
        
//     }
// }


/**
 1. Single Inheritance

👉 One child class inherits one parent class

✅ Example:
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // inherited
        d.bark();  // own method
    }
}
💡 Explanation:
Dog inherits Animal
Can use both eat() and bark()
🔹 2. Multilevel Inheritance

👉 Chain of inheritance (Grandparent → Parent → Child)

✅ Example:
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

public class Main {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}
💡 Explanation:
Puppy gets features of both Dog and Animal

🔹 3. Hierarchical Inheritance

👉 One parent, multiple child classes

✅ Example:
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
💡 Explanation:
Both Dog and Cat inherit from Animal

🔹 4. Multiple Inheritance (NOT supported with classes ❌)

👉 One child inheriting multiple parents

Java does NOT allow this with classes (to avoid ambiguity problem).

❌ Not Allowed:
class A {}
class B {}
class C extends A, B {} // ERROR
✅ Achieved using Interfaces ✔️
interface A {
    void show();
}

interface B {
    void display();
}

class C implements A, B {
    public void show() {
        System.out.println("From A");
    }

    public void display() {
        System.out.println("From B");
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.display();
    }
}
💡 Explanation:
Java allows multiple inheritance using interfaces
🔹 5. Hybrid Inheritance

👉 Combination of different inheritance types

Java does NOT support hybrid with classes directly, but can be done using interfaces.

✅ Example:
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

interface Pet {
    void play();
}

class Dog extends Animal implements Pet {
    public void play() {
        System.out.println("Dog plays");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}
 */