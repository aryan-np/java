import java.util.Scanner;

public class function_3 {
    static void reverseStringUsingRecursion(String text) {
        if (!text.isEmpty()) {
            reverseStringUsingRecursion(text.substring(1));
            System.out.print(text.charAt(0));

        }
    }

    static void reverseStringTwoPointer(String text) {
        System.out.println();
        int start = 0, end = text.length() - 1;
        char[] stringArray = text.toCharArray();
        char temp;
        while (start < end) {
            temp = stringArray[start];
            stringArray[start] = stringArray[end];
            stringArray[end] = temp;
            start++;
            end--;

        }
        System.out.println("Reverse=" + new String(stringArray));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String input = sc.nextLine();
        reverseStringUsingRecursion(input);
        reverseStringTwoPointer(input);
        sc.close();
    }
}
