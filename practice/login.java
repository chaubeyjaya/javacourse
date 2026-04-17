
import java.util.Scanner;

public class login{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("enetr the password: ");
        int pass=sc.nextInt();
        System.out.print("enter the correct name :  ");
        String name=sc.next();
        int cp=1234;
        String n="admin";
        if(pass==cp && name.equals(n)){
            System.out.println("you ar elogin successfully");
        }else{
            System.out.println("incorrect try again");
        }
    }
}