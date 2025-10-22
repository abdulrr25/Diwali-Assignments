import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();
		
		if(n<0) {
			System.out.println("Number Should be Greater than 0");
		}
		else {
			int num=n,sum=0;
			while(n!=0) {
				int rem = n%10;
				sum+=rem;
				n=n/10;
			}
			System.out.println("Sum of Digits is "+sum);
		}
	}

}
