/*
 smae method name but diffrent parameter 
 in overriding same method in parent and child class we 
 learn in inheritance in oops concept
 */


public class methodOverloading{
    public static void sum(int a){
        System.out.println(a);
    }
     public static void sum(int a,int b){
        System.out.println(a+b);
    }
     public static void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        sum(5);
        sum(2,3);
        sum(1,2,3);
    }

}