//imp note if we create teh parameterized constructor to normal bina parametrized ke jaise phle object bna rhe thay wo eror dega esliye hm phle default constuctor bnad enge
// public class ConstructorEX {

//     public static class Student {

//         String name;
//         int rollno;
//         Student(){///default constructor

//         }

//         public Student(String n, int r) {
//             name = n;
//             rollno = r;
//         }
//         void print(){
//             System.out.println(name+" "+rollno);
//         }
        
//     }

//     public static void main(String[] args) {
// Student s = new Student("jaya",12);
// s.print();
//     }
// }





// public class ConstructorEX {

//     public static class Student {

//         String name;
//         int rollno;
//         double cgpa;
//         Student(){///default constructor

//         }

//         public Student(String n, int r) {
//             name = n;
//             rollno = r;
//         }
//         public Student(String n, int r,double c) {
//             name = n;
//             rollno = r;
//             cgpa=c;
//         }
//         void print(){
//             System.out.println(name+" "+rollno);
//         }
//          void print1(){
//             System.out.println(name+" "+rollno+" "+cgpa);
//         }
        
//     }

//     public static void main(String[] args) {
// Student s = new Student("jaya",12);
// s.print();
// Student s1 = new Student("jaya",12,9.37);
// s1.print1();
//     }
// }





/**
 * this keyword
 * 
 */
public class ConstructorEX {

    public static class Student {

        String name;
        int rollno;
        double cgpa;
        Student(){///default constructor

        }

        public Student(String n, int r) {
            name = n;
            rollno = r;
        }
        public Student(String name, int rollno,double cgpa) {
            this.name = name;
            this.rollno = rollno;
            this.cgpa=cgpa;
        }
        void print(){
            System.out.println(name+" "+rollno);
        }
         void print1(){
            System.out.println(name+" "+rollno+" "+cgpa);
        }
        
    }

    public static void main(String[] args) {
Student s = new Student("jaya",12);
s.print();
Student s1 = new Student("jaya",12,9.37);
s1.print1();
    }
}
