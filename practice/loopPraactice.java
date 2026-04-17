
// public class loopPraactice{
//     public static void main(String[] args) {
//         int n=10;
//         int a=2;int d=4;
//  for(int i=2;i<=n;i++){
//     System.out.print(a +" ");
//     a+=d;
//  }
//     }
// }

//2)largest digit in number
// public class loopPraactice {

//     public static void main(String[] args) {
//         int n = 706;
//         int max = 0;
//         while (n != 0) {
//             int temp = n % 10;
//             if (temp > max) {
//                 max = temp;
//             }
//             n = n / 10;

//         }
//          System.out.println (max);
// }
//     }

//count odd and even 
// class loopPraactice{
//     public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
//      int n=sc.nextInt();
//      int even=0;
//      int odd=0;
//      for(int i=1;i<=n;i++){
//         int temp=n%10;
//         if(temp % 2==0){
            
//             even++;
//         }else{
        
//             odd++;

//         }
//         n=n/10;
//      }
//      System.out.println(even);
//      System.out.println(odd);

//     }
// }

//Print all factors of a number
// class loopPraactice{
//     public static void main(String[] args) {
// int n=12;
// for(int i=1;i<=n;i++){
//     if(n%i==0){
//         System.out.print(i+ " ");
//     }
// }
//     }
// }


//Print Fibonacci series up to n terms
//whne n=7 this is op:0 1 1 2 3 5 8
// class loopPraactice{
//     public static void main(String[] args) {
//         int n=7;
//         int a=0;
//         int b=1;
//         for (int i=0;i<n;i++){
//             System.out.print(a+" ");
//             int next=a+b;
//             a=b;
//             b=next;
   
//         }
//     }
// }


//Count frequency of each digit in a number
// class loopPraactice {
//     public static void main(String[] args) {
//         int n = 1265214;
//         int temp = n;                 // store original number
//         int feq[] = new int[10];

//         while(temp != 0) {
//             int digit = temp % 10;
//             feq[digit]++;
//             temp = temp / 10;
//         }

//         System.out.println("frequency of digit:");
//         for(int i = 0; i < 10; i++) {   // loop from 0 to 9
//             if(feq[i] > 0) {
//                 System.out.println(i + " -> " + feq[i]);
//             }
//         }
//     }
// }


/**find the duplicate digit
 * public class DuplicateDigits {
    public static void main(String[] args) {
        int n = 122334;
        int freq[] = new int[10];

        // count frequency
        while(n != 0) {
            int digit = n % 10;
            freq[digit]++;
            n = n / 10;
        }

        System.out.println("Duplicate digits are:");
        for(int i = 0; i < 10; i++) {
            if(freq[i] > 1) {
                System.out.println(i);
            }
        }
    }
}
 */


// Check if number is Neon Number
// Square of number → sum of digits = number
// Example:
// 9 → 81 → 8+1 = 9
/**
 * import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int square = n * n;
        int sum = 0;

        while(square != 0) {
            int digit = square % 10;
            sum += digit;
            square = square / 10;
        }

        if(sum == n) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not a Neon Number");
        }
    }
}
 */


class loopPraactice{
    public static void main(String[] args) {
        int n =9;
        int square=n*n;      //81=8+1=9
        int sum=0;
        while(square!=0){ //81
            int temp=square%10;
            sum+=temp;
            square=square/10;
        }
        if(n==sum){
            System.out.println("yes ");
        }else{
            System.out.println("no");
        }
    }
}