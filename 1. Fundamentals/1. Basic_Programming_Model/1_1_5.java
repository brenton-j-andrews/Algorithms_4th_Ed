public class one_one_five {
    static boolean one_one_five_method(double I, double J) {
        return 1 > I && I > 0 && 1 > J && J > 0;
    }

    public static void main(String[] args) {
        double I = Double.parseDouble(args[0]);
        double J = Double.parseDouble(args[1]);
        System.out.println(one_one_five_method(I, J));
    }
}
