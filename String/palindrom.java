// public class palindrom {
//     public static void main(String[] args) {
//         String s = "mom";
//         String rev = "";

//         for (int i = s.length() - 1; i >= 0; i--) {
//             char ch = s.charAt(i);
//             rev += ch;
//         }

//         System.out.println(rev);

//         // check palindrome
//         if (s.equals(rev)) {
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("Not Palindrome");
//         }
//     }
// }




//methid 2
public class palindrom {
    public static void main(String[] args) {
        String s = "jaya";
        boolean isPalindrome = true;

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}