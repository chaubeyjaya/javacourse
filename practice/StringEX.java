


public class StringEX {

    public static void main(String[] args) {
 String s="mom";
 String rev="";
 for(int i=s.length()-1;i>=0;i--){
    char ch=s.charAt(i);
    rev+=ch;
 }
 System.out.println(rev);
 if(s.equals(rev)){
    System.out.println("yes it is palindrome");
 }else{
    System.out.println("nooo");
 }
    }
}
