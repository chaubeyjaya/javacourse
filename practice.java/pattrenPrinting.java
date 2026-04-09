// public class pattrenPrinting{
//     public static void main(String[] args) {
//         int row =4;
//         int col = 4;
//         for(int i=1;i<=row;i++){
//             for(int j =1;j<=col;j++){
//                 System.out.print("*" +" ");
//             }
//             System.out.println("");
//         }
//     }
// }



// public class pattrenPrinting{
//     public static void main(String[] args) {
//         int row =3;
//         int col = 6;
//         for(int i=1;i<=row;i++){
//             for(int j =1;j<=col;j++){
//                 System.out.print("*" +" ");
//             }
//             System.out.println("");
//         }
//     }
// }


// public class pattrenPrinting{
//     public static void main(String[] args) {
//         int row =3;
//         int col = 6;
//         for(int i=1;i<=row;i++){
//             for(int j =1;j<=col;j++){
//                 System.out.print(j +" ");
//             }
//             System.out.println("");
//         }
//     }
// }



// public class pattrenPrinting{
//     public static void main(String[] args) {
//         int row =3;
//         int col = 6;
//         for(int i=1;i<=row;i++){
//             for(int j = 1;j<=col;j++){
//                 System.out.print((char)(i+64) +" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }


public class pattrenPrinting{
    public static void main(String[] args) {
        int row =3;
        for(int i=1;i<=row;i++){
            for(int j = 1;j<=row-i-1;j++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
}