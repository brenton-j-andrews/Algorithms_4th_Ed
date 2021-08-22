import java.util.Arrays;

public class one_one_fifteen {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int m = 10;
        System.out.println(Arrays.toString(a));
        int[] b = histogram(a, m);
        System.out.println(Arrays.toString(b));

    }

    public static int[] histogram(int[] a, int m) {
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            // Search input array for int i and count any occurrences with counter variable.
            int counter = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) {
                    counter++;
                }
            }
            b[i] = counter;
        }
        return b;
    }
}
