/**
 * display this GP=1,2,4,8 ...upto n term
 */


// public class GpSeries{
//     public static void main(String[] args) {
//         int n = 5;
//         int a =1;
//         int r = 2;
//         for(int i = 1;i<n;i++){
//             System.out.print(a +" ");
//             a*=r;
//         }

//     }
// }



//1 10 2 9 3 8 4 7 5 6  print t his
public class GpSeries{
    public static void main(String[] args) {
       int n = 10;
       for(int i = 1;i<=n;i++){
        System.out.print(i+" ");
        System.out.print(n +" ");
        n--;
       }

    }
}