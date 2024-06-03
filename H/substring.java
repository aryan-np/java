import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence:");
        String inpuString = sc.nextLine();
        String[] inputArray = inpuString.split("");
        System.out.println();
        System.out.println("Enter the position you want the string from");
        int start = sc.nextInt();
        System.out.println("Enter the position you want to stop \n ***Leave blank if you want full string***");
        int endIndex = (inputArray.length);
        if (sc.hasNextInt()) {
            endIndex = sc.nextInt();
        }
        for (int i = start - 1; i < endIndex; i++) {
            System.out.print(inputArray[i]);
        }
        sc.close();
    }
}
