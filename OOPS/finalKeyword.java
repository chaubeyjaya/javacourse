/**
 final  varibale never haneg now;
 final will have the box with all varibale

 static variable means sharable

//  */
// class Cricketer{
//    final String country="India";
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