import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Rows");
		int r = sc.nextInt();
		
		for (int i = 0; i < r; i++) {
            for (int j = i; j < r - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            for(int l=0;l<=i;l++) {
            	System.out.print("*");
            }
            System.out.println(); 
        }
        sc.close();
	}

}
