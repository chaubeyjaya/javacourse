
import java.util.Scanner;

public class intConToString{
/**
 Enter a number
12
1212
 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
      //  String s= Integer.toString(n);
       String s= "";//make empty string
       s+=n;
        System.out.println(s+n);
    }
}