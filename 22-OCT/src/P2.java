import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number to get its table");
		int n= sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+(n*i));
		}
	}

}
