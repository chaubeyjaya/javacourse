public class toogleUppertolower {
    public static void main(String[] args) {
        String str = "JaVa123";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else {
                result += ch;
            }
        }

        System.out.println("Toggled string: " + result);
    }
}



/**
 * public class ToggleCase {
    public static void main(String[] args) {
        String str = "JaVa123";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32); // to uppercase
            } else if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32); // to lowercase
            } else {
                result += ch; // keep digits/special chars same
            }
        }

        System.out.println("Toggled string: " + result);
    }
}
 */