/**
 * encapsulation is process of useing private m
 * 
 * means make the the thing hidden
 * 
 * 
 * 
 * acces modifier 
 public can acces ever where 
 private we can use within the class
 no modifier class and package



What is Encapsulation?

Definition:

Encapsulation is the process of wrapping data (variables) and methods (functions) into a single unit (class) and restricting direct access to the data.

In simple words,

Hide the data and allow access only through methods.

Think of it like a capsule.

A medicine capsule contains many ingredients inside, but you cannot access them directly.

Similarly, in Java:

Variables are hidden.
Methods provide controlled access.

Another Example

Think of your mobile phone.

You increase volume by pressing buttons.

You cannot directly change the internal hardware values.

The phone controls everything.


Why do we need Encapsulation?

Without encapsulation:

Anyone can change your data.

Example:

student.age = -100;

This is wrong because age cannot be negative.

Encapsulation prevents this.

Private Variables

The first step of encapsulation is making variables private.

Example

class Student {

    private String name;
    private int age;

}

Now these variables cannot be accessed directly.

Wrong:

Student s = new Student();

s.age = 20;      // Error

Because age is private.

How to Access Private Variables?

Using Getter and Setter methods.

Getter Method

A getter is used to read the value.


class Student {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}

public class Main {

    public static void main(String args[]) {

        Student s = new Student();

        s.setName("Rahul");
        s.setAge(22);

        System.out.println(s.getName());
        System.out.println(s.getAge());

    }

}

Q3. What is a Getter?

A method used to retrieve the value of a private variable

Q4. What is a Setter?

A method used to modify the value of a private variable, often with validation.


 */
