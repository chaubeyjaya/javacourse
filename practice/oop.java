
import java.util.Scanner;

class student{
    int rollno;
    String name;
student(String n ,int r){
    this.name=n;
    this.rollno=r;
}
    void print(){
        System.out.println(name+" "+rollno);
    }
}
public class oop{
    public static void add(int a,int b){
        System.out.println(a+b);
    }
   public static  void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int r=sc.nextInt();
        student s = new student(n,r);
       s.print();
       add(12,12);
       add(1,1,1);

    }
}