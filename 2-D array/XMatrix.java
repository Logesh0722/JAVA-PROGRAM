import java.util.Scanner;

public class XMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        boolean isXMatrix = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j || i + j == n - 1) {
                    if (arr[i][j] == 0) {
                        isXMatrix = false;
                    }
                } else {
                    if (arr[i][j] != 0) {
                        isXMatrix = false;
                    }
                }
            }
        }

        if (isXMatrix)
            System.out.println("true");
        else
            System.out.println("false");

        sc.close();
    }
}