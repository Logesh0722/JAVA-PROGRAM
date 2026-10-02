import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements from 0 to " + n + ":");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int total = n * (n + 1) / 2;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        int missing = total - sum;

        System.out.println("Missing number = " + missing);

        sc.close();
    }
}