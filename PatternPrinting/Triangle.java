// * 
// * *
// * * *
// * * * *


// public class Triangle{
//     public static void main(String[] args) {
//         int n = 4;
//         for(int i =1;i<=n;i++){
//             for(int j =1;j<=i;j++){
//                 System.out.print("*" +" ");
//             }
//             System.out.println("");
//         }
//     }
// }




// 1 
// 1 2
// 1 2 3
// 1 2 3 4

// public class Triangle{
//     public static void main(String[] args) {
//         int n = 4;
//         for(int i =1;i<=n;i++){
//             for(int j =1;j<=i;j++){
//                 System.out.print(j +" ");
//             }
//             System.out.println("");
//         }
//     }
// }


// 1 
// 2 2
// 3 3 3
// 4 4 4 4

// public class Triangle{
//     public static void main(String[] args) {
//         int n = 4;
//         for(int i =1;i<=n;i++){
//             for(int j =1;j<=i;j++){
//                 System.out.print(i +" ");
//             }
//             System.out.println("");
//         }
//     }
// }



// A 
// A B
// A B C
// A B C D


// public class Triangle{
//     public static void main(String[] args) {
//         int n = 4;
//         for(int i =1;i<=n;i++){
//             for(int j =1;j<=i;j++){
//                 System.out.print((char)(j+64) +" ");
//             }
//             System.out.println("");
//         }
//     }
// }


// a 
// a b
// a b c
// a b c d

// public class Triangle{
//     public static void main(String[] args) {
//         int n = 4;
//         for(int i =1;i<=n;i++){
//             for(int j =1;j<=i;j++){
//                 System.out.print((char)(j+96) +" ");
//             }
//             System.out.println("");
//         }
//     }
// }


// a 
// b b
// c c c
// d d d d

// public class Triangle{
//     public static void main(String[] args) {
//         int n = 4;
//         for(int i =1;i<=n;i++){
//             for(int j =1;j<=i;j++){
//                 System.out.print((char)(i+96) +" ");
//             }
//             System.out.println("");
//         }
//     }
// }




// 1 
// A B
// 1 2 3
// A B C D
// 1 2 3 4 5

// public class Triangle{
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i =1;i<=n;i++){
         
//              for(int j =1;j<=i;j++){
//                  if(i%2!=0){
//                 System.out.print(j +" ");
//                  }else{
//                      System.out.print((char)(j+64) +" ");
//                  }
                 
//            }
//             System.out.println("");
//         }
//     }
// }


public class Triangle{
    public static void main(String[] args) {
        int n = 4;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print((char)(i+96) +" ");
            }
            System.out.println("");
        }
    }
}
