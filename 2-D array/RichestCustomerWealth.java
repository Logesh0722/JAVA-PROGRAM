import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int maxWealth = 0;

        for (int i = 0; i < rows; i++) {

            int sum = 0;

            for (int j = 0; j < cols; j++) {
                sum = sum + arr[i][j];
            }

            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }

        System.out.println("Richest customer wealth = " + maxWealth);

        sc.close();
    }
}