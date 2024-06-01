
//program to calculate sum of all numbers in array
import java.util.Scanner;

public class array_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements you want in the array: ");
        int numberOfElemnt = sc.nextInt();
        int[] arr = new int[numberOfElemnt];
        for (int i = 0; i < numberOfElemnt; i++) {
            System.out.println("Enter the array element: ");
            arr[i] = sc.nextInt();
        }
        float sum = 0f;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("the sum is:" + sum);
        sc.close();
    }
}
