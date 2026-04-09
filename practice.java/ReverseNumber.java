public class ReverseNumber{
    public static void main(String[] args) {
        int n =1234;
        int rev = 0;
        int count=0;
        int sum =0;
        while(n!=0){
            int temp=n%10;
            sum+=temp;
             rev = rev*10+temp;//0
              n=n/10;   //n=12
              count++;
        }
        System.out.println(rev);
        System.out.println(count);
        System.out.println(sum);
        
    }
}