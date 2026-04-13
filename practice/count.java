// public class count{
//     public static void main(String[] args) {
//         int num =123123;
//         int count=0;
//         while(num!=0){
//             num=num/10;
//             count++;
//         }
//         System.out.println(count);

//     }
// }


//sum
// public class count{
//     public static void main(String[] args) {
//         int num =123;
//         int sum=0;
//         while(num!=0){
//            int temp=num%10;  //3
//            sum+=temp;
//            num=num/10;
//         }
//         System.out.println(sum);
//     }
// }


//reverse
// public class count{
//     public static void main(String[] args) {
//         int num = 123;
//         int rev = 0;
//         while(num!=0){
//            int temp=num%10;  //3
//            rev=rev*10+temp;   //32
//            num=num/10;
//         }
//         System.out.println(rev);
//     }
// }



//all together
public class count{
    public static void main(String[] args) {
        int num = 123;
        int rev = 0;
        int count=0;
        int sum=0;
        while(num!=0){
           int temp=num%10;  //3
           sum+=temp;  //3+2
           rev=rev*10+temp;   //32
           num=num/10;
          
           count++;
        }
        System.out.println(rev);
        System.out.println(count);
        System.out.println(sum);
    }
}