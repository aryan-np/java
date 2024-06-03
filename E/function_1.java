public class function_1 {
    static int greatest(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        int res = greatest(5, 7);
        System.out.println(res);
    }
}
