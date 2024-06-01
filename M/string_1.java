import java.util.Scanner;

public class string_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a word:");
        String inputString = sc.nextLine();
        System.out.println("Enter Letter You Want To Find:");
        String findString = sc.nextLine();
        String[] inputArray = inputString.split("");
        int count = 0;
        for (String chr : inputArray) {
            count += 1;
            if (chr.equals(findString)) {
                System.out.printf("the \"%s\" is presennt at %d position", findString, count);
                break;
            }
        }
        sc.close();

    }
}
