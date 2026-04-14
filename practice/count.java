

public class count {
    public static void main(String[] args) {
        int n = 1234;
        int count = 0;
int sum=0;
int rev=0;
        while(n != 0){
                 int temp=n%10;
                 rev=rev*10+temp;
                 sum+=temp;
                 n=n/10;
                 count++;
        }
        System.out.println(count);
        System.out.println(sum);
        System.out.println(rev);

       
    }
}