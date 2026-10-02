package Strings;

    import java.util.Scanner;

public class FirstUniqueCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String s = sc.next();

        int[] count = new int[26];

        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                System.out.println("First unique character index = " + i);
                sc.close();
                return;
            }
        }

        System.out.println("First unique character index = -1");

        sc.close();
    }
}
