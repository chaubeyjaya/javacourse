/**
 final  varibale never chaneg now;
 final will have the box with all varibale

 static variable means sharable

//  */
// class Cricketer{
//  final String country="India";   mtlb ek box hai sbako yhi share hoga without chnages 
//   int runs;
//   String name;
//   double avg;
//  }


// public class finalKeyword{
//     public static void main(String[] args) {
//         Cricketer c = new Cricketer();
//        //  c.country="England";   error
//         System.out.println(c.country);
//     }
// }


/**
 Static :

 */
//static 
class Cricketer{
   static  String country;
  int runs;
  String name;
  double avg;
 }


public class finalKeyword{
    public static void main(String[] args) {
        Cricketer c = new Cricketer();
   Cricketer c1 = new Cricketer();
   c.country="india";
        System.out.println(c.country);
         System.out.println(c1.country);
    }
}


/**
 * 1. final (Restriction keyword)

👉 Used to restrict changes

✔ Where you can use it:
Variable → value cannot change
Method → cannot be overridden
Class → cannot be inherited
Example:
final int x = 10;
x = 20; // ❌ Error
final class A { }
// class B extends A {} ❌ Not allowed



🔹 2. static (Class-level keyword)

👉 Belongs to class, not object

✔ Key points:
Shared by all objects
Can be accessed without creating object






imp to understand the static keywod


Why use static?

Suppose you create 100 students.
...................................................
Without static:

class Student {
    int collegeCode = 101;
}

Every object gets its own copy of collegeCode. many object have many copy


...............................................
With static:

class Student {
    static int collegeCode = 101;
}

Only one copy of collegeCode is created and shared by all objects.

Example:

class Student {
    static int collegeCode = 101;
}

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(Student.collegeCode);
    }
}



that means  multiple object has same college id 
Sure. Think of it this way.

Without static
class Student {
    int collegeCode = 101;
}
Student s1 = new Student();
Student s2 = new Student();
Student s3 = new Student();

Memory looks like:

s1 -> collegeCode = 101
s2 -> collegeCode = 101
s3 -> collegeCode = 101

Each object has its own separate copy of collegeCode.

If you change one:

s1.collegeCode = 200;

Then:

s1 -> collegeCode = 200
s2 -> collegeCode = 101
s3 -> collegeCode = 101

Only s1 changes.
................................................
With static
class Student {
    static int collegeCode = 101;
}
Student s1 = new Student();
Student s2 = new Student();
Student s3 = new Student();

Student Class
    |
    --> collegeCode = 101

All objects use the same variable.

s1 ----|
s2 ----|----> collegeCode = 101
s3 ----|

If you do:

Student.collegeCode = 200;

or

s1.collegeCode = 200;

Then:

s1 ----|
s2 ----|----> collegeCode = 200
s3 ----|

Now everyone sees 200 because there is only one copy.
 */