
//display the Ap =2,3,8,11 upto n term
//nth term      an = a+(n-1)d
    //          2+(n-1)-3
    //          2+3n-3
             //3n-1

// public class AirthmetcProgression{
//     public static void main(String[] args) {
//         int n = 10;
//         int m = 3*n-1;
//         for(int i=2; i<=m; i+=3){
//         System.out.print(i+" ");
//         }
//     }
// }



            
// public class AirthmetcProgression{
//     public static void main(String[] args) {
//         int n = 10;
//        int a = 2,d=3;
//         for(int i=1; i<=n; i++){
//         System.out.print(a+" ");
//         a+=d;
//         }
//     }
// }




  //4,10,16,22,28........         
// public class AirthmetcProgression{
//     public static void main(String[] args) {
//        int n = 10;
//        int a = 4,d=6;
//         for(int i=1; i<=n; i++){
//         System.out.print(a+" ");
//         a+=d;
//         }
//     }
// }

//99 95 91 87 83 79 75 71 67 63 59 55 51 47 43 39 35 31 27 23 19 15 11 7 3
public class AirthmetcProgression {
    public static void main(String[] args) {
       
        int a = 99, d = -4;

        for (int i = 1; a > 0; i++) {
            System.out.print(a + " ");
            a += d;
        }
    }
}