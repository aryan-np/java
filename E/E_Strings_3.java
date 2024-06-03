import java.util.Scanner;

public class E_Strings_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to convert in uppercase");
         String str = sc.nextLine();
        System.out.println(str.toUpperCase());
        sc.close();
    }
}
