

/**
 Question :take positive integer input and tell if they can
 be the sides of a triangle or not

 concept the sum of two side shoulde be greater than thirsd one
 */

public class Triangle{
    public static void main(String[] args) {
        int a =3;
        int b = 4;
        int c = 5;
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("yes its is triangle side");
        }else{
            System.out.println("No");
        }
    }
}