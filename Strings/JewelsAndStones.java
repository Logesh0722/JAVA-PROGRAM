package Strings;


    import java.util.Scanner;

public class JewelsAndStones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter jewels: ");
        String jewels = sc.next();

        System.out.print("Enter stones: ");
        String stones = sc.next();

        int count = 0;

        for (int i = 0; i < stones.length(); i++) {

            for (int j = 0; j < jewels.length(); j++) {

                if (stones.charAt(i) == jewels.charAt(j)) {
                    count++;
                    break;
                }
            }
        }

        System.out.println("Number of jewels in stones = " + count);

        sc.close();
    }
}