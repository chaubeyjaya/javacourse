// //reverse of string builder
// public class StrinBuildeREV{
//     public static void main(String[] args) {
//         String s = "Jaya";
//         StringBuilder sb = new StringBuilder(s);
//         // sb.reverse();
//         // System.out.println(sb);

//         int i=0,j=sb.length()-1;
//         while(i<=j){
//             char temp1 = sb.charAt(i);
//             char temp2 = sb.charAt(j);
//             sb.setCharAt(i, temp2);
//             sb.setCharAt(j, temp1);
//             i++;
//             j--;
//         }
//         System.out.println(sb);


//     } 
// }




//reverse of string builder
public class StrinBuildeREV{
    public static void main(String[] args) {
        String s = "Jaya";
        StringBuilder sb = new StringBuilder(s);
        // sb.reverse();
        // System.out.println(sb);
// sb.deleteCharAt(1);
// sb.insert(1, 'e');
sb.delete(1, 3);
System.out.println(sb);
    } 
}