public class RemoveDuplicateCharcter {

    // Remove duplicate characters from string
    public static void main(String[] args) {

        String s = "programming";
        String res = "";

        for (int i = 0; i < s.length(); i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                res += s.charAt(i);
            }
        }

        System.out.println(res);
    }
}