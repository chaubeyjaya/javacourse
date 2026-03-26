public class kSmallestElem {

    public static void print(int arr[]) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {2, 15, 3, 12, 5};
        int n = arr.length;
        int k = 4;

        for (int i = 0; i < k; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;

            // find smallest from i to end
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindx = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }

        // print k-th smallest element
        System.out.println("Kth smallest element: " + arr[k - 1]);
    }
}