public class loops_3 {
    public static void main(String[] args) {
        int input_number = 453;
        int rem, rev = 0;
        while (input_number > 0) {
            rem = input_number % 10;
            rev = rev * 10 + rem;
            input_number /= 10;
        }
        System.out.println(rev);
    }
}
