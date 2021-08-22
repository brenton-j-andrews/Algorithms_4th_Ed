public class one_one_three {
    public static void main(String[] args) {
        int A = Integer.parseInt(args[0]);
        int B = Integer.parseInt(args[1]);
        int C = Integer.parseInt(args[2]);
        if (A == B && B == C) {
            System.out.print("Equal\n");
        } else {
            System.out.print("Not equal\n");
        }
    }
}
