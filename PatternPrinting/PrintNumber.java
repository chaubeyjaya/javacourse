// 1 2 3 4 
// 1 2 3 4
// 1 2 3 4
// 1 2 3 4

//agar andr ki value diffrent hai to j lenge loop mai

// public class PrintNumber{
//     public static void main(String[] args) {
        
//         int n = 4;
//         for(int i = 1;i<=n;i++){
//             for(int j = 1;j<=n;j++){
//                 System.out.print(j +" ");
//             }
//             System.out.println("");
//         }
//     }
// }




// 1 1 1 1 1 
// 2 2 2 2 2 
// 3 3 3 3 3 
// 4 4 4 4 4 
// 5 5 5 5 5 
//agar andr ki value same hai to i lenge 
// public class PrintNumber{
//     public static void main(String[] args) {
        
//         int n = 5;
//         for(int i = 1;i<=n;i++){
//             for(int j = 1;j<=n;j++){
//                 System.out.print(i +" ");
//             }
//             System.out.println("");
//         }
//     }
// }




// A B C D E 
// A B C D E
// A B C D E
// A B C D E
// A B C D E
// public class PrintNumber{
//     public static void main(String[] args) {
        
//         int n = 5;
//         for(int i = 1;i<=n;i++){
//             for(int j = 1;j<=n;j++){
//                 System.out.print((char)(j+64) +" ");
//             }
//             System.out.println("");
//         }
//     }

// }



// a b c d e 
// a b c d e
// a b c d e
// a b c d e
// a b c d e

// public class PrintNumber{
//     public static void main(String[] args) {
        
//         int n = 5;
//         for(int i = 1;i<=n;i++){
//             for(int j = 1;j<=n;j++){
//                 System.out.print((char)(j+96) +" ");
//             }
//             System.out.println("");
//         }
//     }
// }



// A A A A A 
// B B B B B
// C C C C C
// D D D D D
// E E E E E

// public class PrintNumber{
//     public static void main(String[] args) {
        
//         int n = 5;
//         for(int i = 1;i<=n;i++){
//             for(int j = 1;j<=n;j++){
//                 System.out.print((char)(i+64) +" ");
//             }
//             System.out.println("");
//         }
//     }
// }



// a a a a a 
// b b b b b
// c c c c c
// d d d d d
// e e e e e

public class PrintNumber{
    public static void main(String[] args) {
        
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print((char)(i+96) +" ");
            }
            System.out.println("");
        }
    }
}