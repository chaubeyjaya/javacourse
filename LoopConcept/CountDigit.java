// public class CountDigit{
//     public static void main(String[] args) {
//       int num = 123;
//         String str = Integer.toString(num);

//         System.out.println(str.length());
//     }
// }





/**
 * concept 
 jitni bar hm kissi number ko ten se divide krenge utne hi digit ka wo number hoga 
 ex:
 56132    ek bar 10 se divide kiya to 2 hata
 5613
 561
 56
 5
 0

 */
// public class CountDigit{
//     public static void main(String[] args) {
//      int n = 12987;
//      int count=0;
//      while(n!=0){
//       n=n/10;
//       count++;     count will check kitni baar loop chl rha 
 //
//      }
//      System.out.println(count);
//     }
// }



//sum of digit in number
/**
 * n=12345         n%10 give us last digit as a reminder like 5
                   and n/10 will give us 1234 again divide then give 123
 * sum=0;                
 */
public class CountDigit{
    public static void main(String[] args) {
     int n = 555;
     
     int sum = 0;
     while(n!=0){
      sum+=n%10;        //it give us last digit so we add the last digit in sum variableb
      n=n/10;               //it help to separe the last digit as we shown in above
         
     }
     System.out.println(sum);
    }
}