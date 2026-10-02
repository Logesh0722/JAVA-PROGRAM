package Strings;

import java.util.Scanner;

public class ValidPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String str = sc.nextLine();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            while (left < right &&
                   !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }

            while (left < right &&
                   !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(str.charAt(left)) !=
                Character.toLowerCase(str.charAt(right))) {

                System.out.println("false");
                sc.close();
                return;
            }

            left++;
            right--;
        }

        System.out.println("true");

        sc.close();
    }
}
    

