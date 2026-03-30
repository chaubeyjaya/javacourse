import java.util.Arrays;

// in "jaya" → 'a' is most frequent
// sliding window approach after sorting
public class FrequentCharacter {

    public static char getMaxOccuringChar(String s) {
        int n = s.length();
        int maxFreq = -1;

        char ans = s.charAt(0);

        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        int i = 0, j = 0;

        while (j < n) {
            if (arr[i] == arr[j]) {
                j++;
            } else {
                int freq = j - i;

                if (freq > maxFreq) {
                    maxFreq = freq;
                    ans = arr[i];
                }
                i = j;
            }
        }

        // last group check
        int freq = j - i;
        if (freq > maxFreq) {
            maxFreq = freq;
            ans = arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "testsample";

        char result = getMaxOccuringChar(s);
        System.out.println("Most frequent character: " + result);
    }
}