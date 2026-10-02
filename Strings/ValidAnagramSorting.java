package Strings;


    import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagramSorting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String s1 = sc.next();

        System.out.print("Enter second word: ");
        String s2 = sc.next();

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b))
            System.out.println("true");
        else
            System.out.println("false");

        sc.close();
    }
}
