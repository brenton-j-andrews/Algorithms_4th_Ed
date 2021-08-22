public class one_one_eleven {
    public static void main(String[] args) {
        boolean[][] two_d_array = {{true, true, false, true}, {false, false, true, true}, {false, false, true, true}};
//      Print out column header numbers.
        System.out.print("  ");
        for (int j = 0; j < two_d_array[0].length; j++) {
            System.out.format("%d ", j);
        }
        System.out.println();
        for (int i = 0; i < two_d_array.length; i++) {
            System.out.format("%d ", i);
            for (int j = 0; j < two_d_array[0].length; j++) {
                if (two_d_array[i][j]) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}
