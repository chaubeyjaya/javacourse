public class Fibonic{
    public static void main(String arg[]){
        
        int n = 10;
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}