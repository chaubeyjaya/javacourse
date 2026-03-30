public class StringBuildeEx{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("jaya");
        System.out.println(sb);
        sb.append("chaubey");
        System.out.println(sb);
        System.out.println(sb.length()+" "+sb.capacity());
        sb.setCharAt(2, 'r');
        System.out.println(sb);
    }
}