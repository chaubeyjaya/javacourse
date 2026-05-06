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
Memory efficient
Example:
class Test {
    static int count = 0;
}

System.out.println(Test.count); // no object needed
 */