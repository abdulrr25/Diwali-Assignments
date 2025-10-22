import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers (from 0 to n, with one missing):");

        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int total = n * (n + 1) / 2;
        int missing = total - sum;

        System.out.println("The missing number is: " + missing);

        sc.close();
    }
}
