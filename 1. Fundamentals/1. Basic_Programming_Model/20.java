public class one_one_twenty {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        System.out.print(ln(a));
    }

    public static double ln(int a) {
        if (a == 1) return 0;
        return Math.log(a) + ln(a - 1);
    }
}
