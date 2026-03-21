public class ReverseNumber{
    public static void main(String[] args) {
        int n = 1234;
        int rev=0;       //4321
        while(n!=0){
            int temp = n%10;
            rev= rev*10+temp;            //rev = rev * 10 + last_digit
            n=n/10;
            
        }
        System.out.println(rev);
    }
}