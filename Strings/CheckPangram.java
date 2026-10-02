package Strings;

    import java.util.Scanner;

public class CheckPangram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().toLowerCase();

        boolean[] present = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                present[ch - 'a'] = true;
            }
        }

        for (int i = 0; i < 26; i++) {

            if (!present[i]) {
                System.out.println("false");
                sc.close();
                return;
            }
        }

        System.out.println("true");

        sc.close();
    }
}
