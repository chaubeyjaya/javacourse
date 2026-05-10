 public class findingUnMatchedPair {
    public static void main(String[] args) {

        String[][] pairs = {
            {"delhi", "mumbai"},
            {"pune", "delhi"},
            {"goa", "mumbai"},
            {"up", "rajasthan"}
        };

        for (int i = 0; i < pairs.length; i++) {

            int countStart = 0;
            int countEnd = 0;

            for (int j = 0; j < pairs.length; j++) {

                if (pairs[i][0].equals(pairs[j][1])) {
                    countStart++;
                }

                if (pairs[i][1].equals(pairs[j][0])) {
                    countEnd++;
                }
            }

            // must appear only once (itself)
            if (countStart == 0 && countEnd == 0) {
                System.out.println(pairs[i][0] + " -> " + pairs[i][1]);
            }
        }
    }
}