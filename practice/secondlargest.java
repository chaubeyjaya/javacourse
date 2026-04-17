import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int second;

        if ((a > b && a < c) || (a > c && a < b)) {
            second = a;
        } 
        else if ((b > a && b < c) || (b > c && b < a)) {
            second = b;
        } 
        else {
            second = c;
        }

        System.out.println("Second largest number is: " + second);
    }
}