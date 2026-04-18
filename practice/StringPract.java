// public class StringPract{
//     public static void main(String[] args) {
//         // String s1="jaya";
//         // String s2="jaya";
//         // System.out.println(s1 == s2);

//         // String s3=new String("jaya");
//         // String s4=new String("jaya");
//         // System.out.println(s3==s4);



//     }
// }

//2nd concept builtin method
// public class StringPract{
//     public static void main(String[] args) {
//        String s="Jariya";
//        System.out.println(s.toUpperCase());
//        System.out.println(s.charAt(2));
//        System.out.println(s.endsWith("a"));

//     }
// }


//count vowel in string 
// public class StringPract{
//     public static void main(String[] args) {
//        String s="AjEufsUeio";
//       int count=0;
//       for(int i=0;i<=s.length()-1;i++){
//        String ls=s.toLowerCase();
//        char ch=ls.charAt(i);
//        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//        System.out.print(ch+"    ");
//        count++;
//        }
       
//       }
//       if(count==0){
//         System.out.println("no vowel found");
//       }else{
//         System.out.println(count);
//       }
     
//     }
// }


//checking palindrome
// public class StringPract{
//     public static void main(String[] args) {
//      String s="jaj";
//      boolean ispalindrome=true;
//      int i=0;
//      int j=s.length()-1;
//      while(i<=j){
//         if(s.charAt(i)!=s.charAt(j)){
//             ispalindrome=false;
//             break;
//         }
//         i++;
//         j--;
//      }
//      System.out.println(ispalindrome);
//      if(ispalindrome){
//         System.out.println("yes it is palnidrome");
//      }else{
//         System.out.println("no...");
//      }
    
//     }
// }






//reverse the string
// public class StringPract{
//     public static void main(String[] args) {
//      String s="mom";
//     String rev="";
//     for(int i=s.length()-1;i>=0;i--){
//         rev+=s.charAt(i);

//     }
//     System.out.println(rev);
//     System.out.println(s);

//     //this is only extension in reverse to check palindrome
//     if(s.equals(rev)){
//         System.out.println("yes it is palindrome");
//     }else{
//         System.out.println("no..");
//     }

//     }
// }


//substring of string
// class StringPract{
//     public static void main(String[] args) {
//         String s="gopi";
//         int n=s.length();
//         for(int i=0;i<n-1;i++){
//             for(int j=i+1;j<=n;j++){
//                 System.out.println(s.substring(i,j));
//             }
//         }

//     }
// }


