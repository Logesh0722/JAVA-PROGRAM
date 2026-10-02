package Strings;

    import java.util.Scanner;

public class FindIndexOfFirstOccurrence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String haystack = sc.nextLine();

        System.out.print("Enter string to search: ");
        String needle = sc.nextLine();

        int index = haystack.indexOf(needle);

        System.out.println("Index of first occurrence = " + index);

        sc.close();
    }
}
