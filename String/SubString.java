//substring means continus part of your string
// public class SubString{
//     public static void main(String[] args) {
//         String s="riyaJaya";
//         System.out.println(s.substring(2, 4));
//     }
// }



//print all substring
/**
 * s="gopi"
 * g,go,gop,gopi
 * o,op,opi
 * p,pi
 * i
 */
// print all substrings

public class SubString {
    public static void main(String[] args) {
        String s = "gopi";

        int n = s.length();

        for (int i = 0; i < n; i++) {          // starting index
            for (int j = i + 1; j <= n; j++) { // ending index
                System.out.println(s.substring(i, j)+" ");
            }
        }
    }
}