public class Basic{
//student is class class is blue print
public static  class Student{
 String name;
 int rollno;
 double cgpa;
}

    public static void main(String[] args) {
        Student s = new Student(); //s is here object
        s.name="jaya";
        s.rollno=9210;
        s.cgpa=9.37;
System.out.println( s.name);
System.out.println( s.rollno);
System.out.println( s.cgpa);
    }
}