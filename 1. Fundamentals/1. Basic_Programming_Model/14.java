public class one_one_fourteen {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int count = lg(n);
        System.out.print(count);
    }

    private static int lg(int n) {
        int counter = 0;
        while (n > 1) {
            n = n / 2;          
            counter++;
        }
        return counter;
    }
}
