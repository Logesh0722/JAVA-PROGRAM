package Strings;

    import java.util.Scanner;

public class IsomorphicStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.next();

        System.out.print("Enter second string: ");
        String t = sc.next();

        if (s.length() != t.length()) {
            System.out.println("false");
            sc.close();
            return;
        }

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (mapS[ch1] != mapT[ch2]) {
                System.out.println("false");
                sc.close();
                return;
            }

            mapS[ch1] = i + 1;
            mapT[ch2] = i + 1;
        }

        System.out.println("true");

        sc.close();
    }
}
