public class Countdigit{
    public static void main(String[] args) {
        int n = 12;
        int count = 0;
        for(int i = 0;i<=n;i++){
         n=n/10;
         count++;
        }
        System.out.println(count);
    }
}