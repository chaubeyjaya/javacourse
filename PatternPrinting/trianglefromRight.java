//       * 
//     * *
//   * * *
// * * * *

// public class trianglefromRight{
//   public static void main(String[] args) {
//       int n = 4;
//       for(int i = 1;i<=n;i++){
// for(int j =1;j<=n;j++){
//     if((i+j)>n) System.out.print("* ");
//     else System.out.print("  ");
// }
// System.out.println("");
//       }
//   }
// }
//         * 
//       * *
//     * * *
//   * * * *
//method 2  ek loop ke andr do loop its imp above wala shi hai but this one imp refer this only
// public class trianglefromRight{
//   public static void main(String[] args) {
//       int n = 4;
//       for(int i = 1;i<=n;i++){
// for(int j =1;j<=n-i;j++){         
//    System.out.print("  ");
// }
// for(int j =1;j<=i;j++){
//     System.out.print("*" +" ");
// }
// System.out.println("");
//       }
//   }
// }
//       1 
//     1 2 
//   1 2 3 
// 1 2 3 4
// public class trianglefromRight{
//   public static void main(String[] args) {
//       int n = 4;
//       for(int i = 1;i<=n;i++){
// for(int j =1;j<=n-i;j++){         
//    System.out.print("  ");
// }
// for(int j =1;j<=i;j++){
//     System.out.print(j +" ");
// }
// System.out.println("");
//       }
//   }
// }


//       * * * * 
//      * * * *
//    * * * *
//  * * * *


// public class trianglefromRight {

//     public static void main(String[] args) {
//         int n = 4;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print("  ");
//             }

//             for (int j = 1; j <= n; j++) {
//                 System.out.print("*" + " ");
//             }
//             System.out.println("");

//         }
//     }
// }








// * * * * 
//   * * *
//     * *
//       *

public class trianglefromRight {

    public static void main(String[] args) {
        int n = 4;
         for (int i = n; i >= 1; i--)  {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* " + " ");
            }
            System.out.println("");

        }
    }
}
