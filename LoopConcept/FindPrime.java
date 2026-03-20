// public class FindPrime {
//     public static void main(String[] args) {

//         for (int i = 2; i <= 25; i++) {

//             boolean isPrime = true;

//             for (int j = 2; j < i; j++) {
//                 if (i % j == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }

//             if (isPrime) {
//                 System.out.println(i);
//             }
//         }
//     }
// }







public class FindPrime {
    public static void main(String[] args) {

        int n = 12;
        boolean isPrime = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("no prime");
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("yes prime");
        }
    }
}