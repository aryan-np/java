import java.util.Scanner;

public class array_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements you want in the array: ");
        int numberOfElemnt = sc.nextInt();
        int[] arr = new int[numberOfElemnt];
        for (int i = 0; i < numberOfElemnt; i++) {
            System.out.println("Enter the array element: ");
            arr[i] = sc.nextInt();
        }
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int e : arr) {
            System.out.print(" " + e);
        }
        sc.close();
    }
}
