import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of A and B to find LCM and GCD: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = a, y = b;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;
        int lcm = (x * y) / gcd;

        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);

        sc.close();
    }
}
