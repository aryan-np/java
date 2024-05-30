public class array_1 {
    public static void main(String[] args) {
        int great, small;
        int[] arr = { 1, 2, 3, 4, 5 };
        great = small = arr[1];
        for (int i : arr) {
            if (i > great) {
                great = i;
            }
            if (i < small) {
                small = i;
            }
        }
        System.out.printf("the greatest number is %d and smallest number is %d", great, small);
    }
}
