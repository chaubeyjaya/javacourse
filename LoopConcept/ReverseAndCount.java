public class ReverseAndCount{
    public static void main(String[] args) {
        int n = 1234;
        int sum=0;
        int rev=0;
        while(n!=0){
            // sum+=n%10;
            // n=n/10;
            int temp = n%10;
            sum+=temp;
            rev=rev*10+temp;
            n=n/10;

        }
        System.out.println(rev);
        System.out.println(sum);
    }
}