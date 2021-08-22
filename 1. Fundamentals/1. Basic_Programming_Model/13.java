import java.util.Arrays;

public class one_one_thirteen {
    public static void main(String[] args) {
        boolean[][] two_d_array = {{true, true, true}, {true, false, false}, {false, true, false}};

        System.out.println(Arrays.deepToString(two_d_array));

        //  Declare new array to transpose to.
        boolean[][] new_array = new boolean[two_d_array.length][two_d_array[0].length];
        System.out.println(new_array.length);
        System.out.println(new_array[0].length);

        for (int i = 0; i < two_d_array.length; i++) {
            for (int j = 0; j < two_d_array[0].length; j++) {
                new_array[i][j] = two_d_array[j][i];
            }
        }

        System.out.println(Arrays.deepToString(new_array));
    }
}
