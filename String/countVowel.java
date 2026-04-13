// public class countVowel{
//     public static void main(String[] args) {
//         String s ="ssdfghbydqwertyoplavasdfghjk";
//         int count=0;
//        for(int i=0;i<s.length();i++){
//         //char ch=s.charAt(i);
//         if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
//             System.out.println(s.charAt(i));
//             count++;
//         }
//        }
//        System.out.println("total vowel "+count);
//     }
// }



public class countVowel {
    public static void main(String[] args) {
        String s ="ssdfghbydqwertyoplavasdfghjk";
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.print(ch +" ");
                count++;
            }
        }

        if(count == 0){
            System.out.println("No vowels found");
        } else {
            System.out.print("total vowel = " + count);
        }
    }
}