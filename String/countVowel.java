public class countVowel{
    public static void main(String[] args) {
        String s ="ssdfghbydqwertyoplavasdfghjk";
        int count=0;
       for(int i=0;i<s.length();i++){
        //char ch=s.charAt(i);
        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
            System.out.println(s.charAt(i));
            count++;
        }
       }
       System.out.println("total vowel "+count);
    }
}