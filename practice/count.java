public class count{
    public static void main(String[] args) {
        int n = 1234;
        int sum=0;
        int count=0;
        while(n!=0){
            int temp=n%10;
           sum+=temp;
           n=n/10;  
            count++;
        }
        System.out.println(count);
        System.out.println(sum);
    }
}