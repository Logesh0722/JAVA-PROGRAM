package Strings;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str = "Hello World";
        int length = lengthOfLastWord(str);
        System.out.println("Length of last word: " + length);
    }

    public static int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        String[] words = s.trim().split(" ");
        return words[words.length - 1].length();
    }
    
}
