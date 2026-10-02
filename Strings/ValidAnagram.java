package Strings;


    import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String s = sc.next();

        System.out.print("Enter second word: ");
        String t = sc.next();

        if (s.length() != t.length()) {
            System.out.println("false");
            sc.close();
            return;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int value : count) {
            if (value != 0) {
                System.out.println("false");
                sc.close();
                return;
            }
        }

        System.out.println("true");

        sc.close();
    }
}
