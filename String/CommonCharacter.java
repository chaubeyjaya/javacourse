 class CommonCharacter{
 public static void main(String[] args) {
     String str1="programing";
     String str2="gaming";
     for(int i=0;i<=str1.length()-1;i++){
        char ch = str1.charAt(i);
        for(int j=0;j<=str2.length()-1;j++){
            if(ch==str2.charAt(j)){
                System.out.print(ch+" ");
                break; //for avioding reapting 
            }
        }
     }
 }
}